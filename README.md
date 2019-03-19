# Samples code for [javax.io](https://javax.io)
To share executable java function on javax.io just check-in code to this repo. There is a daily build process pickup source from this repository, runs tests and publish to the site. In this example: **templates** and **tutorials** are 2 collections.

## A collection
A collection is a maven java project, where each class either have a **main(...)** method or implements **java.util.function.Function**. The JavaX supports OpenJDK 1.8.0, Guava 23.0, Jackson 2.9.6. Custom stack will be supporting as well.

## A function
An executable java class + an overview in marked down format. A marked down has to have summary section describe how a function should be display on javax.io. Using javax-snippet code block, similar to

```javax-snippet
{
    "title":"Hello Function",
    "description":"",
    "input": ""
}
```

### Coding topics
- Basic java language
- Open source courses (MIT, Standford...)
- Tutorials for popular java libraries: Guava, Jersey, ...
- Basic and Advance algorithms
- Popular interview questions

### Produce code example
Code example is manually written at the moment, follow these steps to have good content:
- Start with a good topic from book, web...
- Summary the topic in md file with **Origin** link
- Summary the source code
- Tags
