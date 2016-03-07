package org.praneeth.umkc.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/ptokservice")
public class PoundsToKg {
	@GET
	@Produces("application/xml")
	public String convertPtoK() {
 
		Double kg;
		Double pound = 1.0;
		kg = 0.453592 * pound;
 
		//String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ptokgservice>" + "<pound>" + pound + "</pound>" + "<ptokgoutput>" + kg + "</ptokgoutput>" + "</ptokgservice>";
	}
 
	@Path("{p}")
	@GET
	@Produces("application/xml")
	public String convertPtoKfromInput(@PathParam("p") Double p) {
		Double kg;
		Double pound = p;
		kg = 0.453592 * pound;
 
		//String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ptokgservice>" + "<pound>" + pound + "</pound>" + "<ptokgoutput>" + kg + "</ptokgoutput>" + "</ptokgservice>";
	}
}