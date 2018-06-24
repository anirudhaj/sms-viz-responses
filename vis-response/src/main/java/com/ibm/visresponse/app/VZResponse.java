package com.ibm.visresponse.app;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//Model based on https://www.ibm.com/support/knowledgecenter/en/SSWU4L/Mobile/imc_Mobile/Mobile_q_a_watson_assistant/Karix_URL_shortening_and_tracking.html
	/*
	Sample URL - http://10.20.51.136:8105/request/ok.jsp?m=[mobile_number]&mw=[mobile_without_91]&ip=[IP]&dt=[device_type]&os=[operating_system]&pv=[platform_version]&bn=[browser_name]&bv=[browser_version]&ev=[engine_version]&en=[engine_name]&c=[country]&r=[region]&cy=[city]&l=[latitude]&l=[longitude]&dm=[device_make]&cd=[clicked_date]&ct=[clicked_time]&cn=[campaign_name]&ct=[campaign_type]&mid=[mid]
		Mobile Number
		IP Address
		Country
		Region
		City
		Latitude
		Longitude
		Clicked Date
		Clicked Time
		Device Type
		Device
		Operating System
		Browser Name
		Campaign Name
		Campaign Type
		Redirection URL
	*/
	

@Data
public class VZResponse {
	@Getter @Setter private String id;
	@Getter @Setter private String mobileNum;
	@Getter @Setter private String mobileNumWO91;
	@Getter @Setter private String ip;
	@Getter @Setter private String deviceType;
	@Getter @Setter private String os;
	@Getter @Setter private String platformVersion;
	@Getter @Setter private String browserName;
	@Getter @Setter private String browserVersion;
	@Getter @Setter private String engineVersion;
	@Getter @Setter private String engineName;
	@Getter @Setter private String country;
	@Getter @Setter private String region;
	@Getter @Setter private String city;
	@Getter @Setter private String latitude;
	@Getter @Setter private String longitude;
	@Getter @Setter private String deviceMake;
	@Getter @Setter private String clickDate;
	@Getter @Setter private String clickTime;
	@Getter @Setter private String campaignName;
	@Getter @Setter private String campaignType;
	@Getter @Setter private String redirectionURL;
}
