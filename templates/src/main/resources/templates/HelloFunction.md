```javax-snippet
{
    "title":"Hello Function",
    "description":"",
    "input": ""
}
```
### Quick starts
This is a simple program just prints out **Hello Function!** when executed. Here is the break down of source code structure.

**Package**
>package is optional but highly recommended to have one.

```
package templates;
```

**Import**
>All dependencies being use by the program using import keyword

```
import java.util.function.Function;
```

**Class**
>A main class with public keyword and extends `java.util.function.Function` function

```
public class HelloFunction implements Function<String, String> {
    @Override
    public String apply(String t) {
    }
}
```

**Comments**
>Comments are ignored by the compiler but are useful to other programmers

```
/* block comment */
/** documentation comment */
// single line comment
```

**Run program**
>It's supper easy to just click **Run** button. Depends on yours function, extra parameters might be needed. Just click **Input** button to enter a [json](https://www.json.org) object.

**Code assistant**
>Code assistant is automatically activate when you typing `.` or `@`. To activate manually, press **Ctrl + Space**

**Save program**
>Changes to your code is automatically saved to browser local storage.

### Learning the language
Some good resources can help you get started:

* [Java™ Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
* [Introduction to Programming in Java](https://introcs.cs.princeton.edu/java/home)