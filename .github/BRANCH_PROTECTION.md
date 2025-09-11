Branch protection configuration (to be set in GitHub repository settings):

- Protected branches:
  - development
    - Require pull request reviews before merging: at least 1 approving review.
    - Require status checks to pass before merging: enable these checks:
      - Feature Branch CI / Lint, Build, Test, Coverage
    - Require branches to be up to date before merging.
  - master
    - Require pull request reviews before merging: at least 1 (or more) approving review(s).
    - Require status checks to pass before merging: enable Release workflow checks.
    - Require branches to be up to date before merging.

Policies reflected from policy.md:
- Development must never contain untested code; merges require passing ktlint and koverVerify.
- Master is reserved for Releases; merges must pass review(s), coverage, linting, and manual integration tests acknowledged in PR.

Naming conventions:
- Feature branches: feature/<short-description>
