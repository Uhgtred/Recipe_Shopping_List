# Coding guidelines


## Branches 
1. Only code which testcases run green shall find its way to the branch "Development"!
2. For each feature there will be a "feature/ExampleFeature"-branch!
3. "main" is reserved for releases only!
4. Any code that will be merged to "Development" shall be reviewed by a second developer if possible.
   If no second developer is on the team the code shall at least be reviewed by an AI-model that is suited for coding (though the result of this review will be questionable).

## Test driven development
1. All development should be done following the rules of test-driven development. 
   This means, that at first the test for any logic is going to be written. 
2. After the test is implemented, the implementation of the code itself follows up to let the test run green.
3. The tests need to be well documented, since they model the code that will be written afterwards.
   This means that the logic and functionality of any code can be explained by its corresponding test.
4. The tests should rather depend on abstractions than on mocks 
   (if you are tempted to use mocks try thinking of an abstraction that could solve the issue at hand).

The advantages are:
    * high code-coverage
    * very requirements-oriented code (probably with minimal implementation)
    * well structured code is a direct consequence of this development-technique

disadvantages:
    * takes some time to get used to
    * tends to have very complex testcases with a lot of mocks (please stick to rule 4 to avoid this) 