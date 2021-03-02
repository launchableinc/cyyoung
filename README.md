# Cy Young
If you could only throw any exception anywhere!  Now you can.

In Java, the following code does not compile without the `foo()` method declaring `throws IOException`: 
```
public void foo() {
    throw new IOException("..."); // unhandled exception
}
```

With Cy Young, you can work around that:
```
public void foo() {// look ma, no throws clause
    CyYoung.pitch(new IOException("..."));
}
```

Handy when you are squeezed between a rock and a hard place, but use this at your own risk.
I needed this where I'm interacting with other JVM languages that throw
checked exceptions without enforcing the throws clause, and hey, it's nifty, right?
