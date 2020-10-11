How to run this application?

1. Clone this repository on your local machine
2. Open the cloned folder as an IntelliJ Idea project
3. Auto-import packages
4. Run the application

API 

Base url: http://localhost:8080/

1. Count all unique emails 

path: api/emails/count-unique

Request method: POST

Payload: List&lt;String&gt;

Example:
```
[
"test.email@gmail.com",
"test.email+spam@gmail.com",
"testemail@gmail.com"
]
```

Response:

Success Response:
``` 
{
    "status": 200,
    "message": "Emails Validated.",
    "data": Count of Unique emails
}   
```

Failure Response:
```
{
    "status": 500,
    "message": "Error Message",
    "data": null
}
```