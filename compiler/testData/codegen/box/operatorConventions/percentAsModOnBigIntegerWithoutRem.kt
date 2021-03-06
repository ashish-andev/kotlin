// TARGET_BACKEND: JVM

// LANGUAGE_VERSION: 1.0
// FULL_JDK

import java.math.BigInteger

fun box(): String {
    val m = BigInteger.valueOf(-2) % BigInteger.valueOf(3)
    return if (m != BigInteger.valueOf(1)) "Fail: BigInteger(-2) mod BigInteger(3) == $m" else "OK"
}