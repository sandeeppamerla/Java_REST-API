# Kaiburr_Task1

## Task 1: Java REST API
Name: P Bala Satya Sandeep

### ***Technologies Used***
* Java
* Maven
* SpringBoot Framework
* Mongodb

### ***Implementation***

Created the RestAPI using Spring Framework and for the backend mongoDB is used in the intelliJ ide. The endpoints for the project are /addServerDetails (Add the details to the database) & /findAllServers (Retrive all Data) & /FindByName ( Retrive the Data using name) & /deleteById (Delete from the Database using ID). The Rest API's were tested using postman.

Below are some of the attachecd screenshots:

![image](https://user-images.githubusercontent.com/111385394/227744027-a69e8292-fff8-40a5-8f91-1ff6e50acae7.png)

### ***Testing API on Postman***

* #### GET servers. Should return all the servers if no parameters are passed. When server id is passed as a parameter - return a single server or 404 if there’s no such a server.
> I created an api findallservers that retrieves all the servers from the mongo database that I had previously saved in the mongo db. The screenshot below is from Postman when our api was called and it got all the servers.

![image](https://user-images.githubusercontent.com/111385394/227744720-711b99f3-b1ad-4c55-acc6-ae2b3bedc1e6.png)

* #### PUT a server. The server object is passed as a json-encoded message body. Here’s an example: { “name”: ”my centos”, 
“id”: “123”, 
“language”:”java”, 
framework”:”django” 
}

> I've created an api that saves all servers to MongoDB and delivers their id as a message.

![image](https://user-images.githubusercontent.com/111385394/227744732-bb70f107-12c4-4614-a3bd-afca37c0da3b.png)

* #### DELETE a server. The parameter is a server ID.
> I created an api to delete servers by passing the specific server id, which deletes the specific server supplied by its id and provides a message with the deletd server id.

![image](https://user-images.githubusercontent.com/111385394/227744770-09df2f58-e5b6-4095-b93f-660535f3f01f.png)

> As you can see above, the id 9988 has been erased, and after fetching, there is no server with the id 9988 existent, as indicated in the image below.
![image](https://user-images.githubusercontent.com/111385394/227744935-1e1eb03b-c69c-48c7-94ab-45d63c408860.png)

* #### GET (find) servers by name. The parameter is a string. Must check if a server name contains this string and return one or more servers found. Return 404 if nothing is found.
> I created an api to retrieve the server by passing the particular server name  
![image](https://user-images.githubusercontent.com/111385394/227744783-4338ece2-6b27-4f5c-83de-3b233a61ac9f.png)

![image](https://user-images.githubusercontent.com/111385394/227743180-cabfac56-936e-477c-9a94-69c93ba3d67e.png)

![image](https://user-images.githubusercontent.com/111385394/227744825-1541795e-483c-4e4c-92cb-c57d0e5b558f.png)

