# Overview

My App Portfolio is an Android app designed to hold and display other Android apps.

Or, it will be that.  With no previous experience with Android development, I completed this as the first project for a [course on Udacity](https://www.udacity.com/course/android-developer-nanodegree--nd801).

# Technical Details

- Tested on an emulated version of a Nexus 4 running IceCreamSandwich (Android 4.0.3).
- minSdkVersion value is set to 15 so the app can run on most Android devices (96%) while retaining most of the newest features of Android 4.X.

# Current Functionality

Opens to an aestheically pleasing app portfolio homepage with several buttons for proposed projects.

The buttons display a message when clicked.

# Changes to Implement Following Udacity Code Review

1. Make color values reusable by putting them into res/values/colors.xml.
2. Make your string values reusable by putting them into res/values/strings.xml.
3. Give buttons better IDs (e.g., "capStoneButton" instead of "button5").
4. Define a general Button style and set all general attributes in one style definition saved in res/values/styles.xml.
5. Embed widgets within a ScrollView to allow users to scroll while in landscape.