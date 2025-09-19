# CI/CD Policy

Source: https://www.youtube.com/watch?v=KnSBNd3b0qI

## Feature_Branch
- A developer working on a particular feature must first create a feature branch.
- By default, the feature branch derives from the “Development” branch.
- The developer must commit regularly, keeping the branch up to date.
- Micro-commits are encouraged to make it easier to pinpoint issues by inspecting each commit and to maintain a clear history of when problems emerge.

## Branch_protection
- The “Development” branch must never contain untested code.
- Anything merged into “Development” must pass Code_Coverage and linting.
- The “master” branch is reserved for Releases only.
- Anything merged into “master” must be a fully developed feature that has passed at least:
  - one code-review,
  - code-coverage,
  - linting,
  - manual integration-tests.

## Integration_Tests
- Manual integration tests validate the application and GUI for functionality and bugs.
- All findings during integration tests must be documented.
- Each identified problem must have a corresponding issue created.

## UnitTests
- Each class should have at least 80% line coverage and 100% method coverage.
- Deviations from this rule are allowed only if there is a documented reason.

## End-to-end summary
- A Developer creates a Feature_Branch in Git and contributes via frequent micro-commits; a 2nd_Developer performs CodeReview on that branch.
- Branch_protection applies protection rules and triggers Ktlinter for code quality.
- From the Feature_Branch, the pipeline proceeds through Build, then into Build_and_compile_container, runs UnitTests, and evaluates Code_Coverage.
- Successful builds merge into Development_branch (commit-merge), which is then tested; Testing includes manual Integration_Tests.
- The Development_branch can be reviewed optionally by a 3rd_Developer and may proceed to Release.
- Policies enforce strict quality gates: Development must contain only tested code (coverage + lint), master is for Releases and requires review(s), coverage, linting, and manual integration tests. Unit test coverage expectations are 80% line and 100% method per class, with exceptions only when documented.
