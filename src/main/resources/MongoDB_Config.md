=========================================================================================================
#### STEP: 1		Download MongoDB latest version
=========================================================================================================
1.1. https://www.mongodb.com/download-center?jmp=nav
1.2. Select Platform -> Download -> select archive / msi
1.3. Installation steps	https://docs.mongodb.com/manual/tutorial/install-mongodb-enterprise-on-windows/


=========================================================================================================
#### STEP: 2		Run mongodb commands on <i>Windows</i>.... 'add Environment path variable'
=========================================================================================================
>Click on Windows icon from keyboard -> type environment.. you will get "Edit the system environment variables" option will come -> Select that opion.
##### or
>Open Control Panel -> System -> In Left menu options select Advanced system settings -> 

#### Follow below steps:
> Open Advanced tab-> Environment Variables -> System Variables Block -> 
##### Step1 : 
>Click on New -> Variable name: Path, Variable value: D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin
##### Or Step2:
>Select Path -> Click on Edit -> Click on New -> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin

//Example1: You need to navigate in command prompt where mongoimport.exe file exist. 
//Then try running below command, you should also put .json file in the same directory.

```
> mongoimport --jsonArray --db trans --collection NET_BANKING_CODE --file put-net_banking_code.json
```

=========================================================================================================
#### STEP 3:		Start your MongoDB database.
=========================================================================================================
To start MongoDB, invoke mongod.exe.

EXAMPLE

### Start The MongoDB Server
From the Command Interpreter:
#### For community edition

#### For enterprise edition
```
> "I:\mongodb-win32-x86_64-enterprise-windows-64-4.0.9\bin\mongod.exe" --dbpath="I:\data\4.0.9\groceries"
```
##### or
```
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongod.exe --dbpath="D:\Backup\data\4.2.0\groceries"
```
##### Finally, If the MongoDB database server is running correctly, the Command Interpreter displays:

>[initandlisten] waiting for connections

=========================================================================================================
#### STEP 4:		Connect to MongoDB
=========================================================================================================
To connect to MongoDB through the mongo.exe shell, open another Command Interpreter.
```
> "C:\Program Files\MongoDB\Server\4.0\bin\mongo.exe"
```
##### or
```
> I:\mongodb-win32-x86_64-enterprise-windows-64-4.0.9\bin\mongo.exe
```
##### or
```
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongo.exe
```

=========================================================================================================
#### STEP 5:		Enable MongoDB's free cloud-based monitoring service
=========================================================================================================
Which will then receive and display metrics about your deployment (disk utilization, CPU, operation statistics, etc).

##### 5.a. To enable free monitoring, run the following command:
```
> db.enableFreeMonitoring()
```
##### 5.b. To permanently disable this reminder, run the following command:
``` 
> db.disableFreeMonitoring()
```
=========================================================================================================
#### STEP 6:		Start MongoDB Enterprise Edition as a Windows Service
=========================================================================================================
* Starting in version 4.0, you can install and configure MongoDB as a Windows Service during the install, and the MongoDB service is started upon successful installation.

* To start/restart the service, you can use the Services Manager.

* You can also manage the service from the command line. To start the MongoDB service from the command line, invoke the following command:
```
> net start MongoDB
```
##### 6.1 Stop MongoDB Enterprise Edition as a Windows Service
* To stop/pause the MongoDB service, you can use the Services Manager.

* You can also manage the service from the command line. To stop the MongoDB service from the command line, invoke the following command:
```
> net stop MongoDB
```
##### 6.2 Remove MongoDB Enterprise Edition as a Windows Service
* To remove the MongoDB service, first stop the service and then run the following command:
```
> sc.exe delete MongoDB
```
=========================================================================================================
#### STEP 7:		Connect to MongoDB cloud
=========================================================================================================
##### 7.1. Open below link and login 
https://www.mongodb.com/download-center/cloud
