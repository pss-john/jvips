//
// Created by x99 on 12/7/22.
//
#include <jni.h>
#include <vips/vips.h>
#include <string>
#include <vector>
#include "ValueHandler.h"
#include "jvips.h"

using namespace std;
template <class T>

class AbstractValueHandler {
    protected:
        jmethodID factory;
        jclass clazz;
        jfieldID field;
        GType type;
    public:
        AbstractValueHandler(GType type)
                :  type(type) {

        }

    public:
        bool handleValue(JNIEnv *env, vector<VipsArea*> &allocations, VipsOperation *op, GValue *gvalue,
                         Argument &argument) {
            vips_argument_map(op, [](VipsObjectClass *object_class,
                                     GParamSpec *pspec,
                                     VipsArgumentClass *argument_class, void *a, void *b){

            });
            if(env->IsInstanceOf(argument.value, clazz)){
                T v = getValue(env, argument.value, allocations);
                g_value_init(gvalue, type);
                setValue(gvalue, &v);
                g_object_set_property(G_OBJECT(op), argument.name->c_str(), gvalue);
                g_value_unset(gvalue);
            }
            return false;
        }

        virtual jobject box(JNIEnv *env, T value) {}

        virtual void setValue(GValue *gvalue, T value){}

        virtual T getValue(JNIEnv *env, jobject obj, vector<VipsArea*> &allocations);

};

class JLong : AbstractValueHandler<jlong> {
    public:
        explicit JLong() : AbstractValueHandler(G_TYPE_LONG) {}

        void setValue(GValue *gvalue, jlong value) override {
            g_value_set_long(gvalue, value);
        }

        jlong getValue(JNIEnv *env, jobject obj, vector<VipsArea*> &allocations) override {
           return env->GetLongField(obj, field);
        }

        jobject box(JNIEnv *env, jlong obj) override {
           return env->CallStaticObjectMethod(clazz, factory, *obj);
        }
};

class JInt : AbstractValueHandler<jint> {
    public:
        explicit JInt() : AbstractValueHandler(G_TYPE_INT) {}

        void setValue(GValue *gvalue, jint value) override {
            g_value_set_int(gvalue, value);
        }

        jint getValue(JNIEnv *env, jobject obj, vector<VipsArea*> &allocations) override {
           return env->GetIntField(obj, field);
        }

        jobject box(JNIEnv *env, jint obj) override {
           return env->CallStaticObjectMethod(clazz, factory, obj);
        }
};

class JDouble : AbstractValueHandler<jdouble> {
    public:
        explicit JDouble() : AbstractValueHandler(G_TYPE_DOUBLE) {}

        void setValue(GValue *gvalue, jdouble value) override {
            g_value_set_double(gvalue, value);
        }

        jdouble getValue(JNIEnv *env, jobject obj, vector<VipsArea*> &allocations) override {
           return env->GetDoubleField(obj, field);
        }

        jobject box(JNIEnv *env, jdouble obj) override {
           return env->CallStaticObjectMethod(clazz, factory, obj);
        }
};

class VipsArrayDoubleHandler : AbstractValueHandler<VipsArrayDouble*> {

        jobject box(JNIEnv *env, VipsArrayDouble *value) override {
            auto vad = env->NewDoubleArray(value->area.n);
            env->SetDoubleArrayRegion(vad, 0, value->area.n, (const jdouble *) value->area.data);
            return vad;
        }

        void setValue(GValue *gvalue, VipsArrayDouble* value) override {
            g_value_set_object(gvalue, value);
        }

        VipsArrayDouble *getValue(JNIEnv *env, jobject obj, vector<VipsArea*> &allocations) override {
            auto length = env->GetArrayLength((jdoubleArray) obj);
            jboolean isCopy;
            auto doubles = env->GetDoubleArrayElements((jdoubleArray) obj, &isCopy);
            auto vipsArray = vips_array_double_new(doubles, length);
            env->ReleaseDoubleArrayElements((jdoubleArray) obj, doubles, 0);
            allocations.push_back(VIPS_AREA(vipsArray));
            return vipsArray;
        }
};