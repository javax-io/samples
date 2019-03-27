```javax-snippet
{
    "title":"Arrays",
    "description":"",
    "input": ["5"],
    "tags" : ["oo"]
}
```
### Arrays
An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed. Each item in an array is called an element, and each element is accessed by its numerical index in range of *[0, length)*

**Declaring an array**

```
// declaring an array of type double
double[] array
```

```
// this form is discouraged
double array[]
```

**Creating an array object**

```
//create an array of 10 elements
array = new double[10]
```

**Accessing an array element**

```
//get array length
int len = array.length

//set a value to an element at index position 3
array[3] = 1.0

//get value from an element at index position 5
double v = array[5]
```

**Copying Arrays**
>Using System.arraycopy to efficiently perform the copy, alternately a for loop would do the job as well.
