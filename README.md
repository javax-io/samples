# Samples code for [javax.io](https://javax.io)
To share executable java function on javax.io just check-in code to this repo. There is a daily build process pickup source from this repository, runs tests then publish to the site. In this example: **templates** and **tutorials** are 2 collections, few more are in progress.

## A collection
A collection is a maven java project, where each class either have a **main(...)** method or implements **java.util.function.Function**. The JavaX supports OpenJDK 1.8.0, Guava 23.0, Jackson 2.9.6. Custom stack will be supporting as well.

## A function
An executable java class + an overview in marked down format. A marked down has to have summary section describe how a function should be display on javax.io. Using javax-meta code block, similar to

```javax-meta
{
    "title":"Hello Function",
    "description":"",
    "input": ""
}
```

## Coding topics
- Basic java language
- Open source courses (MIT, Standford...)
- Tutorials for popular java libraries: Guava, Jersey, Guice, ...
- Basic and Advance algorithms, ex: [Algorithm design manual](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.471.4772&rep=rep1&type=pdf), [Topcoder tutorials](https://www.topcoder.com/community/competitive-programming/tutorials), [Princeton code](https://introcs.cs.princeton.edu/java/code)
- Popular interview questions

## Produce code example
Code example is manually written at the moment, follow these steps to have good content:
- Start with a good topic from book, web...
- Summary the topic in md file with **Origin** link
- Summary the source code
- Tags

## Request for new runtime/stack
By default [javax.io](https://javax.io) just supports *java8 + guava + jackson + guice + jaxrs*. Any sample code requires different library need to submit a request for new stack to be build.

## Similar coding places
We are not anywhere competing with these sites in coding stuff. However, it's good to know:
- [Edabit](https://edabit.com)
- [CoderByte](https://coderbyte.com)
- [InterviewBit](https://www.interviewbit.com)
- [CareerCup](https://careercup.com)
