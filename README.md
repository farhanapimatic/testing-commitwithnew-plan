# Getting started

This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

## How to Use

The following section explains how to use the SwaggerPetstore library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *SwaggerPetstoreLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

Clicking the ``` Add ``` button will open a dialog where you need to specify SwaggerPetstore in ``` Group Id ``` and SwaggerPetstoreLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Swagger%20Petstore-Java&workspaceName=SwaggerPetstore&projectName=SwaggerPetstoreLib&rootNamespace=io.swagger.petstore)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *SwaggerPetstoreLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| oAuthClientId | OAuth 2 Client ID |
| oAuthRedirectUri | OAuth 2 Redirection endpoint or Callback Uri |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String oAuthClientId = "oAuthClientId"; // OAuth 2 Client ID
String oAuthRedirectUri = "oAuthRedirectUri"; // OAuth 2 Redirection endpoint or Callback Uri

SwaggerPetstoreClient client = new SwaggerPetstoreClient(oAuthClientId, oAuthRedirectUri);
```

You must authorize now authorize the client.

### Authorizing your client

Your application must obtain user authorization before it can execute an endpoint call.
The SDK uses *OAuth 2.0 Implicit Grant* to obtain a user's consent to perform an API request on user's behalf.

This process requires the presence of a client-side JavaScript code on the redirect URI page to 
receive the *access token* after the consent step is completed.

#### 1. Obtain consent

To obtain user's consent, you must redirect the user to the authorization page.
The `buildAuthorizationUrl()` method creates the URL to the authorization page.
 You must pass the *[scopes](#scopes)* for which you need permission to access.
```java
authUrl = client.auth().buildAuthorizationUrl(scopes);
httpServletResponse.sendRedirect(authUrl);
```

#### 2. Handle the OAuth server response

Once the user responds to the consent request, the OAuth 2.0 server responds to your application's access request by redirecting the user to the redirect URI specified set in `Configuration`.

The redirect URI will receive the *access token* as the `access_token` argument in the URL fragment.

```
https://example.com/oauth/callback#access_token=XXXXXXXXXXXXXXXXXXXXXXXXX
```

The access token must be extracted by the client-side JavaScript code. The access token can be used to authorize any further endpoint calls by the JavaScript code.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the `io.swagger.petstore.Models.OAuthScopeEnum` enumeration.

| Scope Name | Description |
| --- | --- |
| `WRITEPETS` | modify pets in your account |
| `READPETS` | read your pets |



# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [PetController](#pet_controller)
* [StoreController](#store_controller)
* [UserController](#user_controller)

## <a name="pet_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.swagger.petstore.controllers.PetController") PetController

### Get singleton instance

The singleton instance of the ``` PetController ``` class can be accessed from the API Client.

```java
PetController pet = client.getPet();
```

### <a name="add_pet_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.addPetAsync") addPetAsync

> Add a new pet to the store


```java
void addPetAsync(
        final Pet body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Pet object that needs to be added to the store |


#### Example Usage

```java
try {
    Pet body = new Pet();
    // Invoking the API call with sample inputs
    pet.addPetAsync(body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 405 | Invalid input |



### <a name="update_pet_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.updatePetAsync") updatePetAsync

> Update an existing pet


```java
void updatePetAsync(
        final Pet body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Pet object that needs to be added to the store |


#### Example Usage

```java
try {
    Pet body = new Pet();
    // Invoking the API call with sample inputs
    pet.updatePetAsync(body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid ID supplied |
| 404 | Pet not found |
| 405 | Validation exception |



### <a name="find_pets_by_status_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.findPetsByStatusAsync") findPetsByStatusAsync

> Multiple status values can be provided with comma separated strings


```java
void findPetsByStatusAsync(
        final List<Status2Enum> status,
        final APICallBack<List<Pet>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| status |  ``` Required ```  ``` Collection ```  | Status values that need to be considered for filter |


#### Example Usage

```java
List<Status2Enum> status = Arrays.asList (status2.AVAILABLE);// Invoking the API call with sample inputs
pet.findPetsByStatusAsync(status, new APICallBack<List<Pet>>() {
    public void onSuccess(HttpContext context, List<Pet> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid status value |



### <a name="find_pets_by_tags_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.findPetsByTagsAsync") findPetsByTagsAsync

> Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.


```java
void findPetsByTagsAsync(
        final List<String> tags,
        final APICallBack<List<Pet>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tags |  ``` Required ```  ``` Collection ```  | Tags to filter by |


#### Example Usage

```java
List<String> tags = new LinkedList<String>(Arrays.asList("tags"));
// Invoking the API call with sample inputs
pet.findPetsByTagsAsync(tags, new APICallBack<List<Pet>>() {
    public void onSuccess(HttpContext context, List<Pet> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid tag value |



### <a name="get_pet_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.getPetByIdAsync") getPetByIdAsync

> Returns a single pet


```java
void getPetByIdAsync(
        final long petId,
        final APICallBack<Pet> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| petId |  ``` Required ```  | ID of pet to return |


#### Example Usage

```java
long petId = 89;
// Invoking the API call with sample inputs
pet.getPetByIdAsync(petId, new APICallBack<Pet>() {
    public void onSuccess(HttpContext context, Pet response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid ID supplied |
| 404 | Pet not found |



### <a name="update_pet_with_form_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.updatePetWithFormAsync") updatePetWithFormAsync

> Updates a pet in the store with form data


```java
void updatePetWithFormAsync(
        final long petId,
        final String name,
        final String status,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| petId |  ``` Required ```  | ID of pet that needs to be updated |
| name |  ``` Optional ```  | Updated name of the pet |
| status |  ``` Optional ```  | Updated status of the pet |


#### Example Usage

```java
long petId = 89;
String name = "name";
String status = "status";
// Invoking the API call with sample inputs
pet.updatePetWithFormAsync(petId, name, status, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 405 | Invalid input |



### <a name="delete_pet_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.deletePetAsync") deletePetAsync

> Deletes a pet


```java
void deletePetAsync(
        final long petId,
        final String apiKey,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| petId |  ``` Required ```  | Pet id to delete |
| apiKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
long petId = 89;
String apiKey = "api_key";
// Invoking the API call with sample inputs
pet.deletePetAsync(petId, apiKey, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid ID supplied |
| 404 | Pet not found |



### <a name="upload_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.PetController.uploadFileAsync") uploadFileAsync

> uploads an image


```java
void uploadFileAsync(
        final long petId,
        final String additionalMetadata,
        final File file,
        final APICallBack<ApiResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| petId |  ``` Required ```  | ID of pet to update |
| additionalMetadata |  ``` Optional ```  | Additional data to pass to server |
| file |  ``` Optional ```  | file to upload |


#### Example Usage

```java
long petId = 89;
String additionalMetadata = "additionalMetadata";
File file = new File("PathToFile");
// Invoking the API call with sample inputs
pet.uploadFileAsync(petId, additionalMetadata, file, new APICallBack<ApiResponse>() {
    public void onSuccess(HttpContext context, ApiResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="store_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.swagger.petstore.controllers.StoreController") StoreController

### Get singleton instance

The singleton instance of the ``` StoreController ``` class can be accessed from the API Client.

```java
StoreController store = client.getStore();
```

### <a name="get_inventory_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.StoreController.getInventoryAsync") getInventoryAsync

> Returns a map of status codes to quantities


```java
void getInventoryAsync(
        final APICallBack<LinkedHashMap<String, Integer>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
store.getInventoryAsync(new APICallBack<LinkedHashMap<String, Integer>>() {
    public void onSuccess(HttpContext context, LinkedHashMap<String, Integer> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_place_order_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.StoreController.createPlaceOrderAsync") createPlaceOrderAsync

> Place an order for a pet


```java
void createPlaceOrderAsync(
        final Order body,
        final APICallBack<Order> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | order placed for purchasing the pet |


#### Example Usage

```java
try {
    Order body = new Order();
    // Invoking the API call with sample inputs
    store.createPlaceOrderAsync(body, new APICallBack<Order>() {
        public void onSuccess(HttpContext context, Order response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid Order |



### <a name="get_order_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.StoreController.getOrderByIdAsync") getOrderByIdAsync

> For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions


```java
void getOrderByIdAsync(
        final long orderId,
        final APICallBack<Order> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | ID of pet that needs to be fetched |


#### Example Usage

```java
long orderId = 89;
// Invoking the API call with sample inputs
store.getOrderByIdAsync(orderId, new APICallBack<Order>() {
    public void onSuccess(HttpContext context, Order response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid ID supplied |
| 404 | Order not found |



### <a name="delete_order_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.StoreController.deleteOrderAsync") deleteOrderAsync

> For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors


```java
void deleteOrderAsync(
        final long orderId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | ID of the order that needs to be deleted |


#### Example Usage

```java
long orderId = 89;
// Invoking the API call with sample inputs
store.deleteOrderAsync(orderId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid ID supplied |
| 404 | Order not found |



[Back to List of Controllers](#list_of_controllers)

## <a name="user_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.swagger.petstore.controllers.UserController") UserController

### Get singleton instance

The singleton instance of the ``` UserController ``` class can be accessed from the API Client.

```java
UserController user = client.getUser();
```

### <a name="create_user_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.createUserAsync") createUserAsync

> This can only be done by the logged in user.


```java
void createUserAsync(
        final User body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Created user object |


#### Example Usage

```java
try {
    User body = new User();
    // Invoking the API call with sample inputs
    user.createUserAsync(body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | successful operation |



### <a name="create_users_with_array_input_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.createUsersWithArrayInputAsync") createUsersWithArrayInputAsync

> Creates list of users with given input array


```java
void createUsersWithArrayInputAsync(
        final List<User> body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  ``` Collection ```  | List of user object |


#### Example Usage

```java
try {
    List<User> body = new ArrayList<User>();
    // Invoking the API call with sample inputs
    user.createUsersWithArrayInputAsync(body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | successful operation |



### <a name="create_users_with_list_input_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.createUsersWithListInputAsync") createUsersWithListInputAsync

> Creates list of users with given input array


```java
void createUsersWithListInputAsync(
        final List<User> body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  ``` Collection ```  | List of user object |


#### Example Usage

```java
try {
    List<User> body = new ArrayList<User>();
    // Invoking the API call with sample inputs
    user.createUsersWithListInputAsync(body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | successful operation |



### <a name="get_login_user_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.getLoginUserAsync") getLoginUserAsync

> Logs user into the system


```java
void getLoginUserAsync(
        final String username,
        final String password,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| username |  ``` Required ```  | The user name for login |
| password |  ``` Required ```  | The password for login in clear text |


#### Example Usage

```java
String username = "username";
String password = "password";
// Invoking the API call with sample inputs
user.getLoginUserAsync(username, password, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid username/password supplied |



### <a name="get_logout_user_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.getLogoutUserAsync") getLogoutUserAsync

> Logs out current logged in user session


```java
void getLogoutUserAsync(final APICallBack<Object> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
user.getLogoutUserAsync(new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | successful operation |



### <a name="get_user_by_name_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.getUserByNameAsync") getUserByNameAsync

> Get user by user name


```java
void getUserByNameAsync(
        final String username,
        final APICallBack<User> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| username |  ``` Required ```  | The name that needs to be fetched. Use user1 for testing. |


#### Example Usage

```java
String username = "username";
// Invoking the API call with sample inputs
user.getUserByNameAsync(username, new APICallBack<User>() {
    public void onSuccess(HttpContext context, User response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid username supplied |
| 404 | User not found |



### <a name="update_user_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.updateUserAsync") updateUserAsync

> This can only be done by the logged in user.


```java
void updateUserAsync(
        final String username,
        final User body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| username |  ``` Required ```  | name that need to be updated |
| body |  ``` Required ```  | Updated user object |


#### Example Usage

```java
try {
    String username = "username";
    User body = new User();
    // Invoking the API call with sample inputs
    user.updateUserAsync(username, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid user supplied |
| 404 | User not found |



### <a name="delete_user_async"></a>![Method: ](https://apidocs.io/img/method.png "io.swagger.petstore.controllers.UserController.deleteUserAsync") deleteUserAsync

> This can only be done by the logged in user.


```java
void deleteUserAsync(
        final String username,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| username |  ``` Required ```  | The name that needs to be deleted |


#### Example Usage

```java
String username = "username";
// Invoking the API call with sample inputs
user.deleteUserAsync(username, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid username supplied |
| 404 | User not found |



[Back to List of Controllers](#list_of_controllers)



