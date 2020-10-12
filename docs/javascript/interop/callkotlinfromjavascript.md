# Call Kotlin Code from JavaScript

Let's say you have a gradle module called **testjsinterop** and a file KotlinCode.kt with the code below :

```kotlin
//KotlinCode.kt
import kotlinx.browser.window

var testString = "Hello World in Kt"

fun ktHelloWorldAlert(){
    window.alert("This is ktHelloWorldAlert "+testString)
}

@JsExport
fun ktHelloWorldAlertWithParameter(text:String){
    window.alert("This is ktHelloWorldAlertWithParameter "+text)
}

class MyTestClass(){
    fun sayHelloWorld(){
        window.alert("HelloWorld")
    }
}
```

Now you want to use the call the code inside your test.js.

## top level

### var/val
When you want to use a top level var or val from your Kotlin file inside JavaScript, you need to prefix it with the module name. 
In this example the module name is testjsinterop

```javascript
//Inside your javascript file
testjsinterop.testString
```

### function
When you want to use a top level function from your Kotlin file, you need to prefix it with the module name. 
In this example the module name is testjsinterop

* Without Parameters

```javascript
//Inside your javascript file
testjsinterop.ktHelloWorldAlert();
```

* With Parameters

When your top level function needs parameters, you need to annotate your Kotlin function with @JsExport

```javascript
//Inside your javascript file
testjsinterop.ktHelloWorldAlertWithParameter("Hello");
```

## class
```javascript
//Inside your javascript file
new testjsinterop.MyTestClass().sayHelloWorld();
```