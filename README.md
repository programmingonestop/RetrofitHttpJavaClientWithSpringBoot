# RetrofitHttpJavaClientWithSpringBoot
* A Rest Api Client Spring Boot Application using Retrofit

This is a small program written using spring boot to demonstrate retrofit as an http client.The program fetches dummy data from jsonplaceholder website https://jsonplaceholder.typicode.com/posts which returns a json string response of posts.Retrofit is used to convert response received from https://jsonplaceholder.typicode.com/posts into java object,in the program the Post class.

The program then exposes an endpoind at port http://localhost:8080/  where it returns the list of objects it fetched from https://jsonplaceholder.typicode.com/posts as a json response.

