# grpc-java
GRPC implementation (server and client) using java. 
For this example, there are two functionalities:
1. Greetings. A simple function as seen in many tutorials for grpc
2. A Flickr public photo feed. A (little bit more) complex functionality (in server side). Does not really matter in terms of `grpc` example, but it pretty much gives an idea about how it might work and the usage in "real" project.
   To use this, you have to have `API_KEY` and `SECRET_KEY` from *Flickr*. See https://www.flickr.com/services/api/ in (API Keys) for more info.
   Put the keys in `/component/FlickrConfig`
   

Server
```
src/main/java/FlickrFetcherServer.java
```


Client
```
src/main/java/FlickrFetcherClient.java
```

As this is an implementation using gRPC, you can implement the client in another languages (that are supported by gRPC).
