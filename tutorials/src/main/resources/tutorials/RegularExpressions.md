```javax-snippet
{
    "title":"Regular Expressions",
    "description":"",
    "input": ["foo", "foofoofoo"],
    "tags" : ["oo", "regex"]
}
```
### Regular Expressions
Regular expressions are a way to describe a set of strings based on common characteristics shared by each string in the set. They can be used to search, edit, or manipulate text and data. It's represented by `java.util.regex` package.

**Pattern**
>A compiled representation of a regular expression. A specified string must first be compiled into an instance of this class. The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences against the regular expression.

```
Pattern p = Pattern.compile("a*b");
```

**Matcher**
>An engine that performs match operations on a character sequence by interpreting a Pattern.

```
Matcher m = p.matcher("aaaaab");
boolean b = m.matches();
```

**PatternSyntaxException**
>Unchecked exception thrown to indicate a syntax error in a regular-expression pattern.
