Getting JavaScript Console Log from Chrome to Katalon Studio
=====

## What is this?

This is a simple Katalon Studio project for demonstration purpose.
You can clone this out on your PC and execute it with your Katalon Studio.

This project is developed to propose a solution for the following discussion
in the Katalon Forum:

- https://forum.katalon.com/discussion/comment/19621


I developed this demo using Katalon Studion version 5.4.2

## How to run the demo

1. clone the project `KatalonDiscussion19621` to your PC
2. open the project with your Katalon Studio
3. select the test case `TC1`
4. run the test case with Chrome
5. The test case 'TC1' will open the browser and navigate to a URL http://demoaut.katalon.com/
6. The test case gets JavaScript Console Log from the Chrome browser, prints the message into the Katalon console like this:

```
>>> [2018-07-25T09:44:47+0900] [SEVERE] http://demoaut.katalon.com/favicon.ico - Failed to load

>>> [2018-07-25T09:44:48+0900] [WARNING] http://demoaut.katalon.com/profile.php#login - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.

```
