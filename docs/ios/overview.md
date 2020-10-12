# Kotlin For iOS

https://kotlinlang.org/docs/tutorials/native/apple-framework.html

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