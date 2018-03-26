## SemanticVersion
Sample app how to use semantic version in your project
It gives you the possibility to automatically increment your app version and improve your build process
<br/>
Inspired by 
[Use different build numbers for every build — automatically using a gradle script](https://medium.com/@passsy/use-different-build-numbers-for-every-build-automatically-using-a-gradle-script-35577cd31b19)
### Example:
```
./gradlew incrementPatchVersion
./gradlew assembleRelease
```
**Note** that assemble- action should be called after increment- action, due to trigger gradle prebuild and get update versionCode, versionName to build your application 

## Instruction
1. copy sVersion.gradle in your app directory
2. create versions.json in your project root directory
```
{
    "major": 1,
    "minor": 2,
    "patch": 3
}
```
3. add to your application build.gradle file
```
apply from: 'sVersion.gradle'
```
4. change your build.gradle to get versionCode and versionName generated with gradle script
```
android {
    defaultConfig {
        ...
        versionCode calculateVersionCode()
        versionName calculateVersionName()
        ...
    }
}
```

Now the versionCode, and versionName will be generated from your versions.json file. 
The generation pattern can be found in SemanticVersion class in sVersionGradle

You have new tasks, that can be triggered to change app version:
 <br/>
./gradlew incrementPatchVersion
<br/>
./gradlew incrementMinorVersion
<br/>
./gradlew incrementMajorVersion

Each task will increment appropriate semantic version part and commit changes with tag