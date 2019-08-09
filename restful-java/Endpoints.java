
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
	
//	@GET 
//	@Path("/colleges/test")
//	@Produces("application/json")
//	public InputStream setSchool() throws Exception {
//		
//		String command = ""+/**~!{*/" curl -X PATCH --data '{"
//				  + "\r\n\"touro\": {"
//				  + "\r\n  \"code\": \"FLHS01\","
//				  + "\r\n  \"courses\": {"
//						+ "\r\n\"accounting\": \"ACCT\","
//						+ "\r\n\"computer science\": \"CSCI\""
//					+ "\r\n"
//					+ "\r\n}"
//				  + "\r\n}"
//				+ "\r\n}' 'https://restful-java-87120.firebaseio.com/colleges.json?print=pretty'"/**}*/;
//		
//		System.out.println(command);
//		Process process = Runtime.getRuntime().exec(command);
//		return process.getInputStream();
//	}
//	@GET @Path("/score/wins")@Produces("text/plain")
//	public int getWins() {
//		return Score.WINS;
//	}
//	
//	@GET @Path("/score/losses")@Produces("text/plain")
//	public int getLosses() {
//		return Score.LOSSES;
//	}
//	
//	@GET @Path("/score/ties")@Produces("text/plain")
//	public int getTies() {
//		return Score.TIES;
//	}
//	
//	@POST @Path("/score/wins")@Produces("text/plain")
//	public int increaseWins() {
//		return Score.WINS += 1;
//	}
//	
//	@POST @Path("/score/losses")@Produces("text/plain")
//	public int increaseLosses() {
//		return Score.LOSSES += 1;
//	}
//	
//	@POST @Path("/score/ties")@Produces("text/plain")
//	public int increaseTies() {
//		return Score.TIES += 1;
//	}
	
//	@GET
//	@Path("/score")
//	@Produces("application/json")
//	public String getScore() {
//		String pattern = "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
//		return String.format(pattern, Score.WINS, Score.LOSSES, Score.TIES);
//	}
//	
//	@PUT
//	@Path("/score")
//	@Produces("application/json")
//	public String update(@QueryParam("wins") int wins, 
//	                     @QueryParam("losses") int losses, 
//	                     @QueryParam("ties")   int ties) {
//	   Score.WINS   = wins;
//	   Score.TIES   = ties;
//	   Score.LOSSES = losses;
//	   String pattern = 
//	      "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
//	   return String.format(pattern,  Score.WINS, Score.LOSSES, Score.TIES );
//	}
}
