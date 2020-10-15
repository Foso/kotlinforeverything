# Dynamic

Dynamic is a data type that can be used when you need to interop with dynamically typed objects from JavaScript.
The type checker is turned off for values with a dynamic types. 

## How to declare a dynamic type?
You can use the **dynamic** type like any other type.

```kotlin
var testVar : dynamic
var testArray = arrayOf<dynamic>();

fun test(dynValue:dynamic){

}
```

## Cast to dynamic
When you want to cast a typed value to the dynamic type, you can use the **asDynamic()** extension function.

```kotlin
var testIntvalue = 3
var dynamicValue = testInt.asDynamic() //This will cast testIntvalue to a dynamic type
```

## Use a dynamic value
You can use an object with a **dynamic** type like any other object. The only difference is that you can append any text after the object, the compiler will not check if it really exists or if the syntax is correct.

This means that this will perfectly compile.

```kotlin
//In Kotlin Code
myDynamicValue.thisFunctionDoesNotExist()
```

And it will be written as such inside the generated js file

```javascript
//In js file
myDynamicValue.thisFunctionDoesNotExist()
```

