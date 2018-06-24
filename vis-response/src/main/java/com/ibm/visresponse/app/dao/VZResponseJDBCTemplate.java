package com.ibm.visresponse.app.dao;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ibm.visresponse.app.VZResponse;

public class VZResponseJDBCTemplate implements VZResponseDAO{
	final Logger log = LoggerFactory.getLogger(VZResponseJDBCTemplate.class); 
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	      
	      log.debug("JDBC Template Datasouce is set.");
	}
	
	public void create (VZResponse vz) {
		
		String insertQuery = "insert into VZResponse (" +
				"mobileNum, " + 
				"mobileNumWO91, " + 
				"ip, " + 
				"deviceType, " + 
				"os, " + 
				"platformVersion, " + 
				"browser_name, " + 
				"browser_version, " + 
				"engine_version, " + 
				"engine_name, " + 
				"country, " + 
				"region, " + 
				"city, " + 
				"latitude, " + 
				"longitude, " + 
				"device_make, " + 
				"clicked_date, " + 
				"clicked_time, " + 
				"campaign_name, " + 
				"campaign_type, " + 
				"rd_url )" +
				"values (?, ?, ?, ?, ?, " +
				        "?, ?, ?, ?, ?, " +
				        "?, ?, ?, ?, ?, " +
				        "?, ?, ?, ?, ?, " +
				        "? );";
	    jdbcTemplateObject.update( insertQuery, 
	    		vz.getMobileNum(),
	    		vz.getMobileNumWO91(),
	    		vz.getIp(),
	    		vz.getDeviceType(),
				vz.getOs(),
				vz.getPlatformVersion(),
				vz.getBrowserName(),
				vz.getBrowserVersion(),
				vz.getEngineVersion(),
				vz.getEngineName(),
				vz.getCountry(),
				vz.getRegion(),
				vz.getCity(),
				vz.getLatitude(),
				vz.getLongitude(),
				vz.getDeviceMake(),
				vz.getClickDate(),
				vz.getClickTime(),
				vz.getCampaignName(),
				vz.getCampaignType(),
				vz.getRedirectionURL());
	    
	    log.debug("JDBC Template row inserted.");
		return;
	}

}
