# libuvc4j

A "batteries included" libuvc binding for Java.

* Runtime support by [BridG](https://github.com/nativelibs4java/BridJ).
* API generated with [JNAerator](https://github.com/nativelibs4java/JNAerator).
* Bundled libusb and libuvc binaries, packaged by [OpenPnP](http://openpnp.org). 

## Maven
 

## Rebuilding

Originally generated using:

`java -jar jnaerator/target/jnaerator-0.13-SNAPSHOT-shaded.jar -library uvc /usr/local/include/libuvc/libuvc.h -o ../openpnp/libuvc4j -v -mode Maven -mavenGroupId org.openpnp -mavenArtifactId libuvc4j -package org.openpnp.libuvc4j`

## Notes

### libuvc on Mac with Homebrew

Installing libuvc via brew results in a library that doesn't find manufacturer
and product names. In addition, it is not configured with JPEG support by
default. Installing it with `brew install libuvc --HEAD --width-jpeg` resolves
these issues.
