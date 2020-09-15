##		                         MongoDB (Markdown [Format language] file).

For more [https://fileinfo.com/extension/md](.MDFile Extension). Live Preview [http://bit.ly/362Naax](Compare markdown implementations). Examples [http://bit.ly/2PcyIGp](Markdown-Cheatsheet)

## 1. MongoDB Commands

####   1. Start your MongoDB database.
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

   > "C:\Program Files\MongoDB\Server\4.0\bin\mongo.exe"

##### or
   > D:\uday\backup\mongodb-win32-x86_64-2008plus-ssl-4.0.9\bin\mongo.exe
##### or
   > I:\mongodb-win32-x86_64-enterprise-windows-64-4.0.9\bin\mongo.exe
##### or
   > D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongo.exe

#### 1.3 Connect and Authenticate as the user administrator
##### USER: admin
   > mongo --port 27017 -u "admin" -p "admin" --authenticationDatabase "trans"

   Start a standalone mongod instance without access control.

   > mongod --port 27017 --dbpath="D:\uday\data\db"

### 1.4 Enable MongoDB's free cloud-based monitoring service
	which will then receive and display metrics about your deployment (disk utilization, CPU, operation statistics, etc).
####   1.4.1 To enable free monitoring, run the following command: 
```
   > db.enableFreeMonitoring()
```
####   1.4.2 To permanently disable this reminder, run the following command: 
```
   > db.disableFreeMonitoring()
```

## 2. How to create a database in MongoDB

#### 2.1.How to create a database in MongoDB. / Select Database to Work With
   The **use** Command
   `use <DATABASE_NAME>` is used to create database. The command will create a new database if it doesn't exist, otherwise it will return the existing database.

   Syntax:	Basic syntax of use DATABASE statement is as follows −

   >use DATABASE_NAME

   If you want to use a database with name <trans>, then use DATABASE statement would be as follows
```
   >use trans
```
O/P: switched to db trans

#### 2.2 To check your currently selected database, use the command db
```
   >db
```
O/P: trans

#### 2.3 If you want to check your databases list, use the command show dbs.
```
   >show dbs
```
O/P:
	local     0.78125GB
 	test      0.23012GB

#### 2.4 If Your created database (trans) is not present in list. To display database, you need to insert at least one document into it.

   `>db.movie.insert({"name":"tutorials point"})`
   `>show dbs`

   [comment]: #(Below table can be designed in https://johnmacfarlane.net/babelmark2/)

S. No   | Database	| Size |
   ----- | -----
1   | local        | 0.78125GB		|
2   | trans         | 0.23012GB		|
3   | test         | 0.23012GB		|

   In MongoDB default database is test. If you didn't create any database, then collections will be stored in test database.

## 3. To create user in db 

   Reference: [https://docs.mongodb.com/manual/tutorial/enable-authentication/](Enabling access control on a MongoDB deployment enforces authentication, requiring users to identify themselves)

#### 3.1 Add user to DB

   `>db.createUser({user:"admin", pwd:"admin",roles:["readWrite","dbAdmin"]})`
   ##### or
   `>db.createUser({user:"mongo --port 27017  --authenticationDatabase "admin" -u "myUserAdmin" -ptest", pwd:"test", roles:["readWrite", "dbAdmin"]})--for test user`
   ##### or
   `>db.createUser({user:"m001-student",pwd:"m001-mongodbbasics",roles:["readWrite","dbAdmin"]})`
   ##### or
   `>db.createUser({ user: "myUserAdmin", pwd: "admin123", roles: [{ role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase" ] });`

#### 3.2 if you want to add without roles
   `>db.createUser({user:"admin", pwd:"admin", roles:[]})`

#### 3.3 To check Authenticated or not
   `>db.auth("admin_name", "1234")`

   it should give you:
   1
   else :
   Error: Authentication failed.
   0

#### 3.4 To drop / remove
-	Single user from DB
   `>db.dropUser("admin");`

   ##### or
   ```
   *WARNING: db.removeUser has been deprecated, please use db.dropUser instead*
   ```
   `>db.removeUser("admin");`
-	All users from DB
	`>db.dropAllUsers();`

#### 3.5 To find MongoDB version
   `> db.version()`

## 4. LOGIN COMMANDS

   Reference: https://dzone.com/articles/top-10-most-common-commands-for-beginners

#### 4.1. Log Into MongoDB
	The following command can be used to log into the MongoDB database. Make sure that the user with credentials such as username and password exist in the database mentioned in place of dbname.

   mongo -u <username> -p <password> --authenticationDatabase <dbname>

#### 4.2 Authenticate and Log Out From Database

   When switching to a different database using the use dbName command, the user is required to authenticate using a valid database user for that database. The following command can be used for authentication:

-	Authenticate

   ```
   db.auth("username", "password");
   ```

-	Logout

   ```
   db.logout()
   ```

## List Down Collections, Users, Roles, etc.

   The following commands can be used to check existing collections, users, etc.

   List down collections of the current database

   > db.getCollectionNames();

   List down all the users of current database

   > db.getUsers();

   List down all the roles

   > db.getRoles();

## 5. CREATE COLLECTION

	The following command can be used to create a collection. The details on this command can be found on this page.

   >db.createCollection("collectionName");
#### 5.1. Insert a Document in a Collection
	Once a collection is created, the next step is to insert one or more documents. Following is a sample command for inserting a document in a collection.

#### 5.2. Insert single document

   >db.<collectionName>.insert({field1: "value", field2: "value"})

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

#### 5.3. Insert multiple documents

   >db.<collectionName>.insert([{field1: "value1"}, {field1: "value2"}])
   >db.<collectionName>.insertMany([{field1: "value1"}, {field1: "value2"}])
#### 5.4. Save or Update Document
-	The save command can be used to either update an existing document or insert a new one depending on the document parameter passed to it. If the _id passed matches an existing document, the document is updated. Otherwise, a new document is created. Internally, the save method uses either the insert or the update command.
  
-	Matching document will be updated; In case, no document matching the ID is found, a new document is created

   >db.<collectionName>.save({"_id": new ObjectId("jhgsdjhgdsf"), field1: "value", field2: "value"});

	**Note:** To avoid duplicate insertion please look into point 13. Index in Collection

## 6. Update Record
	>db.BANK_TYPE.update({"_id" : ObjectId("5cbeb52bda1faf34488362c1")},  {$set: { "position" : 3}});

## 7. Get Records

#### 7.1. Display all Collection documents.
-	The following commands can be used to retrieve collection documents:

	>db.<collectionName>.find();

#### 7.2. Retrieve limited number of records.
-	Following command will print 10 results:

	>db.<collectionName>.find().limit(10);

-	Fetch selective field from collection based on a criteria
   If we want to fetch only the "user_id" for all documents from the collection 'USER_DETAILS' which hold the educational qualification "M.C.A.", the following mongodb command can be used :

   >db.USER_DETAILS.find({"education":"M.C.A."},{"user_id" : 1}).pretty();

- find() method displays the documents in a non structured format but to display the results in a formatted way, the **pretty()** method can be used.

  #####	The SQL equivalent code is

     `SELECT user_id FROM USER_DETAILS WHERE education="M.C.A.";`

#### 7.3. Retrieve records by id
   >db.<collectionName>.find({"_id": ObjectId("someid")});

#### 7.4. Retrieve records by apply filter on two fields.
-	Retrieve values of specific collection attributes by passing an object having attribute names assigned to 1 or 0 based on whether that attribute value needs to be included in the output or not, respectively.

	>db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 1, field2: 1});

