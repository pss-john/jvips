//
// Created by x99 on 1/21/23.
//
#include "utils.h"

VipsImage* fromVoid(void* target){
    return (VipsImage*) target;
}

VipsImage* fromJLong(jlong target){
    return fromVoid((void*) target)
}