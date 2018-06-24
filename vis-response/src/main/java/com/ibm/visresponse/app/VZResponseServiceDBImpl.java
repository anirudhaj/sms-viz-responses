package com.ibm.visresponse.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.visresponse.app.dao.VZResponseJDBCTemplate;

public class VZResponseServiceDBImpl implements VZResponseService {
	
	final Logger log = LoggerFactory.getLogger(VZResponseServiceDBImpl.class); 
	
	
	@SuppressWarnings("resource")
	@Override
	public void addVZResponse(VZResponse vz) {
		//log.debug("Received response for mobile number " + vz.getMobileNum());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");		
		VZResponseJDBCTemplate vzJDBCTemplate = (VZResponseJDBCTemplate)context.getBean("VZResponseJDBCTemplate");
		vzJDBCTemplate.create(vz);
		log.debug("Response created");
		
	}
	
	

}
