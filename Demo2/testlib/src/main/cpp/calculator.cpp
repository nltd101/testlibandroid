#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_datnlt_testlib_Calculator_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_datnlt_testlib_Calculator_Sum(JNIEnv *env, jobject thiz, jint a, jint b) {
    return a+b;
}