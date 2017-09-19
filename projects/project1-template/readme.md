# Build

Compile and test
```
./gradlew build
```

Compile only
```
./gradlew assemble
```

Test
```
./gradlew test
```

For those who use Windows, you should run `gradlew.bat` with the same parameters.

Both IDEA and Eclipse have plugins for Gradle.

Some existing tests need Java 8.


# Code location

`src/main/java` is for word count code.

`src/test/java` is for tests. And `src/test/resources` is for test data.

In most cases, adding or modifying files in other places is not necessary.


# Directions

Interface `Master` and class `WordCount` are already here.
`WordCount` should implement `Master` and have a constructor taking an integer (number of workers)
and array of strings (file paths) as input. There is documentation for every method of `Master`.
You should read them before implementing.

There are two basic tests here.
These tests should be passed before submission (class `TestUtil` can be modified
if there is error due to platform-dependent methods).
You may also want to add more tests, like larger files, unicode content, fault tolerance, etc.

You shouldn't use `Process.isAlive` to detect whether a worker is dead.



