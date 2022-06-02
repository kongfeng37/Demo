//
// Created by kongfeng on 2022/6/2.
//
#include "android/log.h"
#include "jniwork.h"

static const char *TAG="jniwork";
#define LOGI(fmt, args...) __android_log_print(ANDROID_LOG_INFO,  TAG, fmt, ##args)
#define LOGD(fmt, args...) __android_log_print(ANDROID_LOG_DEBUG, TAG, fmt, ##args)
#define LOGE(fmt, args...) __android_log_print(ANDROID_LOG_ERROR, TAG, fmt, ##args)

extern "C"
JNIEXPORT void JNICALL Java_com_megvii_jnidemo_handler_NativeWorker_sayHello
        (JNIEnv *env, jobject obj) {
    LOGD("I want to say %s", "Hello!");
}