
import javax.ws.rs.core.Application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.*;

@ApplicationPath("/")
public class Endpoints extends Application {
	
	public Set<Class<?>> getClasses() { 
		return new HashSet<Class<?>>(Arrays.asList(Endpoints.class)); 
	} 
	
	@GET
	@Path("/colleges")
	@Produces("application/json")
	public InputStream getColleges() throws Exception {		
		String command = "curl " + "https://restful-java-87120.firebaseio.com/colleges.json?print=pretty";
		Process process = Runtime.getRuntime().exec(command);
		return process.getInputStream();

	}
	
	@GET 
	@Path("/colleges/{school}")
	@Produces("text/plain")
	public InputStream getSchool(@PathParam("school") String school) throws Exception {		
		String command = "curl " + "https://restful-java-87120.firebaseio.com/colleges/"+school+".json?print=pretty";
		Process process = Runtime.getRuntime().exec(command);
		return process.getInputStream();
	}
	
	@GET 
	@Path("/colleges/{school}/{subject}")
	@Produces("text/plain")
	public InputStream getClassesInSubject(@PathParam("school") String school,
								@PathParam("subject") String subject) throws Exception {		
		String command = "curl " + "https://restful-java-87120.firebaseio.com/colleges/"+school+"/"+subject+".json?print=pretty";
		Process process = Runtime.getRuntime().exec(command);
		return process.getInputStream();
	}
}
