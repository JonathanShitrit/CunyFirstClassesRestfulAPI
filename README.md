# CunyFirstClassesRestfulAPI
A Restful API for retrieving the courses provided at each CUNY college. The database is a Firebase Realtime Database.

All data is viewed as json objects.

## End-points

### Colleges
The base end-point is "colleges". It returns all the courses provided for ALL the CUNY colleges.
ex: "https://restful-java-87120.firebaseio.com/colleges.json?print=pretty"


### Colleges/{school}
The next end-point is a specified college name. This name MUST be the same college name that is shown with the previous command. It returns all the courses provided for THIS CUNY colleges.
ex: "https://restful-java-87120.firebaseio.com/colleges/york-college.json?print=pretty"



*Specifying print=pretty returns the data in a human-readable format.

You can read more about using the firebase realtime database on their documentation here: https://firebase.google.com/docs/database/rest/retrieve-data
