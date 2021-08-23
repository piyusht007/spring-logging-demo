# spring-logging-demo

* Spring boot logging using `logback-spring.xml` to showcase logging using different spring profiles.
* Spring WEB Flux to showcase an endpoint using Reactive backend.

## Sample Request & Response
```shell
curl -XGET 'http://localhost:9999/serve'
```

```json
{
   "data":{
      "id":"1",
      "email":"george.bluth@reqres.in",
      "avatar":"https://reqres.in/img/faces/1-image.jpg",
      "first_name":"George",
      "last_name":"Bluth"
   }
}
```