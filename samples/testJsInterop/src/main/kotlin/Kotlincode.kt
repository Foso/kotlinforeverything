import kotlinx.browser.window

val testString = "Hello World in Kt"

fun ktHelloWorldAlert():Boolean{
    window.alert("This is ktHelloWorldAlert "+testString)
    return true
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

