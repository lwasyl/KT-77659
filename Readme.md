```
➜  kotlin-playground git:(main) ./gradlew kotlinLibrary:assemble

> Task :kotlin-library:kspKotlin FAILED
e: -Xwarning-level is duplicated for warning DEPRECATION
w: Language version 1.9 is deprecated and its support will be removed in a future version of Kotlin

FAILURE: Build failed with an exception.

* What went wrong:
  Execution failed for task ':kotlin-library:kspKotlin'.
> A failure occurred while executing org.jetbrains.kotlin.compilerRunner.GradleCompilerRunnerWithWorkers$GradleKotlinCompilerWorkAction
> Compilation error. See log for more details

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.

BUILD FAILED in 380ms
1 actionable task: 1 executed 
```
