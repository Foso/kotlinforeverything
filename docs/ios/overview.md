# Kotlin For iOS

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