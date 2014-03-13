#tycho-unit-tests
================

## Running build with unit tests
```mvn clean package```

```
[INFO] Scanning for projects...
[WARNING] No explicit target runtime environment configuration. Build is platform dependent.
[INFO] Computing target platform for MavenProject: pl.tkleszczynski.tycho:pl.tkleszczynski.tycho.unit-test-sample:0.0.1-SNAPSHOT @ C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\pom.xml
[INFO] Resolving dependencies of MavenProject: pl.tkleszczynski.tycho:pl.tkleszczynski.tycho.unit-test-sample:0.0.1-SNAPSHOT @ C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\pom.xml
[INFO] Resolving class path of MavenProject: pl.tkleszczynski.tycho:pl.tkleszczynski.tycho.unit-test-sample:0.0.1-SNAPSHOT @ C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\pom.xml
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building pl.tkleszczynski.tycho.unit-test-sample 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.4.1:clean (default-clean) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] Deleting C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\target
[INFO] 
[INFO] --- tycho-packaging-plugin:0.19.0:build-qualifier (default-build-qualifier) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] The project's OSGi version is 0.0.1.201403132039
[INFO] 
[INFO] --- tycho-packaging-plugin:0.19.0:validate-id (default-validate-id) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] 
[INFO] --- tycho-packaging-plugin:0.19.0:validate-version (default-validate-version) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] 
[INFO] --- maven-resources-plugin:2.4.3:resources (default-resources) @ pl.tkleszczynski.tycho.unit-test-sample ---
[WARNING] Using platform encoding (Cp1250 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\src\main\resources
[INFO] 
[INFO] --- tycho-compiler-plugin:0.19.0:compile (default-compile) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] Compiling 3 source files to C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\target\classes
[INFO] 
[INFO] --- maven-resources-plugin:2.4.3:testResources (default-testResources) @ pl.tkleszczynski.tycho.unit-test-sample ---
[WARNING] Using platform encoding (Cp1250 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\src\test\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1250, i.e. build is platform dependent!
[INFO] Compiling 1 source file to C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\target\test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.16:test (default) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] Surefire report directory: C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running pl.tkleszczynski.tycho.unittests.SampleCalculatorTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.297 sec - in pl.tkleszczynski.tycho.unittests.SampleCalculatorTest

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- tycho-packaging-plugin:0.19.0:package-plugin (default-package-plugin) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] Building jar: C:\Users\tomek\git\tycho-unit-tests\tycho-unit-tests\target\pl.tkleszczynski.tycho.unit-test-sample-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- tycho-p2-plugin:0.19.0:p2-metadata-default (default-p2-metadata-default) @ pl.tkleszczynski.tycho.unit-test-sample ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.145s
[INFO] Finished at: Thu Mar 13 21:39:56 CET 2014
[INFO] Final Memory: 18M/45M
[INFO] ------------------------------------------------------------------------
```