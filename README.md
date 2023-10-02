# common-lib-jvm
A template for a Gradle Spring Boot Library written in Kotlin

## How to Use

1. Create your library repository and initialize it.
```shell
mkdir my_new_library
cd my_new_library
git init
git checkout -b main
touch README.md
git commit -am "Initial commit"
```
2. Add this codebase as a secondary remote
```shell
git remote add base_lib git@github.com:curena/common-jvm-lib.git
git pull base_lib main
git remote rm base_lib
``` 
