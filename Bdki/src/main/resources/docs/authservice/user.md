## User Api Spec
### Register User
#### Create Register

Request :

- Method : POST
- Endpoint : '/api/v1/auth/register/user'
- Header :
 -Content-Type: application/json
 -Accept : application/json
-Body
```json
{
    "email":"fhakfhbmd@gmail.com",
    "password":"user1",
    "name":"user1",
    "mobilePhone":"08541xx"
}
```

Response Succes :
```json
{
    "statusCode": 201,
    "message": "successfully registered",
    "data": {
        "email": "fhakfhbmd@gmail.com"
    }
}
```

Response Failed :
```json
{
    "statusCode": 409,
    "message": "User already exist"
}
```
#### Create Login

- Request Login :

- Method : POST
- Endpoint : '/api/v1/auth/register/user'
- Header :
  -Content-Type: application/json
  -Accept : application/json
  -Body
```json
{
 "email":"fhakfhbmd@gmail.com",
 "password":"userer1"
}
```


Response Succes :
```json
{
 "statusCode": 200,
 "message": "successfully login",
 "data": {
  "email": "fhakfhbmd@gmail.com",
  "roles": [
   "ROLE_REGULAR_USER"
  ],
  "token": "TOKEN"
 }
}
```

Response Failed :
```json
{
 "statusCode": 401,
 "message": "Bad credentials"
}
```






### Register Admin
#### Create Register

Request :

- Method : POST
- Endpoint : '/api/v1/auth/register/user'
- Header :
  -Content-Type: application/json
  -Accept : application/json
  -Body
```json
{
  "email" : "admin1@gmail.com",
  "password" : "admin1",
  "name" : "admin1",
  "mobilePhone" : "0850xxxx",
  "payCode" : "1"
}
```

Response Succes :
```json
{
  "statusCode": 201,
  "message": "successfully registered",
  "data": {
    "email": "admin1@gmail.com"
  }
}
```

Response Failed :
```json
{
  "statusCode": 409,
  "message": "Admin already exist"
}
```
#### Create Login

- Request Login :

- Method : POST
- Endpoint : '/api/v1/auth/register/user'
- Header :
  -Content-Type: application/json
  -Accept : application/json
  -Body
```json
{
 "email":"fhakfhbmd@gmail.com",
 "password":"userer1"
}
```


Response Succes :
```json
{
  "statusCode": 200,
  "message": "successfully login",
  "data": {
    "email": "admin1@gmail.com",
    "roles": [
      "ROLE_ADMIN"
    ],
    "token": "TOKEN"
  }
}
```

Response Failed :
```json
{
 "statusCode": 401,
 "message": "Bad credentials"
}
```




