# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile


# Deja las classes, pero elemina fields and methods
#-keep class com.androiddesdecero.proguardandroid.user.**

# Deja las classes, fields and methods
#-keep class com.androiddesdecero.proguardandroid.user.**{
#*;
#}

# Deja la classes UserPrueba2, elimina sus fields and methods
#-keep class com.androiddesdecero.proguardandroid.user.UserPrueba2

# Deja la classes UserPrueba2, fields and methods
#-keep class com.androiddesdecero.proguardandroid.user.UserPrueba2{
#*;
#}

#Deja el metodo que se llame setNameProfessor
-keepclassmembers class com.androiddesdecero.proguardandroid.user.**{
void setNameProfessor(java.lang.String);
}