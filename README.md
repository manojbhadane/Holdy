<img src="https://raw.githubusercontent.com/manojbhadane/Social-Icons/master/holdy3.png" >

<h4 align="center">Android Library</h4>

<p align="center">
  <a target="_blank" href="https://android-arsenal.com/api?level=16"><img src="https://img.shields.io/badge/API-9%2B-orange.svg"></a>
  <a target="_blank" href="https://jitpack.io/#manojbhadane/Holdy"><img src="https://jitpack.io/v/manojbhadane/Holdy.svg"></a>
  <a target="_blank" href="https://paypal.me/manojbhadane" title="Donate using PayPal"><img src="https://img.shields.io/badge/paypal-donate-yellow.svg" /></a>
</p>

<p align="center">Android Library that can easily load any fragment in a provided container. library encourage us to use maximum fragments which reducing application size. With holdy you can easily deal with fragments.</p>

# Features
**1. Reduce application size with holdy**<br/>
**2. Deal with fragments easily with holdy**<br/>
**3. Highly customisable**<br/>


# Download

This library is available in **jitPack** which is the default Maven repository used in Android Studio.

## Gradle 
**Step 1.** Add it in your root **build.gradle** at the end of repositories
```Gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

**Step 2.** Add the dependency in your apps module **build.gradle**
```Gradle
dependencies {
	 implementation 'com.github.manojbhadane:Holdy:v1.1'
}
```

# Usage

## Style.xml
This Mandatory style, configure once in application class. you can create your own style for each holder but parent for each 
style should be 'Theme.AppCompat.Light.NoActionBar'
```xml
<style name="HoldyTheme" parent="Theme.AppCompat.Light.NoActionBar">
    <item name="colorPrimary">@color/colorPrimary</item>
    <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
    <item name="colorAccent">@color/colorAccent</item>
</style>
```

## In Application class
Set style for all holders
```
Holdy.init(R.style.HoldyTheme);
```

## Minimum configuration
```Java
new Holdy.Builder(this)
         .setFragment(LoginFragment.class.getCanonicalName())
         .build();
``` 

## Maximum configuration
```
new Holdy.Builder(this)
          .setTitle("Home")
          .setShowToolbar(true)
          .setBundle(new Bundle())
          .setToolbarBackBtn(true)
          .setTheme(R.style.HomeTheme)
          .setFragment(LoginFragment.class.getCanonicalName())
          .build();
```


# Customization

There are several customization options available which you can use to completely change the look-and-feel and functionality of this view to match your needs.

### JAVA (Programatically)

You can also programatically change the properties of the view, thereby having more control over it.
```
1. Title for fragment
setTitle("Home")

2. Toolbar visibility for fragment
setShowToolbar(true)

3. Send bundle to fragment
setBundle(new Bundle())

4. Toolbar Back button visibility for fragment
setToolbarBackBtn(true)

5. Custom theme for fragment
setTheme(R.style.HomeTheme)

6. Fragment that needs to be load
setFragment(LoginFragment.class.getCanonicalName())
```

# Apps using Holdy
1. **Fincal :** You can download the app from Google Play:

<a target="_blank" href="https://play.google.com/store/apps/details?id=com.financecalculator"><img src="https://play.google.com/intl/en_us/badges/images/generic/en-play-badge.png" height="60"></a>

# Spread Some :heart:
[![GitHub followers](https://img.shields.io/github/followers/manojbhadane.svg?style=social&label=Follow)](https://github.com/manojbhadane)  [![Twitter Follow](https://img.shields.io/twitter/follow/manojbhadane.svg?style=social)](https://twitter.com/Manoj_bhadane) 


# Bugs or Requests

If you encounter any problems feel free to open an [issue](https://github.com/manojbhadane/Holdy/issues/new?assignees=&labels=&template=bug_report.md). If you feel the library is missing a feature, please raise a [ticket](https://github.com/manojbhadane/Holdy/issues/new?assignees=&labels=&template=feature_request.md) on GitHub and I'll look into it. Pull request are also welcome. 

# If this library helps you in anyway, show your love :heart: by putting a :star: on this project :v:

# About The Author

### Manoj Bhadane

Android & Backend Developer.


<a href="https://medium.com/@manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/medium-icon.png?raw=true" width="60"></a>
<a href="https://stackoverflow.com/users/4034678/manoj-bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/stackoverflow-icon.png?raw=true" width="60"></a>
<a href="https://twitter.com/Manoj_bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/twitter-icon.png?raw=true" width="60"></a>
<a href="https://in.linkedin.com/in/manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/linkedin-icon.png?raw=true" width="60"></a>


# License

```
MIT License

Copyright (c) 2019 Manoj Bhadane

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
