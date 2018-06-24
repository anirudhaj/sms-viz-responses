package com.ibm.visresponse.app;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VZResponseServiceMapImpl implements VZResponseService {
	
	final Logger logger = LoggerFactory.getLogger(VZResponseServiceMapImpl.class); 
	
	private HashMap<Integer, VZResponse> vzResponseMap;
	private int count = 1;

	public VZResponseServiceMapImpl() {
		vzResponseMap = new HashMap<>();
	}
	
	@Override
	public void addVZResponse(VZResponse vz) {
		vzResponseMap.put(count, vz);
		count++;
		logger.debug(vz.toString());
		logger.debug(Integer.toString(vzResponseMap.size()));
	}
	
	

}
