var jsTestString = "Hello World in Js";


alert("This is alert in test.js "+testjsinterop.testString);
testjsinterop.ktHelloWorldAlert();

testjsinterop.ktHelloWorldAlertWithParameter("Hello");
alert(jsTestString);

function showAlert() {
        alert("showAlert");

}

new testjsinterop.MyTestClass().sayHelloWorld();