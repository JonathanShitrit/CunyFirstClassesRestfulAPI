# CunyFirstClassesRestfulAPI
A Restful API for retrieving information about classes for each CUNY college

## Endpoints
All data is vied as json objects
@GET @Path("/colleges") // Returns all data
  
@GET @Path("/colleges/{school}") // Returns all data for specified college. ex: http://localhost:8080/restful-java/colleges/queens-college
