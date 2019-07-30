# CunyFirstClassesRestfulAPI
A Restful API for retrieving information about classes for each CUNY college

All data is viewed as json objects

## Endpoints

@GET @Path("/colleges")
* Returns all data
  
@GET @Path("/colleges/{school}") 
* Returns all data for specified college. In url put your desired school, ex: http://localhost:8080/restful-java/colleges/queens-college
