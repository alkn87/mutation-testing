This project shows the basics of mutation testing with PIT in Java.

The documentation can be found here:
https://pitest.org/

## Run tests and generate plain old coverage report:
`mvn clean test jacoco:report`

The coverage report can be found in the target folder in /site/jacoco/index.html

## Run tests with mutation coverage:
`mvn clean test org.pitest:pitest-maven:mutationCoverage`

The mutation coverage report can be found in the target folder in /pit-reports/
