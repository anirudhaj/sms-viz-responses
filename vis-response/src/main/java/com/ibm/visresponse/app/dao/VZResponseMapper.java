package com.ibm.visresponse.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibm.visresponse.app.VZResponse;

public class VZResponseMapper implements RowMapper<VZResponse> {
	public VZResponse mapRow(ResultSet rs, int rownum) throws SQLException {
		VZResponse vz = new VZResponse();
		
		vz.setId(rs.getString("id"));
		vz.setMobileNum(rs.getString("MobileNum"));
		vz.setMobileNumWO91(rs.getString("MobileNumWO91"));
		vz.setIp(rs.getString("ip"));
		vz.setDeviceType(rs.getString("dt"));
		vz.setOs(rs.getString("os"));
		vz.setPlatformVersion(rs.getString("pv"));
		vz.setBrowserName(rs.getString("bn"));
		vz.setBrowserVersion(rs.getString("bv"));
		vz.setEngineVersion(rs.getString("ev"));
		vz.setEngineName(rs.getString("en"));
		vz.setCountry(rs.getString("c"));
		vz.setRegion(rs.getString("r"));
		vz.setCity(rs.getString("cy"));
		vz.setLatitude(rs.getString("la"));
		vz.setLongitude(rs.getString("lo"));
		vz.setDeviceMake(rs.getString("dm"));
		vz.setClickDate(rs.getString("cd"));
		vz.setClickTime(rs.getString("ct"));
		vz.setCampaignName(rs.getString("cn"));
		vz.setCampaignType(rs.getString("cmt"));
		vz.setRedirectionURL(rs.getString("mid"));
		
		return vz;
	}
}
