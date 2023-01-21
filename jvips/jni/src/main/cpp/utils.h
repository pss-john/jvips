//
// Created by x99 on 1/21/23.
//

#ifndef JVIPS_JNI_UTILS_H
#define JVIPS_JNI_UTILS_H

#include <vips/vips.h>
#include <jni.h>
#ifdef __cplusplus
extern "C" {
#endif
VipsImage *fromVoid(void *target);

VipsImage *fromJLong(jlong target);
#ifdef __cplusplus
}
#endif
#endif //JVIPS_JNI_UTILS_H
