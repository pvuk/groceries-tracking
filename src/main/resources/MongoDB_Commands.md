=========================================================================================================
##		MongoDB (Markdown [Format language] file).

For more [https://fileinfo.com/extension/md](.MDFile Extension). Live Preview [http://bit.ly/362Naax](Compare markdown implementations). Examples [http://bit.ly/2PcyIGp](

=========================================================================================================
##		MongoDB Commands

#### 1. Start your MongoDB database.
	To start MongoDB, invoke mongod.exe.

EXAMPLE: From the Command Interpreter(Win + R)
```
> "C:\Program Files\MongoDB\Server\4.0\bin\mongod.exe" --dbpath="c:\data\db"
```
##### or
```
> D:\uday\backup\mongodb-win32-x86_64-2008plus-ssl-4.0.9\bin\mongod --port 27017 --dbpath="D:\uday\data\db"
```
##### or
```
> "I:\mongodb-win32-x86_64-enterprise-windows-64-4.0.9\bin\mongod.exe" --dbpath="I:\data\4.0.9"
```
##### or
```
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongod.exe --dbpath="D:\Backup\data\4.2.0"
```
##### Finally, If the MongoDB database server is running correctly, the Command Interpreter displays:

>[initandlisten] waiting for connections

#### 1.2 Connect to MongoDB.
To connect to MongoDB through the mongo.exe shell, open another Command Interpreter.
```
> "C:\Program Files\MongoDB\Server\4.0\bin\mongo.exe"
```
##### or
```
> D:\uday\backup\mongodb-win32-x86_64-2008plus-ssl-4.0.9\bin\mongo.exe
```
##### or
```
> I:\mongodb-win32-x86_64-enterprise-windows-64-4.0.9\bin\mongo.exe
```
##### or
```
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongo.exe
```
#### 1.3 Connect and Authenticate as the user administrator
##### USER: admin
```
> mongo --port 27017 -u "admin" -p "admin" --authenticationDatabase "groceries"
```
##### USER: test
```
> mongo --port 27017 -u "test" -p "test" --authenticationDatabase "groceries"
```
Start a standalone mongod instance without access control.
```
> mongod --port 27017 --dbpath="D:\uday\data\db"
```
=========================================================================================================
### Enable MongoDB's free cloud-based monitoring service
=========================================================================================================
which will then receive and display metrics about your deployment (disk utilization, CPU, operation statistics, etc.).

##### 1.4.1 To enable free monitoring, run the following command: 
```
> db.enableFreeMonitoring()
```
#### 1.4.2 To permanently disable this reminder, run the following command:
```
> db.disableFreeMonitoring()
```
To start MongoDB, invoke mongod.exe.

Example:
From the Command Interpreter (Win + R)
```
> "C:\Program Files\MongoDB\Server\4.0\bin\mongod.exe" --dbpath="c:\data\db"
```
##### or
```
> D:\uday\backup\mongodb-win32-x86_64-2008plus-ssl-4.0.9\bin\mongod --port 27017 --dbpath="D:\uday\data\db"
```
##### or
```
> "I:\mongodb-win32-x86_64-enterprise-windows-64-4.0.9\bin\mongod.exe" --dbpath="I:\data\4.0.9"
```
##### or
```
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongod.exe --dbpath="D:\Backup\data\4.2.0"
```
#### 1.1 If the MongoDB database server is running correctly, the Command Interpreter displays:

>[initandlisten] waiting for connections

#### 1.2 Connect to MongoDB.
To connect to MongoDB through the mongo.exe shell, open another Command Interpreter.
```
> "C:\Program Files\MongoDB\Server\4.0\bin\mongo.exe"
```
##### or
```
> D:\uday\backup\mongodb-win32-x86_64-2008plus-ssl-4.0.9\bin\mongo.exe
```
or
```
> I:\mongodb-win32-x86_64-enterprise-windows-64-4.0.9\bin\mongo.exe
```
##### or
```
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongo.exe
```
#### 1.3 Connect and Authenticate as the user administrator
```
> mongo --port 27017 -u "admin" -p "admin" --authenticationDatabase "groceries"
```
```
> mongo --port 27017 -u "test" -p "test" --authenticationDatabase "groceries"
```
Start a standalone mongod instance without access control.
```
> mongod --port 27017 --dbpath="D:\uday\data\db"
```
#### 1.4 Enable MongoDB's free cloud-based monitoring service, which will then receive and display
	metrics about your deployment (disk utilization, CPU, operation statistics, etc).
#### 1.4.1 To enable free monitoring, run the following command: 
```
> db.enableFreeMonitoring()
```
#### 1.4.2 To permanently disable this reminder, run the following command: 
```
> db.disableFreeMonitoring()
```
## How to create a database in MongoDB

#### 1.3.How to create a database in MongoDB.
`use <DATABASE_NAME>` is used to create database. The command will create a new database if it doesn't exist, otherwise it will return the existing database.

Syntax:
Basic syntax of use DATABASE statement is as follows −
```
>use DATABASE_NAME
```
Example:
If you want to use a database with name <mydb>, then use DATABASE statement would be as follows −
```
>use mydb
```
>switched to db mydb

##### 1.4
To check your currently selected database, use the command db
```
>db
```
>mydb

##### 1.5
If you want to check your databases list, use below command show available db's.
```
>show dbs
```
>local     0.78125GB
>test      0.23012GB

#### 1.6 Your created database (mydb) is not present in list. To display database, you need to insert at least one document into it.
```
>db.movie.insert({"name":"tutorials point"})
```
```
>show dbs
```
[comment]: #(Below table can be designed in https://johnmacfarlane.net/babelmark2/)

S. No| Database	| Size
----- | -----
1	| local        | 0.78125GB		
2	| mydb         | 0.23012GB		
3	| test         | 0.23012GB

In MongoDB default database is test. If you didn't create any database, then collections will be stored in test database.

#### To create user in db 

Reference: [https://docs.mongodb.com/manual/tutorial/enable-authentication/](Enabling access control on a MongoDB deployment enforces authentication, requiring users to identify themselves)

#### 2.1 Add user to DB
```
>db.createUser({user:"admin", pwd:"admin",roles:["readWrite","dbAdmin"]})
```
##### or
```
>db.createUser({user:"mongo --port 27017  --authenticationDatabase "admin" -u "myUserAdmin" -ptest", pwd:"test", roles:["readWrite", "dbAdmin"]})--for test user
```
##### or
```
>db.createUser({user:"m001-student",pwd:"m001-mongodbbasics",roles:["readWrite","dbAdmin"]})
```
##### or
```
>db.createUser({ user: "myUserAdmin", pwd: "admin123", roles: [{ role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase" ] });
```
#### 2.2 if you want to add without roles
```
>db.createUser({user:"admin", pwd:"admin", roles:[]})
```

#### 2.3 To check Authenticated or not
```
>db.auth("admin_name", "1234")
```

it should give you:
1
else :
Error: Authentication failed.
0

#### 2.4 To find MongoDB version
```> db.version()```

=========================================================================================================
## LOGIN COMMANDS

Reference: https://dzone.com/articles/top-10-most-common-commands-for-beginners

##### 1. Log Into MongoDB
The following command can be used to log into the MongoDB database. Make sure that the user with credentials such as username and password exist in the database mentioned in place of dbname.
```
mongo -u <username> -p <password> --authenticationDatabase <dbname>
```
#### 1.1 Authenticate and Log Out From Database

When switching to a different database using the use dbName command, the user is required to authenticate using a valid database user for that database. The following command can be used for authentication:

#### Authenticate

```
db.auth("username", "password");
```

#### Logout

````
>db.logout()
````

#### 1.2 List Down Collections, Users, Roles, etc.

The following commands can be used to check existing collections, users, etc.

##### List down collections of the current database
````
> db.getCollectionNames();
````
##### List down all the users of current database
````
> db.getUsers();
````
##### List down all the roles
````
> db.getRoles();
````
=========================================================================================================
## CREATE COLLECTION

The following command can be used to create a collection. The details on this command can be found on this page.

>db.createCollection("collectionName");
##### 1.3. Insert a Document in a Collection
Once a collection is created, the next step is to insert one or more documents. Following is a sample command for inserting a document in a collection.

##### Insert single document
````
db.<collectionName>.insert({field1: "value", field2: "value"})
````
````
>db.GROCERIES_TRACKING.insert({"PURCHASED_ON" : "02-Sep-2020 09:00",
	"LOCATION" : "JayaNagar Vegitable Market, Bhagyanagar Colony, Hyderabad",
	"GOOGLE_MAP_LOCATION" : "",
	"VEGITABLES" : [
			{"NAME": "Birakay", "WEIGHT": "500gm", "RATE": "₹60", "AVAILABLE_TYPE" : "Organic", "COMMENT": ""}, 
			{"NAME": "TOMATO", "WEIGHT": "1kg", "RATE": "₹50", "AVAILABLE_TYPE" : "Organic", "COMMENT": ""}
		],
	"BRANCH_NAME" : "Old Shop",
	"RATING" : null,
	"TOTAL_STAFF" : "6 Members",
	"HOME_DELIVERY" : "No",
	"PAYMENT_ALLOWED": {
		"BHIM_UPI": "Yes",
		"SWIPING_MACHINE_AVAILABLE": "Yes",
		"CASH": "Yes",
		"Comment": ""
	}
});
````

Insert multiple documents

````
>db.<collectionName>.insert([{field1: "value1"}, {field1: "value2"}]);
````

````
>db.<collectionName>.insertMany([{field1: "value1"}, {field1: "value2"}]);
````

#### 1.4. Save or Update Document
The save command can be used to either update an existing document or insert a new one depending on the document parameter passed to it. If the _id passed matches an existing document, the document is updated. Otherwise, a new document is created. Internally, thesave method uses either the insert or the update command.

Matching document will be updated; In case, no document matching the ID is found, a new document is created

````
db.<collectionName>.save({"_id": new ObjectId("jhgsdjhgdsf"), field1: "value", field2: "value"});
````


=========================================================================================================
##### Update Record
````
>db.BANK_TYPE.update({"_id" : ObjectId("5cbeb52bda1faf34488362c1")},  {$set: { "position" : 3}});
````

=========================================================================================================
##### Get Records

Display Collection doucments
The following commands can be used to retrieve collection records:

````
db.<collectionName>.find();
````

Retrieve limited number of records; Following command will print 10 results;

````
db.<collectionName>.find().limit(10);
````

### Fetch selective field from collection based on a criteria
If we want to fetch only the "user_id" for all documents from the collection 'userdetails' which hold the educational qualification "M.C.A.", the following mongodb command can be used :

````
>db.userdetails.find({"education":"M.C.A."},{"user_id" : 1}).pretty();
````

Copy
N.B. find() method displays the documents in a non structured format but to display the results in a formatted way, the pretty() method can be used.

### The SQL equivalent code is

````SELECT user_id 
FROM userdetails 
WHERE education="M.C.A."; 
````

Retrieve records by id

````
db.<collectionName>.find({"_id": ObjectId("someid")});
````

Retrieve values of specific collection attributes by passing an object having attribute names assigned to 1 or 0 based on whether that attribute value needs 
to be included in the output or not, respectively.

````
db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 1, field2: 1});
````
Exclude field1

