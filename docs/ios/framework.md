# Framework

https://kotlinlang.org/docs/tutorials/native/apple-framework.html

# Where is the compiled framework located?
You can find the framework inside **build/xcode-frameworks**

# How to set the framework name?

```kotlin
iosX64('ios') {
        binaries {
            framework {
                baseName = 'shared'
            }
        }
    }
```