-	Apply filter on single field.

   >db.<collectionName>.find({"_id": ObjectId("someid")}, {field1: 0});

## 8. Drop / Remove Commands

   Source: https://www.quackit.com/mongodb/tutorial/mongodb_delete_a_document.cfm

#### 8.1. You can delete all documents in a collection simply by omitting any filtering criteria.

-	Let's delete all documents in the artists collection:

	>db.artists.remove( {} )

O/P:
	Resulting message:
	WriteResult({ "nRemoved" : 8 })

#### 8.2. Remove single document from collection
	MongoDB Enterprise > db.BANK_BRANCH.remove({ "_id" : ObjectId("5c519d43ee4cea15304a5bf0")});
	  WriteResult({ "nRemoved" : 1 })

-	Source: [Delete Documents](https://docs.mongodb.com/v3.2/tutorial/remove-documents/), [db.collection.remove()](https://docs.mongodb.com/manual/reference/method/db.collection.remove/), [db.collection.drop()](https://docs.mongodb.com/manual/reference/method/db.collection.drop/)

#### 8.3. to drop the collection 

	>db.users.drop();

#### 8.4. drop all collections from database
-	Drop a collection or view from the database. The method also removes any indexes associated with the dropped collection.

   ```
   >db.getCollectionNames().forEach(function(e){print(db[e].drop())});
   ```
##### or
-	Removes all documents from a collection using forEach.
   ```
   >db.getCollectionNames().forEach(function(e){print(db[e].remove())});
   ```
#### 8.5. drop database

	>db.dropDatabase();

## 10. Count Document in collection

    >db.<collectionName>.count();

#### 10.1. To get count of all documents in mongodb

    ```
    > var documentCount = 0; db.getCollectionNames().forEach(function(collection) { documentCount++; }); print("Available Documents count: "+ documentCount);
    ```

#### 10.2. To get all count of document results in a collection

    ```
    >db.getCollectionNames().forEach(function(collection) { resultCount = db[collection].count(); print("Documents count: "+ resultCount +" for collection "+ collection); });
    ```

## 11. Administrative Commands

    Following are some of the administrative commands that can be helpful in finding collection details such as storage size, total size, and overall statistics.

#### 11.1. Get the collection statistics 

	>db.<collectionName>.stats()


	>db.printCollectionStats()

#### 11.2. Latency statistics for read, writes operations including average time taken for reads, writes and related number of operations performed

	>db.<collectionName>.latencyStats()

## 12. DataSize for Collection

#### 12.1. Get collection size for data and indexes

-	Size of the collection
    
    >db.<collectionName>.dataSize()

#### 12.2. To get all dataSize of documents in a collection

    >db.getCollectionNames().forEach(function(collection) { size = db[collection].dataSize(); print("collection: " + collection + ", Contains dataSize: "+ size); });

#### 12.3. Total size of document stored in the collection

    db.<collectionName>.storageSize()

#### 12.4. Total size in bytes for both collection data and indexes

    db.<collectionName>.totalSize()

#### 12.5. Total size of all indexes in the collection

    db.<collectionName>.totalIndexSize()

## 13. Index in Collection

-	Source:	[Query for Indexes](https://docs.mongodb.com/manual/indexes/)

-	The unique property for an index causes MongoDB to reject duplicate values for the indexed field. This should be created after very first record insertion.

    >db.members.createIndex( { "user_id": 1 }, { unique: true } )

## 14. Create Indexes for all collections in db

#### 14.1. Insert code tables into single collection to do bulk operations.

    >var file = cat('D:/Workspace/2019-09/Practice/spring_boot_demo/src/main/resources/json/put/put-trans_documents_code.json'); var o = JSON.parse(file); db.TRANS_DOCUMENTS_CODE.insert(o);

#### 14.2. Json collection path to insert documents

    >var jsonPath = "D:/Workspace/2019-09/Practice/spring_boot_demo/target/classes/json/put/put-";

## 15. Create Indexes TRANS_DOCUMENTS_CODE collection

    >db.TRANS_DOCUMENTS_CODE.find().forEach(function(e){
    	var collection = e.collection_name;
    	print("Creating Collection: "+ collection);
    	db.createCollection(collection);
    	
    	var collection_name_lowercase = collection.toLowerCase();
    	print("Creating unique index for column 'code' in Collection: "+ collection);
    	db.collection_name_lowercase.createIndex({"code":1},{unique: true});
    	
    	var jsonFile = jsonPath + collection_name_lowercase +".json";
    	print("Reading file: "+ jsonFile);
    	
    	var file = cat(jsonFile);
    	print("Inserting data into collection: "+ collection.toUpperCase() +", From JSON File Data: "+ file);
    	var o = JSON.parse(file);
    	db[collection].insert(o);
    });

#### 15.1. Get Indexes of collection.
-	Returns an array that holds a list of documents that identify and describe the existing indexes on the collection. You must call db.collection.getIndexes() on a collection. For example:

    ```
    > db.BANK_TYPE_CODE.getIndexes();
    ```
-	Get Indexes for all collections.
    > db.getCollectionNames().forEach(function(collection) {
	    indexes = db[collection].getIndexes();
	    print("Indexes for " + collection + ":");
	    printjson(indexes);
    });

#### 15.2. Drop Indexes on collection.
-	Drops all indexes other than the required index on the _id field. Only call dropIndexes() as a method on a collection object.

    ```
    >db.collection.dropIndexes()
    ```

## 16. Print all collection names in a database

    ```
    db.getCollectionNames().forEach(function(collection_name){print(collection_name);});
    ```

## 17. CREATE COLLECTION from JSON

#### 17.1. Insert data into single collection from JSON file

###### Example1:

    >var file = cat('D:/uday/Workspace/2019-09/learn git/spring_boot_demo/target/classes/json/put/put-trans_documents_code.json'); var o = JSON.parse(file); db.TRANS_DOCUMENTS_CODE.insert(o);
##### or
    >var file = cat("I:/workspace/2019-09/Practice/spring_boot_demo/src/main/resources/json/put/put-trans_documents_code.json"); var o = JSON.parse(file); db.TRANS_DOCUMENTS_CODE.insert(o);
##### or
    >var file = cat('D:/Workspace/2019-09/Practice/spring_boot_demo/src/main/resources/json/put/put-trans_documents_code.json'); var o = JSON.parse(file); db.TRANS_DOCUMENTS_CODE.insert(o);

###### Example2:

    >var trans_collections = cat("D:/Workspace/2019-09/Practice/trans_pay_lp_sep_2020/src/main/resources/json/put/put-trans_documents_code.json");
    >var o = JSON.parse(trans_collections);
    >db.TRANS_DOCUMENTS_CODE.insert(o);

###### Example3:

    > mongoimport --jsonArray --db trans --collection TRANS_DOCUMENTS_CODE --file D:/uday/Workspace/2019-09/learn git/spring_boot_demo/target/classes/json/put/put-trans_documents_code.json


#### 17.2. Read All collection_name's from JSON Array from collection
	while iterating collection set file path from resource folder and insert data into collection.

-	mongo Shell Methods > [Native Methods](https://docs.mongodb.com/manual/reference/method/js-native/) > [cat()](https://docs.mongodb.com/manual/reference/method/cat/) 
	**cat** Returns the contents of the specified file.
   
    >var collection = cat("D:/uday/Workspace/2019-09/learn git/spring_boot_demo/target/classes/json/put/put-trans_documents_code.json");
	>var show = function(value, index, collection){print(value)};
	
##### or
	
	>var jsonCollectionsPath = "D:/Workspace/2019-09/Practice/spring_boot_demo/target/classes/json/put/put-trans_documents_code.json";

-	Read all data from TRANS_DOCUMENTS_CODE collection

	Read All collection_name's from JSON Array of collection file, while iterating collection set file path from resource folder and insert data into collection.

    >var jsonPath = "\"D:/uday/Workspace/2019-09/learn git/spring_boot_demo/target/classes/json/put/put-\"";
    
    [comment]: # ">db.TRANS_DOCUMENTS_CODE.find().forEach(function(e){print(e.collection_name)});"
    
    [comment]: # "for code display use ``` in before and after the code."
    
    >db.TRANS_DOCUMENTS_CODE.find().forEach(function(e){
    	var collection = e.collection_name;
    	var jsonFile = jsonPath + collection.toLowerCase() +".json";
    	print("Reading file: "+ jsonFile);
    	var file = cat(jsonFile);
    	print("Inserting data into collection: "+ collection.toUpperCase() +", From JSON File Data: "+ file);
    	var o = JSON.parse(file);
    	db[collection].insert(o);
    });

## 18. Use the following information to complete this form, but do not click "Connect" yet.

    Hostname: cluster0-shard-00-00-jxeqq.mongodb.net

    Username: m001-student

    Password: m001-mongodb-basics

    Replica Set Name: Cluster0-shard-0

    Read Preference: Primary Preferred
