## SemanticVersion
Sample app how to use semantic version in your project

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
 
./gradlew incrementPatchVersion

./gradlew incrementMinorVersion

./gradlew incrementMajorVersion

Each task will increment appropriate semantic version part and commit changes with tag