package org.praneeth.umkc.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/ftocservice")
public class FeetToCm {
	@GET
	@Produces("application/xml")
	public String convertFtoC() {
 
		Double cm;
		Double feet = 1.0;
		cm = 30.48 * feet;
 
		//String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ftocmservice>" + "<feet>" + feet + "</feet>" + "<ftocmoutput>" + cm + "</ftocmoutput>" + "</ftocmservice>";
	}
 
	@Path("{f}")
	@GET
	@Produces("application/xml")
	public String convertFtoCfromInput(@PathParam("f") Double f) {
		Double cm;
		Double  feet = f;
		cm = 30.48 * feet;
 
		//String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ftocmservice>" + "<feet>" + feet + "</feet>" + "<ftocmoutput>" + cm + "</ftocmoutput>" + "</ftocmservice>";
	}
}