package com.ibm.visresponse.app;

import static spark.Spark.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.port;
import static spark.Spark.get;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;

public class Application {
	
	final Logger logger = LoggerFactory.getLogger(Application.class); 
	

	
	public static void main (String[] args) {
		final VZResponseService vzService = new VZResponseServiceMapImpl();
		
		port(8080);
		
		get("/hello", (req, res) -> "Hello World");
		
		post("/visresponse", (req, res)->{
			ObjectMapper mapper = new ObjectMapper();
			
			res.type("application/json");
			//VZResponse vz = new Gson().fromJson(req.body(), VZResponse.class);
			VZResponse vz = mapper.readValue(req.body(), VZResponse.class);
			vzService.addVZResponse(vz);
			
			res.status(200);
			
			//return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
			return new ObjectMapper().writeValueAsString(new StandardResponse(StatusResponse.SUCCESS));
		});

	}

}
