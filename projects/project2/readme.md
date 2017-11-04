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

Both IDEA and Eclipse have a plugin for Gradle.


# Input/Output Format

You don't need to implement the main method this time. Input is directly fed to the constructor of `PageRank`.

For example,
```
new PageRank(5, {1,2,3}, {0,0,0})
```
means the graph has five vertices, `0, 1, 2, 3, 4`, and three directed edges, `1->0, 2->0, 3->0`.

The output should be printed to `System.out`, in order by vertex index. If vertex 0 has pagerank `0.5`, and others have `0.125`, the output should be
```
0.5
0.125
0.125
0.125
0.125
```
It should not print anything else to `System.out` after the result is printed, which means the last `size` nonempty lines should be the output of your program.


# Requirements

- With multiple runs, your program should have stable output and stable runtimes.
- You should not use `Thread.sleep` as a workaround for synchronization issues.
