# Call JavaScript from Kotlin

## var
```javascript
var jsTestString = "Hello World in Js";
```

```kotlin
external var jsTestString : dynamic
```

```kotlin
external var jsTestString : String
```

## function
```javascript
var myJsAlertFunction = function(){
    alert("Hello World");
}
```

```kotlin
external fun myJsAlertFunction()
```

```javascript
var myJsAlertFunction = function(text){
    alert(text);
}
```

```kotlin
external fun myJsAlertFunction(text:String)
external fun myJsAlertFunction(text:dynamic)

```