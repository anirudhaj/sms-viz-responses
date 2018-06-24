# WCA Visualize Response

This repository is a simple small project to gather SMS link clicks (Karix-Visualize) responses and store in the database. This will be typically used when 
1. you want to know if a the recipient has clicked on a shortened link in SMS and take action in real time
1. you want to get the shortened link click and store it in your database for reporting purposes

More information on this here : https://www.ibm.com/support/knowledgecenter/en/SSWU4L/Mobile/imc_Mobile/Mobile_q_a_watson_assistant/Karix_URL_shortening_and_tracking.html

This project currently uses [SparkJava](http://sparkjava.com/) among other things. This is really a first commit to the repository and just an example. **SparkJava** provided a REST based application development pattern where you could easily build routes the URL. A similar pattern is also provided by Spring Boot. This application is currently configured to use [H2 database](http://www.h2database.com) to store the data, but you could modify it to store in the database of your choice. To do that just change the Beans.xml file in the resources folder.

The purpose of the application is just a showcase how to get the response. I would expect that you would download and modify the code to suite your needs. Most certainly this is not optimized and there is much room for improvement. I would refactor it at some time to make it better (whenever I get time).

You will have to host a http server such that it is accessible over the internet. Karix needs to "POST" the responses to this app.

**Please note the following disclaimer**
1. Currently there is no security implemented for this app. You may want to put restriction such that you accept request from specified IPs only. 
1. There are no warranties or guarantees, implied or explicit or otherwise for this code. This is my personal repository and my employeer is not liable for this repository in any way.
1. There are open source project used in this code. You should refer licence terms of theose project if necessary.
1. You should use it at your own risk.

I have used Postman to test this application refer to the Postman screenshots if you want to try.
