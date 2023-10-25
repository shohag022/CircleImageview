# CircleImageview
This document provides instructions for integrating the CircleImageview Android SDK into your project. 
# Getting Started
> 
How to use ?
To get a Git project into your build:

Step 1. Add the JitPack repository to your `build setting` file 

``` build.gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
> Step 2. Add the dependency to your `build.gradle`:
``` gradle
dependencies {
	        implementation 'com.github.shohag022:CircleImageview:Tag'
	}
```
# Usage
``` gradle
    <com.rbmjltd.circleimageview.CircleImageView
        android:id="@+id/profile_image"
        android:layout_width="250dp"
        android:layout_height="250dp"
        android:layout_centerInParent="true"
        android:src="@drawable/profile"
        app:civ_border_color="#8CF80000"
        app:civ_border_width="2dp" />
```
# Changelog
`Version 1.0`
1.	Initial release
2.	Prevent crash due to OutOfMemoryError
3.	Add support for ColorDrawables
4.	Add getters and setters for border color and border width
5.	Add support for setImageURI(Uri uri)
6.	Add ColorFilter support
7.	Add setBorderColorResource(int resId)
8.	Add resource type annotations
9.	Add border_overlay attribute to allow drawing border on top of the base image
10.	BREAKING: Custom xml attributes are now prefixed with "civ_"
11.	Graceful handling of incompatible drawables
12.	Add support for a fill color shown behind images with transparent areas
13.	Add support for padding
14.	Remove deprecated properties and methods
15.	Add circle background color attribute to replace fill color
16.	Deprecate fill color as it seems to cause quite some confusion
17.	Add option to disable circular transformation
18.	Add support for elevation
19.	Limit touch event handling to circle area
20.	Migrate to AndroidX
21.	Align bitmap paint flags with BitmapDrawable (improves scaling)



# Contact With Us
If you face any problem using this library then feel free to contact me.
To contact me message me on Facebook or email me at:

`Email`: shohag@rbmjltd.com

`Facebook`: <a href="https://www.facebook.com/M220719" rel="nofollow">Monir Hossain (Shohag)</a> 

# Authors
<a href="https://www.facebook.com/M220719" rel="nofollow">Shohag Hossain (Monir)</a>

















