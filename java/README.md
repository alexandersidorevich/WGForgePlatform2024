# Java

The package _net.wargaming.test.tasks_ contains 4 tasks (Task1, Task2, Task3, Task4). 
You should implement the body of the static method for each task.

## Prerequisites

The tasks are expected to be written using at least Java 17 syntax.

It's a Gradle project, but you don't need to install it because the build uses the Gradle Wrapper.
You can find out more about this [here](https://docs.gradle.org/current/userguide/installation.html)

You can use any IDE you like, for example [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/).

## Compile and run tests

`./gradlew build`

They're for self-testing, your implementations must pass all of them (but it does not necessarily mean that the task was completed correctly).
You are free to add any additional test cases.


Example of failed tests:

```shell

> Task :test FAILED

Task1Test > testFastEfficiency() FAILED
    java.lang.UnsupportedOperationException at Task1Test.java:63

Task1Test > testIntegerFastSearch(int, int) > [1] 10, 0 FAILED
    java.lang.UnsupportedOperationException at Task1Test.java:25

Task1Test > testIntegerFastSearch(int, int) > [2] 999, 989 FAILED
    java.lang.UnsupportedOperationException at Task1Test.java:25

Task1Test > testCardFastSearch(Card, int) > [1] Card[suit=HEARTS, rank=TWO], 0 FAILED
    java.lang.UnsupportedOperationException at Task1Test.java:49

Task1Test > testCardFastSearch(Card, int) > [2] Card[suit=CLUBS, rank=JACK], 35 FAILED
    java.lang.UnsupportedOperationException at Task1Test.java:49

Task1Test > testCardFastSearch(Card, int) > [3] Card[suit=SPADES, rank=ACE], 51 FAILED
    java.lang.UnsupportedOperationException at Task1Test.java:49

Task2Test > test1000Element() FAILED
    java.lang.UnsupportedOperationException at Task2Test.java:32

Task2Test > testFirstTenFibonacciNumbers() FAILED
    java.lang.UnsupportedOperationException at Task2Test.java:17

Task3Test > testPowFunc(int, int, int) > [1] 2, 2, 4 FAILED
    java.lang.UnsupportedOperationException at Task3Test.java:16

Task3Test > testPowFunc(int, int, int) > [2] 3, 2, 9 FAILED
    java.lang.UnsupportedOperationException at Task3Test.java:16

Task3Test > testPowFunc(int, int, int) > [3] 2, 3, 8 FAILED
    java.lang.UnsupportedOperationException at Task3Test.java:16

Task3Test > testPowFunc(int, int, int) > [4] 3, 3, 27 FAILED
    java.lang.UnsupportedOperationException at Task3Test.java:16

Task3Test > testOverflow() FAILED
    java.lang.UnsupportedOperationException at Task3Test.java:23

13 tests completed, 13 failed

....

BUILD FAILED in 1s
4 actionable tasks: 4 executed

```

Example of passed tests:
```shell
java % ./gradlew build

BUILD SUCCESSFUL in 478ms

```
