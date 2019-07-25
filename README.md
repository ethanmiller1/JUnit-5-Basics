# JUnit 5 in IntelliJ

Test Driven Development allows you to test class methods without manually inputting in the same parameters every time I want to test them in the future.

JUnit 4 had a monolithic architecture (1 jar file) in an all or nothing format. JUnit 5 (Jupiter) allows you to import part of the functionality without the whole thing.

## Getting started in IntelliJ

1. Create a class with methods that you want to test.
1. Select the class, type "Alt+Enter", and choose "Create Test." Add JUnit 5 dependencies (engine and API).
1. Add @Test before the test() method.
1. Compare expected output with actual output.