# Dependencies

## NPM
With the **kotlin.js** or **kotlin.multiplatform** gradle plugin, you can add JS dependencies from NPM in your gradle file

You can add them inside the dependencies block of js gradle configuration

```groovy
//build.gradle
dependencies{
    implementation(npm('react', '16.13.1'))
}
```  

The downloaded npm modules will be saved under **/build/js/node_modules**
