package com.ibm.visresponse.app;

//import com.google.gson.JsonElement;

import lombok.Getter;
import lombok.Setter;

public class StandardResponse {
	
	@Getter @Setter private StatusResponse status;
	@Getter @Setter private String message;
	//@Getter @Setter private JsonElement data;
	
	public StandardResponse(StatusResponse status) {
        this.status = status;
    }

    public StandardResponse(StatusResponse status, String message) {
        this.status = status;
        this.message = message;
    }
    
    /*
    public StandardResponse(StatusResponse status, JsonElement data) {
        this.status = status;
        this.data = data;
    }
    */
    
}
