# js()
The **js()** function can be used when you want to use specific javascript code where you dont`t know how to write it with KotlinJs.

js() takes an String as an argument. Anything that you will write in this String, will be written as such inside the js file. 
The compiler will not check if the code inside the String is legit.

This inside your Kotlin Code:
```kotlin
fun myFun(){
   js("alert(\"Hello World\")";)
}
```

will be compiled as this, in your js file:

```kotlin
function myFun(){
   alert("Hello World")
}
```

