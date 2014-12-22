AndroidBox
==========
Android developer personal cook book

Distribution
---------
Sorry libary do not provide any sort of binaries. It's designined to be easy to change and update so git submodule approach is used. If you are not using Git you could just copy content of repo into your project.

Insatllation
----------
Below described installation steps based on default Android Studion gradle project. In case you structure is differnet you could use below steps as a reference but adopt it to your needs (hope it will be not too much difficult)
Add sources to your android project in androidbox folder right after your root folder so your structure would look like so:
```
project root
   |-- app
   |     | -- src
   |     | -- build.gradle
   |     | -- ...
   |- androidbox
   |     | -- src
   |     | -- build.gradle
   |     | -- ...
   | -- build.gradle
   | -- settings.gradle 
```   
If you are using Git best choice would be to execute following
```sh
git submodule add https://github.com/mrjbee/androidbox.git androidbox
```
if not just copy content of repo to your project. Next add `:androidbox` to settings.gradle 

```groovy
include ':app', ':androidbox'
```
and app/build.gradle
```groovy
dependencies {
    compile project(':androidbox')
    compile fileTree(dir: 'libs', include: ['*.jar'])
}
```
And you are done :)