````
db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 0}); // 
````
=========================================================================================================
		Delete Documents in a Collection
=========================================================================================================

Source: https://www.quackit.com/mongodb/tutorial/mongodb_delete_a_document.cfm
#### 1. You can delete all documents in a collection simply by omitting any filtering criteria.
Let's delete all documents in the artists collection:
````
>db.artists.remove( {} )
````
O/P:
````
WriteResult({ "nRemoved" : 8 })
````
#### 2. Remove single document from collection
````
> db.BANK_BRANCH.remove({ "_id" : ObjectId("5c519d43ee4cea15304a5bf0")});
````
O/P: WriteResult({ "nRemoved" : 1 })

=========================================================================================================
		Drop / Remove Commands
=========================================================================================================
* [Delete Documents](https://docs.mongodb.com/v3.2/tutorial/remove-documents/)
* [db.collection.remove()](https://docs.mongodb.com/manual/reference/method/db.collection.remove/)
* [db.collection.drop()](https://docs.mongodb.com/manual/reference/method/db.collection.drop/)
													
1. to drop the collection
````
>db.users.drop()
````
2. drop database
````
>db.dropDatabase();
````
3. drop all collections from database
Drop a collection or view from the database. The method also removes any indexes associated with the dropped collection.
````
>db.getCollectionNames().forEach(function(e){ print("Drop collection: "+ e +", Status: "+ db[e].drop()); });
````
##### or
##### Removes all documents from a collection.
````
>db.getCollectionNames().forEach(function(e){print(db[e].remove())});
````
##### Removes document from a collection Using ID.
````
>db.DATE_FORMAT_CODE.remove({"_id": ObjectId("5f4008c5ee7e7278b8745398")});
````
=========================================================================================================
		Count Document in collection
=========================================================================================================
````
>db.<collectionName>.count();
````
##### To get count of all documents in mongodb
````
> var documentCount = 0; db.getCollectionNames().forEach(function(collection) { documentCount++; }); print("Available Documents count: "+ documentCount);
````
##### To get all count of document results in a collection
````
>db.getCollectionNames().forEach(function(collection) { resultCount = db[collection].count(); print("Documents count: "+ resultCount +" for collection "+ collection); });
````

=========================================================================================================

````
>db.createCollection("collectionName");
````
#### 1.6. Administrative Commands
Following are some of the administrative commands that can be helpful in finding collection details such as storage size, total size, and overall statistics.

##### Get the collection statistics 
````
db.<collectionName>.stats()
````
##### Get all collection statistics
````
db.printCollectionStats()
````
##### Latency statistics for read, write operations including average time taken for reads, writes and related operations performed
````
db.<collectionName>.latencyStats()
````
##### [You can run latencyStats() in a mongo shell as follows:](https://docs.mongodb.com/manual/reference/method/db.collection.latencyStats/)
````
db.data.latencyStats( { histograms: true } ).pretty()
````
=========================================================================================================
		DataSize for Collection
=========================================================================================================
##### Get collection size for data and indexes
````
>db.<collectionName>.dataSize() // Size of the collection
````
##### To get all dataSize of documents in a collection
````
>db.getCollectionNames().forEach(function(collection) { size = db[collection].dataSize(); print("collection: " + collection + ", Contains dataSize: "+ size); });
````
=========================================================================================================
* Total size of document stored in the collection
````
db.<collectionName>.storageSize() 
````
* Total size in bytes for both collection data and indexes
````
db.<collectionName>.totalSize()
````
* Total size of all indexes in the collection
````
db.<collectionName>.totalIndexSize()
````
=========================================================================================================
		Index in Collection
=========================================================================================================
Query for Indexes (https://docs.mongodb.com/manual/indexes/)

##### The unique property for an index causes MongoDB to reject duplicate values for the indexed field
````
>db.members.createIndex( { "user_id": 1 }, { unique: true } )
````

=========================================================================================================
Create Indexes for all collections in db
=========================================================================================================
### Example: 
---------------------------------------------------------------------------------------------------------
=========================================================================================================
					CREATE COLLECTION from JSON
=========================================================================================================
### Example: 
---------------------------------------------------------------------------------------------------------

##### Read all data from GROCERIES_DOCUMENTS_CODE collection

[comment]: # ">db.GROCERIES_DOCUMENTS_CODE.find().forEach(function(e){print(e.collection_name)});"

[comment]: # "for code display use ``` in before and after the code."

````
>db.GROCERIES_DOCUMENTS_CODE.find().forEach(function(e){
	var collection = e.collection_name;
	var jsonFile = jsonPath + collection.toLowerCase() +".json";
	print("Reading file: "+ jsonFile);
	var file = cat(jsonFile);
	print("Inserting data into collection: "+ collection.toUpperCase() +", From JSON File Data: "+ file);
	var o = JSON.parse(file);
	db[collection].insert(o);
});
````

=========================================================================================================

Use the following information to complete this form, but do not click "Connect" yet.

Hostname: cluster0-shard-00-00-jxeqq.mongodb.net

Username: m001-student

Password: m001-mongodb-basics

Replica Set Name: Cluster0-shard-0
