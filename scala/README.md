# Scala

In the file **main.scala**, you will find 4 tasks. Each task consists of a task description, a declared function body, and a description of the returned values.
The tasks are expected to be written according Scala 3.3.1 syntax. 

## Preconditions

To work on the tasks in Scala, you need to install [Scala CLI](https://scala-cli.virtuslab.org/install/) tool.

**Scala CLI** combines all the features you need to compile the tasks and run tests.

While you are free to use other tools, it’s recommended to preserve the files structure and Scala CLI directives (lines starting with //> at the beginning of a file).

Here are some useful links for setting up your preferred IDE:

### VSCode ###
  [How to configure VSCode](https://scalameta.org/metals/docs/editors/vscode/)

  [How to setup the tasks for VSCode](https://scala-cli.virtuslab.org/docs/cookbooks/ide/vscode)

### IntelliJ IDEA ###  
  [How to configure IntelliJ IDEA](https://www.jetbrains.com/help/idea/get-started-with-scala.html#-7n9eub_12)
  
  [How to setup the tasks for IntelliJ IDEA](https://scala-cli.virtuslab.org/docs/cookbooks/ide/intellij)


## Compile

To compile run `scala-cli compile .` 


## Tests 

There is also a file called **tests.scala**, which contains tests for your assignments. These tests are for self-testing purposes, and passing them does not necessarily mean that the task was completed correctly.

To execute tests run `scala-cli tests .`

You are free to add additional test cases to **tests.scala**

Example of passed tests:
```shell
Task1FastSearch:
  + none for empty sequence 0.001s
  + int 0.003s
  + page 0.206s
  + card 0.002s
Task2FinobacciIterator:
  + first fibonacci number 0.001s
  + 6th  fibonacci number 0.0s
  + 10000th fibonacci number 0.011s
Task3PowFunc:
  + powFunc(3)(3) = 27 0.001s
  + powFunc(3)(2) = 8 0.0s
  + powFunc(2)(3) = 9 0.0s
Task4FileList:
  + There are no tests for this task(( 0.02s
```

Example of failed tests:

```shell
Task1FastSearch:
==> X Task1FastSearch.int  0.016s munit.ComparisonFailException: scala/tests.scala:37
36:        val seq = (10 to 1000).toIndexedSeq
37:        assertEquals(fastSearch(seq, 10), Some(1))
38:        assertEquals(fastSearch(seq, 9), None)
values are not the same
=> Obtained
Some(
  value = 0
)
=> Diff (- obtained, + expected)
 Some(
-  value = 0
+  value = 1
 )
    at munit.FunSuite.assertEquals(FunSuite.scala:11)
    at Task1FastSearch.$init$$$anonfun$2(tests.scala:37)
```


