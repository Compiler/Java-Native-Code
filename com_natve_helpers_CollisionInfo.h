/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_natve_helpers_CollisionInfo */

#ifndef _Included_com_natve_helpers_CollisionInfo
#define _Included_com_natve_helpers_CollisionInfo
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_natve_helpers_CollisionInfo
 * Method:    distanceFrom
 * Signature: (FFFF)F
 */
JNIEXPORT jfloat JNICALL Java_com_natve_helpers_CollisionInfo_distanceFrom
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_natve_helpers_CollisionInfo
 * Method:    angleInRadians
 * Signature: (FFFF)F
 */
JNIEXPORT jfloat JNICALL Java_com_natve_helpers_CollisionInfo_angleInRadians
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_natve_helpers_CollisionInfo
 * Method:    angleInDegrees
 * Signature: (FFFF)F
 */
JNIEXPORT jfloat JNICALL Java_com_natve_helpers_CollisionInfo_angleInDegrees
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_natve_helpers_CollisionInfo
 * Method:    intersectsWithSquare
 * Signature: (FFFFF)Z
 */
JNIEXPORT jboolean JNICALL Java_com_natve_helpers_CollisionInfo_intersectsWithSquare
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
* Class:     com_natve_helpers_CollisionInfo
* Method:    intersectsWithCircle
* Signature: (FFFFFF)Z
*/
JNIEXPORT jboolean JNICALL Java_com_natve_helpers_CollisionInfo_intersectsWithCircle
(JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

#ifdef __cplusplus
}
#endif
#endif
