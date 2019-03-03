# Samples code for [javax.io](https://javax.io)
To share executable java function on javax.io just check-in code to this repo. There is a daily build process pickup source from this repository, runs tests and publish to the site. In this example: **templates** and **tutorials** are 2 collections.

## A collection
A collection is a maven java project, where each class either have a **main(...)** method or implements **java.util.function.Function**. The JavaX supports OpenJDK 1.8.0, Guava 23.0, Jackson 2.9.6. Custom stack will be supporting as well.

## A function
An executable java class + an overview in marked down format. A marked down has to have summary section describe how a function should be display on javax.io. Using javax-summary code block, similar to

```javax-summary
{
    "title":"Hello Function",
    "description":"",
    "input": ""
}
```
