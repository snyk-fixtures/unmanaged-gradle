# unmanaged-gradle

An example project showing how to use Snyk to scan unmanaged dependencies (Java archive files) using Gradle.

## Usage

Simply run the Gradle task `./gradlew snykTest`.

This task depends on `copyJars` which creates a directory `build/jars` in the root project.

The `snykTest` task then runs the Snyk CLI command `snyk test --scan-all-unmanaged` from the `build/jars` directory.

The results are shown on the console.
If there are vulnerabilities the task will fail.
In this case there is a vulnerable `log4j` dependency in `app`.

## Notes

To support older version of Gradle `apply plugin: <name>` is used instead of `plugins`.

This repository works with the following major version of Gradle:

* 7
* 6
* 5

but is configured to use `7.5.1` in the Gradle wrapper.
