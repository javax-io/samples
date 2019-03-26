```javax-snippet
{
    "title":"Data Types",
    "description":"",
    "input": [""],
    "tags" : ["princeton", "introcs"]
}
```
### Data Types
The Java language is statically-typed. All variables must be declared first before they can be used. This involves stating the variable's type and name. For example:

```
int i = 10;
```
This tells the compiler that the variable `i` has inital value of `10`. There are eight primitive data types supported:

**byte**
>The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).

**short**
>The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).

**int**
>By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.

**long**
>The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1.

**float**
>The float data type is a single-precision 32-bit IEEE 754 floating point.

**double**
>The double data type is a double-precision 64-bit IEEE 754 floating point.

**boolean**
>The boolean data type has only two possible values: true and false.

**char**
>The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

**String**
>In addition the Java programming language also provides special support for character strings via the `java.lang.String` class. Enclosing your character string within double quotes will automatically create a new String object. For example:

```
String s = "this is a string";
```

String objects are immutable, which means that once created, their values cannot be changed.