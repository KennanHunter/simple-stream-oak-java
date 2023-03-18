#include <iostream>
#include "jni_SimpleStreamServer.h"

JNIEXPORT jstring JNICALL Java_jni_SimpleStreamServer_bar(JNIEnv *env, jobject thisObject)
{
  std::string res("bar");
  return env->NewStringUTF(res.c_str());
}