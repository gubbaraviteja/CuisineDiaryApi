# CuisineDiaryApi
This the service layer responsible for all the business logic

### Build the application
- <code>mvn clean package</code>
- <code>docker build -t cuisinediaryapi:1 .</code>

### Run the application
<code>docker run -p 9004:9004 -v \<location in your computer where you want to see the logs\>:/usr/app/logs cuisinediaryapi:1</code>

Example:

<code>docker run -p 9004:9004 -v /c/Users/24171/learnWithFun/CuisineDiaryApi/logs/:/usr/app/logs cuisinediaryapi:1</code>

###Available Operations

- saveRecipe
- getRecipes

You can find the sample requests in the below postman collection
https://www.getpostman.com/collections/4d374bf4ba7916ec6600
