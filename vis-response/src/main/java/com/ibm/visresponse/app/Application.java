package com.ibm.visresponse.app;

import static spark.Spark.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static spark.Spark.port;
import static spark.Spark.get;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;

public class Application {
	
	final Logger log = LoggerFactory.getLogger(Application.class); 
	

	
	public static void main (String[] args) {
		final VZResponseService vzService = new VZResponseServiceDBImpl();
		
		port(8080);
		
		get("/hello", (req, res) -> "Hello World");
		
		post("/visresponsejson", (req, res)->{
			ObjectMapper mapper = new ObjectMapper();
			
			res.type("application/json");
			//VZResponse vz = new Gson().fromJson(req.body(), VZResponse.class);
			VZResponse vz = mapper.readValue(req.body(), VZResponse.class);
			vzService.addVZResponse(vz);
			
			res.status(200);
			
			//return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
			return new ObjectMapper().writeValueAsString(new StandardResponse(StatusResponse.SUCCESS));
		});
		
		post("/visresponse", (req, res)->{
			final Logger log = LoggerFactory.getLogger(Application.class); 
			
			VZResponse vz = new VZResponse();
			vz.setMobileNum(req.queryParams("m"));
			vz.setMobileNumWO91(req.queryParams("mw"));
			vz.setIp(req.queryParams("ip"));
			vz.setDeviceType(req.queryParams("dt"));
			vz.setOs(req.queryParams("os"));
			vz.setPlatformVersion(req.queryParams("pv"));
			vz.setBrowserName(req.queryParams("bn"));
			vz.setBrowserVersion(req.queryParams("bv"));
			vz.setEngineVersion(req.queryParams("ev"));
			vz.setEngineName(req.queryParams("en"));
			vz.setCountry(req.queryParams("c"));
			vz.setRegion(req.queryParams("r"));
			vz.setCity(req.queryParams("cy"));
			vz.setLatitude(req.queryParams("la"));
			vz.setLongitude(req.queryParams("lo"));
			vz.setDeviceMake(req.queryParams("dm"));
			vz.setClickDate(req.queryParams("cd"));
			vz.setClickTime(req.queryParams("ct"));
			vz.setCampaignName(req.queryParams("cn"));
			vz.setCampaignType(req.queryParams("cmt"));
			vz.setRedirectionURL(req.queryParams("mid"));
			
			log.debug("Received response for mobile number " + req.queryParams("m"));
			
			res.type("application/json");
			vzService.addVZResponse(vz);
			
			
			return new ObjectMapper().writeValueAsString(new StandardResponse(StatusResponse.SUCCESS));
		});

	}

}
