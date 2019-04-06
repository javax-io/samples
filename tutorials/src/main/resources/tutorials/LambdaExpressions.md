```javax-meta
{
    "title":"Lambda Expressions",
    "description":"",
    "input": ["abc", "a", "b", "ab"],
    "tags" : ["oo"]
}
```
### Lambda Expressions
Lambda expression is an express of an instance of a single abstract method interface as a function. It's a modernize way of using anonymous class to implement that same interface.

**Syntax**
>A comma-separated list of formal parameters enclosed in parentheses, the arrow token `->` and a body, which consists of a single expression or a statement block

```
//define a runnable lambda function
Runnable hello = () -> System.out.println("Hello World");
//invoke run
hello.run();
```