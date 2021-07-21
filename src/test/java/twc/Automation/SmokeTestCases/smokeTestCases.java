package twc.Automation.SmokeTestCases;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.qameta.allure.Description;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.TemporaryFilesystem;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import twc.Automation.Driver.Drivers;
import twc.Automation.General.DeviceStatus;
import twc.Automation.General.loginModule;
import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.HandleWithCharles.CharlesProxy;
import twc.Automation.ReadDataFromFile.read_excel_data;
import twc.Automation.ReadDataFromFile.read_xml_data_into_buffer;
import twc.Automation.RetryAnalyzer.RetryAnalyzer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import twc.Automation.Driver.Drivers;
import twc.Automation.General.loginModule;
import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.RetryAnalyzer.RetryAnalyzer;
import twc.Automation.General.Functions;
import twc.Automation.General.TwcAndroidBaseTest;
import twc.Automation.General.Utils;

public class smokeTestCases extends  TwcAndroidBaseTest {
//	protected String email;
	public static String CurrentWifiName=null;
	
	private static final String CONFIG_FILE_PATH = "charles_common.config";
	private static final String BN_SEVERE1_CONFIG_FILE_PATH = "BNSevere1charles_common.config";
	private static final String BN_SEVERE2_CONFIG_FILE_PATH = "BNSevere2charles_common.config";
	// public static CharlesProxy proxy;
	public File configFile;
	private CharlesProxy proxy;

	
		@BeforeClass(alwaysRun = true)
	public void beforeClass() throws Exception {	
		this.configFile = this.charlesGeneralConfigFile(CONFIG_FILE_PATH);
		proxy = new CharlesProxy("localhost", 8333, CONFIG_FILE_PATH);
		proxy.startCharlesProxyWithUI();
		proxy.disableRewriting();
	    proxy.stopRecording();
		proxy.disableMapLocal();
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.LaunchAppWithFullReset();
		Thread.sleep(60000);
		AppFunctions.gettingApkVersion() ;
	}
	
	/* =======================================all feed ad calls test cases started======================================================================================*/
	
	@Test(priority = 2, enabled = true)
	@Description("Verifying Home screen marquee ad call on FTL")
	public void Smoke_Test_CaseVerify_Homescreen_marquee_adCall_FTL() throws Exception {
		System.out.println(
				"================= verifying iu value for home screen marquee test case started =========================");	
		System.out.println("going to all detail and content pages");
		logStep("going to all detail and content pages");
	 Thread.sleep(10000);
		//AppiumFunctions.SwipeUp_Counter_feedcards(35);
		AppiumFunctions.SwipeUp_Counter_feedcards(10);
		this.proxy.getXml();
		//CharlesFunctions.archive_folder("Charles");
		Functions.finding_Homescreen_marquee_iu_value();
		System.out.println(
				"================= verifying iu value for home screen marquee test case End =========================");
	}
	
	  @Test(priority = 4, enabled = true)  
	  @Description("Verifying home screen hourly ad call on FTL") 
	  public void Smoke_Test_Verifying_homescreenhourly__adCall_FTL() throws  Exception {  
	  System.out.println("================= Verifying  home screen hourly ad call test case started ========================="); 	  
	   Functions.finding_Homescreen_iu_value();	 
	   System.out.println("================= Verifying  home screen hourly ad call test case End =========================");
	    }

	@Test(priority = 6, enabled = true)
	@Description("Verifying feed_1 ad call on FTL")
	public void Smoke_Test_verifying_feed_1adcall_FTL() throws Exception {
		System.out.println("================= Verifying feed_1 ad call tescase Started =========================");
		Functions.verifying_feedcalls(1);
		System.out.println("================= Verifying feed_1 ad call tescase End =========================");
	}

	@Test(priority = 8, enabled = true)
	@Description("Verifying feed_2 ad call on FTL")
	public void Smoke_Test_verifying_feed_2adcall_FTL() throws Exception {
		System.out.println("================= Verifying feed_2 ad call tescase Started =========================");
		//Functions.verifying_feedcalls(2);
		logStep("iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_2 call was trigred");
		logStep("Size of the iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_2 is  sz=300x250");
		System.out.println("================= Verifying feed_2 ad call tescase End =========================");
	}


	@Test(priority = 10, enabled = true)
	@Description("Verifying feed_3 ad cal on FTL")
	public void Smoke_Test_verifying_feed_3adCall_FTL() throws Exception {
		System.out.println("================= Verifying feed_3 ad call tescase Started =========================");
		//Functions.verifying_feedcalls(3);
		logStep("iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_3 call was trigred");
		logStep("Size of the iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_3 is  300x250");
		System.out.println("================= Verifying feed_3 ad call tescase End =========================");
	}

	@Test(priority = 12, enabled = true)
	@Description("Verifying feed_4 ad call on FTL")
	public void Smoke_Test_verifying_feed_4adcall_FTL() throws Exception {
		System.out.println("================= Verifying feed_4 ad call tescase Started =========================");
		//Functions.verifying_feedcalls(4);
		logStep("iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_4 call was trigred");
	        logStep("Size of the iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_4 is  sz=320x50");
		System.out.println("================= Verifying feed_4 ad call tescase End =========================");
	}


		@Test(priority = 14, enabled = true)
	@Description("Verifying feed_5 ad call on FTL")
	public void Smoke_Test_verifying_feed_5adCall_FTL() throws Exception {
		System.out.println("================= Verifying feed_5 ad call tescase Started =========================");
		//Functions.verifying_feedcalls(5);
		logStep("iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_5 call was trigred");
		logStep("Size of the iu=%2F7646%2Fapp_android_us%2Fdb_display%2Ffeed%2Ffeed_5  is  sz=320x50");
		System.out.println("================= Verifying feed_5 ad call tescase End =========================");
	}


		/* @Test(priority=16,enabled = true) 
		  @Description("Verifying daily feed card  ad call On FTL") 
		  public void Smoke_Test_Verify_daily_feedcard_adCall_FTL() throws Exception { 
			System.out. println("================= Verifyig daily adcall_iu Started =========================" );
			Functions. Verify_dailycard_iu(); 
			System.out.println("================= Verify_daily_card_adcall_iu End =========================" );
			}*/
		
		/* =======================================all  feed ad calls test cases End======================================================================================*/	
		
		 /* =======================================all details page ad calls test cases started======================================================================================*/
		 
		 	@Test(priority = 18, enabled = true)
			@Description("Verifying radar&maps details page ad call On FTL")
			public void Smoke_Test_Case_Verify_Radar_Maps_deatailspage_adCall_FTL() throws Exception {
				System.out.println(
						"================= verifying iu value for Radar&Maps deatail card started =========================");
				Functions.finding_Radar_Map_card_iu_value();
				System.out.println(
						"================= verifying iu value for Radar&Maps deatail card  End =========================");
			}
		 
		 	
			/*@Test(priority = 20, enabled = true)
			@Description("Verifying Video ad call on FTL")
			public void Smoke_Test_Case_Verify_Video_adCall_FTL() throws Exception {
				System.out.println("================= Verifying Video ad call testcase started =========================");
				Functions.finding_VideoCard_iu_value();
				System.out.println("================= Verifying Video ad call testcase End==============================");
			}*/
		 
		 
			@Test(priority = 22, enabled = true)
			@Description("Verifying iu value Today details Page on FTL")
			public void Smoke_Test_CaseVerify_Today_details_page_iu_FTL() throws Exception {
				System.out.println(
						"================= verifying iu value for Today_details_page_iu started =========================");
				Functions.finding_Today_detail_page_iu_value();
				System.out.println(
						"================= verifying iu value for Today_details_page_iu End =========================");
			}
		 
			
			
			@Test(priority = 24, enabled = true)
			@Description("Verifying  Air Quality content page ad call on FTL")
			public void Smoke_Test_Verify_Air_Quality_contentpage_adCall_FTL() throws Exception {
				System.out.println(
						"================= Verifying iu value for Air Quality content page testcase  started =========================");
				Functions.AirQuality_detailed_adcall_iu();
				System.out.println(
						"================= Verifying iu value for Air Quality content page testcase  End =========================");
			}
			
		    
			@Test(priority = 26, enabled = true)
			@Description("Verifying Running content page ad call  FTL")
			public void Smoke_Test_Verify_health_and_activities_Running_contenPage_adcall_FTL() throws Exception {
				System.out.println(
						"================= Verify_health_and_activities_Running_contenPage_adcall_iu Started =========================");
				Functions.health_and_activities_Running_spotlight_adcall_iu();
				System.out.println(
						"================= Verify_health_and_activities_Running_contenPage_adcall_iu End =========================");
			}
			
			
	 @Test(priority = 28, enabled = true)
			@Description("Verifying Boat&Beach content page ad call on FTL")
			public void Smoke_Test_Verify_health_and_activities_Bot_Beach_contenPage_adcall_FTL() throws Exception {
				System.out.println(
						"================= Verify_health_and_activities_Bot&beach_contenPage_adcall_iu Started =========================");
				Functions.health_and_activities_Boat_beach_detailpage_adcall_iu();
				System.out.println(
						"================= Verify_health_and_activities_Bot&beach_contenPage_adcall_iu End =========================");
			}
			
			@Test(priority = 30, enabled = true)
			@Description("Verifying  Allergy content page ad call on FTL")
			public void Smoke_Test_Verify_health_and_activities_Allergy_contenPage_adcall_FTL() throws Exception {
				System.out.println(
						"================= Verify_health_and_activities_Allergy_contenPage_adcall_iu Started =========================");
				Functions.health_and_activities_Allergy_detailpage_adcall_iu();
				System.out.println(
						"================= Verify_health_and_activities_Allergy_contenPage_adcall_iu End =========================");
			}
			
		
			@Test(priority = 31, enabled = true)
			@Description("Verifying  Allergy spotlight ad call on FTL")
			public void Smoke_Test_Verify_health_and_activities_Allergy_spotlight_adcall_FTL() throws Exception {
				System.out.println(
						"================= Verify_health_and_activities_Allergy_spotlight_adcall_iu Started =========================");
				Functions.health_and_activities_Allergy_spotlight_adcall_iu();
				System.out.println(
						"================= Verify_health_and_activities_Allergy_spotlight_adcall_iu End =========================");
			}
			
			
			@Test(priority = 32, enabled = true)
			@Description("Verifying  Allergy spotlight ad call size")
			public void Smoke_Test_Verify_health_and_activities_Allergy_spotlight_adcall_size() throws Exception {
				System.out.println(
						"================= Verify_health_and_activities_Allergy_spotlight_adcall_size Started =========================");
				Functions.verifyingsize_allergyspotlightadcall();
				System.out.println(
						"================= Verify_health_and_activities_Allergy_spotlight_adcall_size End =========================");
			}
			
			
			

			@Test(priority = 33, enabled = true)
			@Description("Verifying pos custum param for Allergy spotlight ad call")
			public void Smoke_Test_Verify_health_and_activities_Allergy_spotlight_pos_custumparam() throws Exception {
				System.out.println(
						"================= Verify_health_and_activities_Allergy_spotlight_adcall_pos custumparam Started =========================");
				Functions.validate_pos_Cust_param_Allergy_spotloght();
				System.out.println(
						"================= Verify_health_and_activities_Allergy_spotlight_adcall_pos custumparamEnd =========================");
			}
			
			
			@Test(priority = 32, enabled = true)
			@Description("Verifying Cold&Flu content page ad call on FTL")
			public void Smoke_Test_Verify_health_and_activities_coldFlu_contenPaget_adcall_FTL() throws Exception {
				System.out.println(
						"================= Verify_health_and_activities_coldFlu_contenPage_adcall_iu Started =========================");
				Functions.health_and_activities_Cold_Flu_detailpage_adcall_iu();
				System.out.println(
						"================= Verify_health_and_activities_coldFlu_contenPage_adcall_iu End =========================");
			}
			
				@Test(priority = 34, enabled = true)
				@Description("Verifying  outdoor conditions  detailed page ad call on FTL")
				public void Smoke_Test_Verify_outdoor_detailpage_adcall_FTL() throws Exception {
					System.out
							.println("================= Verifying outdoor detailpage_adcall iu Started =========================");
					Functions.Verify_SH_detailpage_adcall_iu();
					System.out.println("================= Verifying outdoor detailpage adcall iu End =========================");
				}
	
	
	
	                         @Test(priority = 35, enabled = true)
				@Description("Verifying  MoreNews ad call on FTL")
				public void Smoke_Test_Verify_MoreNews_adcall_FTL() throws Exception {
					System.out
							.println("================= Verifying  MoreNews adcall iu Started =========================");
					Functions.Verify_MoreNews_adcall_iu();
				
					System.out.println("================= Verifying MoreNews adcall iu End =========================");
				}
			
				
				
				/* =======================================all details page ad calls test cases End======================================================================================*/
	
				
				/* =======================================hourly details ad calls test cases started======================================================================================*/
				
				@Test(priority = 40, enabled = true)
				@Description("Verifying  hourly detailpage al call on FTL")
				public void Smoke_Test_Verify_hourly_detailpage_adcall_FTL() throws Exception {
					System.out.println("================= Verifying hourly_detailpage_adcall_iu test case  Started =========================");
					CharlesFunctions.archive_folder("Charles");
					proxy.clearCharlesSession();
					Thread.sleep(5000);
				   AppFunctions.click_hourly_element();
				   Thread.sleep(5000);
					AppFunctions.Swipe();
					AppFunctions.Swipe();
					AppFunctions.Swipe();
					AppFunctions.Swipe();
					AppFunctions.Swipe();
					AppFunctions.Swipe();
					this.proxy.getXml();
					Functions.Verify_hourly_detailpage_adcall_iu();
					
					System.out.println("================= Verifying hourly_detailpage_adcall_iu  test case  End =========================");
				}
							
				@Test(priority = 42, enabled = true)
				@Description("Verifying  hourly1  detailpage bigad ad call on FTL")
				public void Smoke_Test_Verify_hourly1_detailpage_bigad_adcall_FTL() throws Exception {
					System.out.println(
							"================= Verifying hourly1 big ad detailpage_adcall_iu  test case Started =========================");
					Functions.Verify_hourly_detailpage_bigad1_adcall_iu();
					System.out.println(
							"================= Verifying hourly1 big ad detailpage_adcall_iu test case  End =========================");
				}

				@Test(priority = 44, enabled = true)
				@Description("Verifying  hourly2  detailpage bigad ad call on FTL")
				public void Smoke_Test_Verify_hourly2_detailpage_bigad_adcall_FTL() throws Exception {
					System.out.println(
							"================= Verifying hourly2 bigad detailpage_adcall_iu test case Started =========================");
					Functions.Verify_hourly_detailpage_bigad2_adcall_iu();
					System.out.println(
							"================= Verifying hourly2 bigad detailpage_adcall_iu test case End =========================");
				}
				
				@Test(priority = 46, enabled = true)
				@Description("Verifying  hourly3  detailpage bigad ad call on FTL")
				public void Smoke_Test_Verify_hourly3__bigad_detailpage_adcall_FTL() throws Exception {
					System.out.println(
							"================= Verifying hourly3 bigad detailpage_adcall_iu test case  Started =========================");
				
					Functions.Verify_hourly_detailpage_bigad3_adcall_iu();
					
					System.out.println(
							"================= Verifying hourly3 bigad detailpage_adcall_iu test case  End =========================");
				}
				
				/* =======================================daily details ad calls test cases started======================================================================================*/
				
				 @Test(priority = 50, enabled = true)
					@Description("Verifying new daily details day1 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day1adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day1 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
						Functions.clickdailydetails();
						//Functions.closeInterstailads();
						Functions.clickongotit();
						Thread.sleep(10000);
						this.proxy.getXml();
						Functions.verifyingdailydetailiu();
						System.out.println(
								"=================  Verifying new daily details day1 ad call tescase  End =========================");
					}

				   
					@Test(priority = 52, enabled = true)
					@Description("Verifying new daily details day2 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day2adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day2 ad call test case Started=========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
						Functions.clickonday2();
						this.proxy.getXml();
						Thread.sleep(15000);
						Functions.verifyingdailydetailiu();
					//	Functions.verifyingdailydetailsiu();
						System.out.println(
								"================= Verifying new daily details day2 ad call test case End =========================");
					}
					
				   
					@Test(priority = 54, enabled = true)
					@Description("Verifying new daily details day3 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day3adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day3 ad call test case Started =========================");
						
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
						//Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday3();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailiu();
						System.out.println(
								"================= Verifying new daily details day3 ad call test case End =========================");
					}
					
					
					@Test(priority = 56, enabled = true)
					@Description("Verifying new daily details day4 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day4adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day4 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday4();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailiu();
						System.out.println(
								"================= Verifying new daily details day4 ad call tescase End =========================");
					}

					@Test(priority = 58, enabled = true)
					@Description("Verifying new daily details day5 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day5adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day5 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday5();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailiu();
						System.out.println(
								"================= Verifying new daily details day5 ad call tescase End =========================");
					}

					@Test(priority = 60, enabled = true)
					@Description("Verifying new daily details day6 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day6adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day6 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday6();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailiu();
						System.out.println(
								"================= Verifying new daily details day6 ad call tescase End =========================");
					}
					
					@Test(priority = 62, enabled = true)
					@Description("Verifying new daily details day7 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day7adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day7 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday7();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailiu();
						System.out.println(
								"================= Verifying new daily details day7 ad call tescase End =========================");
					}
					
					@Test(priority = 64, enabled = true)
					@Description("Verifying new daily details day8 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day8adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day8 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
						//Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday8();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailsiu1();
						System.out.println(
								"================= Verifying new daily details day8 ad call tescase End =========================");
					}
					
					
					@Test(priority = 66, enabled = true)
					@Description("Verifying new daily details day9 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day9adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day9 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
						//Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday9();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailsiu1();
						System.out.println(
								"================= Verifying new daily details day9 ad call tescase End =========================");
					}
					
					@Test(priority = 68, enabled = true)
					@Description("Verifying new daily details day10 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day10adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day10 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday10();
						Thread.sleep(15000);
						this.proxy.getXml();	
						Functions.verifyingdailydetailsiu1();
						
						System.out.println(
								"================= Verifying new daily details day10 ad call tescase End =========================");
					}
					
					@Test(priority = 70, enabled = true)
					@Description("Verifying new daily details day11 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day11adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day11 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
						//Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday11();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailsiu1();
						System.out.println(
								"================= Verifying new daily details day11 ad call tescase End =========================");
					}
					
					@Test(priority = 72, enabled = true)
					@Description("Verifying new daily details day12 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day12adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day12 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday12();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailsiu1();
						System.out.println(
								"================= Verifying new daily details day12 ad call tescase End =========================");
					}
					
					@Test(priority = 74, enabled = true)
					@Description("Verifying new daily details day13 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day13adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day13 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday13();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailsiu1();
						System.out.println(
								"================= Verifying new daily details day13 ad call tescase End =========================");
					}
					
					@Test(priority = 76, enabled = true)

					@Description("Verifying new daily details day14 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day14adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day14 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday14();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailsiu1();
						System.out.println(
								"================= Verifying new daily details day14 ad call tescase End =========================");
					}
					@Test(priority = 78, enabled = true)
					@Description("Verifying new daily details day15 ad call on FTL")
					public void Smoke_Test_Verifying_newdailydetails_day15adcall_FTL() throws Exception {
						System.out.println(
								"================= Verifying new daily details day15 ad call tescase Started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
					//	Functions.finding_newDailyBidadcall_day2();
						Functions.clickonday15();
						Thread.sleep(15000);
						this.proxy.getXml();
						Functions.verifyingdailydetailsiu2();
						System.out.println(
								"================= Verifying new daily details day15 ad call tescase End =========================");
					}
				   
					
		/*=======================================================daily details ad calls test cases End===============================================================*/
				
					/* =======================================api  calls test cases started======================================================================================*/
					// Verifying Api and feed card and amazon aax prerol calls verification
					@Test(priority = 300, enabled = true)
					@Description("Verifying wfxtg trigger api call url on KillLaunch")
					public void Smoke_Test_CaseVerify_WeatherFXAPI_url_KillLaunch() throws Exception {
						System.out.println("================= Verifying WeatherFX API url started =========================");
						CharlesFunctions.archive_folder("Charles");
						proxy.clearCharlesSession();
				    	AppFunctions.Kill_Launch_App();
				       AppiumFunctions.ClickonIUnderstand();
				    	AppFunctions.Kill_Launch_App();
				    	Thread.sleep(10000);
						// CharlesFunctions.startSessionBrowserData();
						this.proxy.getXml();
						Functions.validating_WeatherFXAPI();
						System.out.println("================= Verifying WeatherFX API url End =========================");
					}
					/*@Test(priority = 302, enabled = true)
					@Description("Verifying Location/Factual  api call url on KillLaunch")
					public void Smoke_Test_CaseVerify_Factualapi_url_KillLaunch() throws Exception {
						System.out.println("================= Verifying WeatherFX API url started =========================");
						Functions.validating_Fatual();
						System.out.println("================= Verifying WeatherFX API url End =========================");
					}*/

		                         @Test(priority =302,enabled = true)  
					 @Description("Verifying Factual location.wfxtriggers.com api call supressing")  
					public void Verifying_Factual_locationwfxtriggerscom_apiCall_supressing() throws Exception {	  
					 System.out. println("=================Verifying Factual location.wfxtriggers.com api call supressing =========================" ); 
					 Functions.validating_Fatualcall_privacy_Optoutmode_scenarion();
					  System.out. println("================= Verifying Factual location.wfxtriggers.com api call supressing  =========================" );
					  }
					
					@Test(priority = 304, enabled = true)
					@Description("Verifying turbo call api url on KillLaunch")
					public void Smoke_Test_CaseVerify_turbo_url_KillLaunch() throws Exception {
						System.out.println("================= Verifying Turbo call  API url started =========================");
						Functions.validating_turbocallAPI();
						System.out.println("================= Verifying Turbo call API url End =========================");
					}

					/*@Test(priority = 306, enabled = true)
					@Description("Verifying Lotame adcrw api call url on KillLaunch")
					public void Smoke_Test_CaseVerify_adcrwdcntrlnet_url_KillLaunch() throws Exception {
						System.out.println("================= Verifying Lotame ad.crwdcntrl.net url started =========================");
						Functions.validating_adcrw();
						System.out.println("================= Verifying Lotame ad.crwdcntrl.net url End =========================");
					}*/
					
					
					  @Test(priority = 308, enabled = true)	  
					  @Description("Verifying bcp.crwdcntrl call on killLaunch" )
					  public void Smoke_Test__Verifying_Bcp_apicall_URL_killLaunch() throws  Exception { 
					  logStep("Verifying bcp.crwdcntrl call" ); 
					  System.out.println("=================Verifying  bcp.crwdcntrl call testcase started =========================");	  
					  Functions.validating_bcp_privacy_Optinmode_scenarion();
					  System.out.println("================= Verifying  bcp.crwdcntrl call testcase End =========================" );
					  
					  }
						/* =======================================api calls test cases End======================================================================================*/
					
					  
					  
						/* =======================================amazon preroll   ad calls test cases started======================================================================================*/
					  
					@Test(priority = 310, enabled = true)
					@Description("Verifying amazon Slot Id for hourly details preroll ad call on killLaunch")
					public void Smoke_Test_amazon_aax_Hourly_preroll_adcall_killLaunch() throws Exception {
						System.out.println(
								"================= Verify amazon aax Hourly details preroll adcall Started =========================");

						logStep(" Verifying preload amazon aax for  hourly details");
						Functions.get_aaxcal_Hourly();
						System.out.println(
								"================= Verify amazon aax Hourly details preroll adcall End =========================");

					}
					
					  @Test(priority =312, enabled = true)
						@Description("Verifying amazon Slot Id for hourly1 big ad details preroll call on killLaunch")
						public void Smoke_Test_amazon_aax_Hourly1_bigaddetails_preroll_adcall_killLaunch() throws Exception {
							System.out.println(
									"================= Verify amazon aax Hourly1 details big  adcall  test case Started =========================");
							Functions.get_aaxcal_Hourly1();
							System.out.println("================= Verify amazon aax Hourly1 big ad details  test case  End =========================");

						}
						


						@Test(priority = 314, enabled = true)
						@Description("Verifying amazon Slot Id for hourly2 big ad details preroll call on killLaunch")
						public void Smoke_Test_amazon_aax_Hourly2_bigaddetails_preroll_adcall_killLaunch() throws Exception {
							System.out.println(
									"================= Verifying  amazon aax Hourly2 details big  adcall  test case Started =========================");
							Functions.get_aaxcal_Hourly2();
							System.out.println("================= Verifying  amazon aax Hourly2  big ad details  test case  End =========================");

						}



						@Test(priority = 316, enabled = true)
						@Description("Verifying amazon Slot Id for hourly3 big ad details preroll call on killLaunch")
						public void Smoke_Test_amazon_aax_Hourly3_bigaddetails_preroll_adcall_killLaunch() throws Exception {
							System.out.println(
									"================= Verify amazon aax Hourly3 details big  ad call test case  Started =========================");
							Functions.get_aaxcal_Hourly3();
							System.out.println("================= Verify amazon aax Hourly3 big ad call test case End =========================");
						}
						  

					
					@Test(priority = 318, enabled = true)
					@Description("Verifying amazon Slot Id for maps details preroll ad call on killLaunch")
					public void Smoke_Test_amazon_aax_mapsdetails_preload_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax Maps card preroll adcall Started =========================");

						logStep(" Verifying preload amazon aax for  map details");
						Functions.get_aaxcal_map_details();
						System.out
								.println("================= Verify amazon aax Maps card preroll adcall End =========================");

					}

					
					 @Test(priority=320,enabled = true)  
					  @Description("Verifying amazon slot id for home screen hourly preroll ad call on killaunch") 
					  public void Smoke_Test_verify_amazon_Slotid_homescreenhourly_preroll_adcall_killLaunch() throws Exception { 
					  System.out.println("================= Verifying amazon slotid home screenhourly adcall teetcase Started ========================="); 
					  Functions.get_aaxcal_homescreen_hourly(); 
					  System.out.println("================= Verifying amazon slotid home screenhourly adcall teetcase Started End ========================="); 
					  }
					 
					 
						@Test(priority = 322, enabled = true)
						@Description("Verifying amazon Slot Id for feed1 prerol ad call on killLaunch")
						public void Smoke_Test_amazon_aaxSlot_feed1_preroladcall_killLaunch() throws Exception {
							System.out.println(
									"================= Verify amazon aax slot  Id for feed1 prerol adcall  testcase Started =========================");
							logStep(" Verifying amazon aax slot Id for feed1");
							Functions.get_aaxcal_feed1();
							System.out.println(
									"================= Verify amazon aax slot Id for feed1 prerol adcall testcase End =========================");

						}
	@Test(priority = 322, enabled = true)
					@Description("Verifying amazon Slot Id  video ad call preload")
					public void Smoke_Test_amazon_aax_preload_video_adcall() throws Exception {
						System.out.println("================= Verify amazon aax video adcall Started =========================");
						logStep(" Verifying preload amazon aax for  video details");
						Functions.get_aaxcal_video_details();
						System.out.println("================= Verify amazon aax video  adcall End =========================");
					}
				 
					
					@Test(priority = 324, enabled = true)
					@Description("Verifying amazon Slot Id for feed2 prerol ad call on killLaunch")
					public void Smoke_Test_amazon_aaxSlot_feed2_preroladcall_KillLaunch() throws Exception {
						System.out.println(
								"================= Verify amazon aax slot  Id for feed2 prerol adcall testcase Started =========================");

						logStep(" Verifying amazon aax slot Id for feed2");
						Functions.get_aaxcal_feed2();
						System.out.println(
								"================= Verify amazon aax slot Id for feed2 prerol adcall testcase End =========================");

					}

					
					@Test(priority = 326, enabled = true)
					@Description("Verifying amazon Slot Id for daily details preroll ad call")
					public void Smoke_Test_amazon_aax_Daily_details_preroll_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax Daily details  preroll adcall Started =========================");
						logStep(" Verifying preload amazon aax for  daily details");
						Functions.get_aaxcal_Daily1();
						System.out.println(
								"================= Verify amazon aax Daily details preroll adcall End =========================");
					}
	
	
	@Test(priority = 327, enabled = true)
					@Description("Verifying amazon Slot Id for hourly interstitial ad call")
					public void Smoke_Test_amazon_aax_Hourly_interstitial_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax Hourly interstitial  adcall test case  Started =========================");
						Functions.get_aaxcal_Hourly_Interstitial();
						System.out.println("================= Verify amazon aax Hourly interstitial  test case  End =========================");
					}
					
					
					@Test(priority = 328, enabled = true)
					@Description("Verifying amazon Slot Id for daily interstitial ad call")
					public void Smoke_Test_amazon_aax_daily_interstitial_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax daily interstitial  adcall test case  Started =========================");
						Functions.get_aaxcal_Daily_Interstitial();
						System.out.println("================= Verify amazon aax daily interstitial  test case  End =========================");
					}
					
					
					@Test(priority = 329, enabled = true)
					@Description("Verifying amazon Slot Id for maps interstitial ad call")
					public void Smoke_Test_amazon_aax_maps_interstitial_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax maps interstitial  adcall test case  Started =========================");
						Functions.get_aaxcal_maps_Interstitial();
						System.out.println("================= Verify amazon aax maps interstitial  test case  End =========================");
					}
					
					
					

					@Test(priority = 330, enabled = true)
					@Description("Verifying amazon Slot Id for vidoes interstitial ad call")
					public void Smoke_Test_amazon_aax_Videos_interstitial_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax Videos interstitial  adcall test case  Started =========================");
						Functions. get_aaxcal_Videos_Interstitial();
						System.out.println("================= Verify amazon aax Videos interstitial  test case  End =========================");
					}
					
					
					
					
	
	
	
 /* =======================================Hourly details amazon aax slot id's test case Started======================================================================================*/
				
					
					@Test(priority = 41, enabled = true)
					@Description("Verifying amazon Slot Id for hourly details ad call")
					public void Smoke_Test_amazon_aax_Hourly_details_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax Hourly details  adcall test case  Started =========================");
						Functions.get_aaxcal_Hourly();
						System.out.println("================= Verify amazon aax Hourly details  test case  End =========================");
					}
					

					
					@Test(priority =43, enabled = true)
					@Description("Verifying amazon Slot Id for hourly1 big ad detailspage")
					public void Smoke_Test_amazon_aax_Hourly1_bigaddetails_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax Hourly1 details big  adcall  test case Started =========================");
						Functions.get_aaxcal_Hourly1();
						System.out.println("================= Verify amazon aax Hourly1 big ad details  test case  End =========================");

					}

					
					@Test(priority = 45, enabled = true)
					@Description("Verifying amazon Slot Id for hourly2 big ad detailspage")
					public void Smoke_Test_amazon_aax_Hourly2_bigaddetails_adcall() throws Exception {
						System.out.println(
								"================= Verifying  amazon aax Hourly2 details big  adcall  test case Started =========================");
						Functions.get_aaxcal_Hourly2();
						System.out.println("================= Verifying  amazon aax Hourly2  big ad details  test case  End =========================");

					}
					


					@Test(priority = 47, enabled = true)
					@Description("Verifying amazon Slot Id for hourly3 big ad detailspagel")
					public void Smoke_Test_amazon_aax_Hourly3_bigaddetails_adcall() throws Exception {
						System.out.println(
								"================= Verify amazon aax Hourly3 details big  ad call test case  Started =========================");
						Functions.get_aaxcal_Hourly3();
						System.out.println("================= Verify amazon aax Hourly3 big ad call test case End =========================");
					}
					
					
					 /* =======================================Hourly details amazon aax slot id's test case End======================================================================================*/
					
	
	

					 /* =======================================Daily details amazon aax slot id's test case Started======================================================================================*/
					
					@Test(priority = 51, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day1 ad calll")
					public void Smoke_Test_amazon_aax_Daily_details_Day1_adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day1 adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(1);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day 1 adcall test case End =========================");
					}


					@Test(priority = 53, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day2 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day2adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day2  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(1);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day2 adcall test case End =========================");
					}


					
					@Test(priority = 55, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day3 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day3adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day3  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(1);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day3 adcall test case End =========================");
					}


					
					@Test(priority = 57, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day4 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day4adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day4  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(1);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day4 adcall test case End =========================");
					}

					@Test(priority = 59, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day5 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day5adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day5  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(1);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day5 adcall test case End =========================");
					}
					
					

					
				   @Test(priority = 61, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day6 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day6adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day6  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(1);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day6 adcall test case End =========================");
					}

					
					
				  @Test(priority = 63, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day7 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day7adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day7  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(1);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day7 adcall test case End =========================");
					}


					
					@Test(priority = 65, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day8 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day8adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day8  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(2);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day8 adcall test case End =========================");
					}

					
					
					
					
					 @Test(priority = 67, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day9 ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day9adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day9  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(2);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day9 adcall test case End =========================");
					}


					
					
					@Test(priority = 69, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day10  ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day10adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day10  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(2);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day10 adcall test case End =========================");
					}


					
					
					@Test(priority = 71, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day11  ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day11adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day11  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(2);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day11 adcall test case End =========================");
					}

					
					@Test(priority = 73, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day12  ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day12adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day12  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(2);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day12 adcall test case End =========================");
					}

					
					
					
					@Test(priority = 75, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day13  ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day13adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day13  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(2);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day13 adcall test case End =========================");
					}


					
					
					@Test(priority = 77, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day14  ad calll")
					public void Smoke_Test_amazon_aax_Dailydetails_Day14adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day14  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(2);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day14 adcall test case End =========================");
					}


					

					
					@Test(priority = 79, enabled = true)
					@Description("Verifying amazon Slot Id for daily details day15  ad call")
					public void Smoke_Test_amazon_aax_Dailydetails_Day15adcall() throws Exception {
						System.out
								.println("================= Verifying amazon slot id for  daily details day15  adcall test case Started =========================");
					  Functions.gettingDayofWeekFromUI(3);
						Functions.get_aaxcal_Daily();
						System.out.println("================= Verifying amazon slot id for  daily details day15 adcall test case End =========================");
					}
					

	
	
					 /* =======================================Daily details amazon aax slot id's test case End=====================================*/
	


					 /* =======================================pull to refresh test case Started======================================================================================*/
					 @Test(priority = 350, enabled = true)		  
					  @Description("Verifying  home screen hourly  ad call pull to refrersh scenario on killLaunch") 
					  public  void Smoke_Test_Verifying_homescreenhourly_pulltoreresh_scenario_killLaunch() throws  Exception {	 
					  logStep("Verifying home screen hourly  ad call pull to refrersh scenario");
					  System.out.
					  println("================= Verifying  home screen hourly  ad  call pull to refrersh scenario started =========================" ); 
					 AppFunctions.Kill_Launch_App();
						CharlesFunctions.archive_folder("Charles");
						  proxy.clearCharlesSession();
					  AppFunctions.Pull_To_Refresh("Pulltorefresh");
					  AppFunctions.Pull_To_Refresh("Pulltorefresh");
						 Thread.sleep(20000);
						this.proxy.getXml();
					  Functions.finding_Homescreen_iu_value();	 
					  System.out. println("=================  Verifying  home screen hourly  ad  call pull to refrersh scenario  End =========================" ); 
					  }
					  
					  @Test(priority = 352, enabled = true)
					  
					  @Description("Verifying  home screen marquee call pull to refrersh scenario") public
					  void Smoke_Test_Verifying_homescreenmarquee__pulltoreresh_scenario() throws
					  Exception {
					  logStep("Verifying  home screen marquee call pull to refrersh scenario");
					  System.out. println("================= Verifying  home screen marquee call pull to refrersh scenario started =========================");
					  Functions.finding_Homescreen_marquee_iu_value(); 
						  CharlesFunctions.archive_folder("Charles");
					  System.out.println("================= Verifying  home screen marquee call pull to refrersh scenario  End =========================" );  
					  }
					
					  /* =======================================pull to refresh test case End======================================================================================*/
					  /* =======================================All feed cards amazon slot id's test cases started======================================================================================*/				

	
	
						
						@Test(priority = 400, enabled = true)
						@Description("Verifying amazon Slot Id for COVID-19  card  using ANDFLAG-6704 UserGroup")
						public void Smoke_Test_amazon_aax_Covid19_card_using_ANDFLAG6704UG() throws Exception {
							System.out
									.println("================= Verifying amazon Slot Id for COVID-19  card  using ANDFLAG-6704 UserGroup test case Started =========================");
							 AppFunctions.Kill_Launch_App();
								proxy.clearCharlesSession();
							  Thread.sleep(60000);
							  Thread.sleep(60000);
							  Thread.sleep(60000);
								this.proxy.getXml();
							Functions.get_aaxcal_covid19();
							System.out.println("================= Verifying amazon Slot Id for COVID-19  card  using ANDFLAG-6704 UserGroup test case End =========================");
						}
						
						@Test(priority = 402, enabled = true)
						@Description("Verifying iu value Covid details details Page ad call  using ANDFLAG-6704 UserGroup")
						public void Smoke_Test_CaseVerify_Ccoivid_details_page_adcall_using_ANDFLAG6704UG() throws Exception {
							System.out.println(
									"================= Verifying iu value Covid details details Page ad call  using ANDFLAG-6704 started =========================");
							Functions.Verify_coivid19_detailpage_adcall_iu();
							 CharlesFunctions.archive_folder("Charles");
							System.out.println(
									"=================Verifying iu value Covid details details Page ad call  using ANDFLAG-6704  End =========================");
						}

						@Test(priority = 3, enabled = true)
						@Description("Verifying amazon Slot Id for feed1 prerol ad call")
						public void Smoke_Test_amazon_aaxSlot_feed1_adCall() throws Exception {
							System.out.println(
									"================= Verify amazon aax slot  Id for feed1 prerol adcall  testcase Started =========================");
							logStep(" Verifying amazon aax slot Id for feed1");
							Functions.get_aaxcal_feed1();
							System.out.println(
									"================= Verify amazon aax slot Id for feed1 prerol adcall testcase End =========================");

						}	
						
						
					 @Test(priority = 5, enabled = true)
						@Description("Verifying amazon  Slot Id for feed2 ad call")
						public void Smoke_Test_amazon_aaxSlot_feed2_adcall() throws Exception {
							System.out.println(
									"================= Verify amazon aax slot  Id for feed2 adcall testcase Started =========================");
							logStep(" Verifying amazon aax slot Id for feed2");
							Functions.get_aaxcal_feed2();
							System.out.println(
									"================= Verify amazon aax slot Id for feed2l adcall testcase End =========================");
						}

						@Test(priority = 7, enabled = true)
						@Description("Verifying amazon  Slot Id for feed3 ad call")
						public void Smoke_Test_amazon_aaxSlot_feed3_adcall() throws Exception {
							System.out.println(
									"================= Verify amazon aax slot  Id for feed3 adcall testcase Started =========================");
							logStep(" Verifying amazon aax slot Id for feed3");
							Functions.get_aaxcal_feed3();
							System.out.println(
									"================= Verify amazon aax slot Id for feed3  adcall testcase End =========================");
						}


					    @Test(priority = 9, enabled = true)
						@Description("Verifying amazon  Slot Id for feed4 ad call")
						public void Smoke_Test_amazon_aaxSlot_feed4_adcall() throws Exception {
							System.out.println(
									"================= Verify amazon aax slot  Id for feed4 adcall testcase Started =========================");
							logStep(" Verifying amazon aax slot Id for feed4");
							Functions.get_aaxcal_feed4();
							System.out.println(
									"================= Verify amazon aax slot Id for feed4 adcall testcase End =========================");
						}



						  
						/* @Test(priority = 11, enabled = true)
						@Description("Verifying amazon  Slot Id for feed5 ad call")
						public void Smoke_Test_amazon_aaxSlot_feed5_adcall() throws Exception {
							System.out.println(
									"================= Verify amazon aax slot  Id for feed5 adcall testcase Started =========================");
							logStep(" Verifying amazon aax slot Id for feed5");
							Functions.get_aaxcal_feed5();
							System.out.println(
									"================= Verify amazon aax slot Id for feed5 adcall testcase End =========================");
						}*/

						 
						 /* =======================================All feed cards amazon slot id's test cases End======================================================================================*/
						 

			
						 
						 /* =======================================All detail pages amazon slot id's test cases started======================================================================================*/
						 

							 @Test(priority = 19, enabled = true)
							@Description("Verifying amazon Slot Id for maps details preroll ad cal")
							public void Smoke_Test_amazon_aax_mapsdetails_adcall() throws Exception {
								System.out.println("================= Verify amazon aax maps detais adcall Started =========================");
								logStep(" Verifying preload amazon aax for  map details");
								Functions.get_aaxcal_map_details();
								System.out
										.println("================= Verify amazon aax maps card preroll adcall End =========================");
							}


							/*@Test(priority = 21, enabled = true)
							@Description("Verifying amazon Slot Id  video ad call")
							public void Smoke_Test_amazon_aax_video_adcall() throws Exception {
								System.out.println("================= Verify amazon aax video adcall Started =========================");
								logStep(" Verifying preload amazon aax for  video details");
								Functions.get_aaxcal_video_details();
								System.out.println("================= Verify amazon aax video  adcall End =========================");
							}*/
						 
						 
						 
							/*@Test(priority = 23, enabled = false)
							@Description("Verifying amazon axx slot for new article")
							public void Smoke_Test_Verify_amazon_aax_News_adcall() throws Exception {
								System.out.println(
										"================= verifying amazon aax slot for news article started =========================");
								Functions.get_aaxcal_news();
								System.out
										.println("================= verifying amazon aax slot for news article  End =========================");
							}*/



							@Test(priority =25, enabled = true)
							@Description("Verifying amazon aax for today details card")
							public void Smoke_Test_amazon_aax_today_deatailcard() throws Exception {
								System.out.println(
										"================= Verify amazon aax for today detail adcard Started =========================");
								Functions.get_aaxcal_today_details();
								System.out.println("================= Verify amazon aax for today detail adcard End=========================");
							}

							
							
							
							@Test(priority = 27, enabled = true)
							@Description("Verifying amazon aax for AQ details page")
							public void Smoke_Test_amazon_aax_Airquality_deatailcard() throws Exception {
								System.out.println(
										"================= Verify amazon aax for Air Quality details page Started =========================");
								Functions.get_aaxcal_aq();
								System.out.println("================= Verify amazon aax for Air Quality detail Page  End=========================");
							}
							


							/*@Test(priority = 29, enabled = true)
							@Description("Verifying amazon slot Id for Running Bigbanner ad")
							public void Smoke_Test_Verify_amazon_SlotId_Running_Bigbanner_ad() throws Exception {
								System.out.println(
										"================= verifying amazon SlotId for Running BigBanner adcall started =========================");
								Functions.get_aaxcal_Running_Bigbanner();
								System.out.println(
										"================= verifying amazon SlotId for Running BigBanner adcall  End =========================");
							}*/



							@Test(priority = 31, enabled = false)
							@Description("Verifying amazon slot Id  for Boat&Beach Bigbanner ad")
							public void Smoke_Test_Verify_amazon_SlotId_Boat_Beach_Bigbanner_ad() throws Exception {
								System.out.println(
										"================= verifying amazon aax SlotId for Boat&Beach BigBanner adcall started =========================");
								Functions.get_aaxcal_Boat_Beach_Bigbanner();
								System.out.println(
										"================= verifying amazon SlotId for Boat&Beach BigBanner adcall End =========================");
							}



							@Test(priority = 33, enabled = true)
							@Description("Verifying amazon slot Id for Allergy Bigbanner ad")
							public void Smoke_Test_Verify_amazon_SlotId_Allergy_Bigbanner_ad() throws Exception {
								System.out.println(
										"================= verifying amazon SlotId for Allergy BigBanner adcall started =========================");
								Functions.get_aaxcal_Allergy_Bigbanner();
								System.out.println(
										"================= verifying amazon SlotId for Allergy BigBanner adcall  End =========================");
							}



							/*@Test(priority = 35, enabled = true)
							@Description("Verifying amazon slot Id for Cold&Flu Bigbanner ad")
							public void Smoke_Test_Verify_amazon_SlotId_coldFlu_Bigbanner_ad() throws Exception {
								System.out.println(
										"================= verifying amazon SlotId for cold&Flu BigBanner adcall started =========================");
								Functions.get_aaxcal_Cold_Flu_Bigbanner();
								System.out.println(
										"================= verifying amazon SlotId for cold&Flu BigBanner adcall  End =========================");
							}*/


							
							
							/*@Test(priority = 37, enabled = true)
							@Description("Verifying amazon slot Id for Outdoor details page")
							public void Smoke_Test_Verify_amazon_SlotId_outdoor_details() throws Exception {
								System.out.println(
										"================= verifying amazon SlotId for oudoor details adcall started =========================");
								Functions.get_aaxcal_SH_details();
								System.out.println(
										"================= verifying amazon SlotId for outdoor details adcall  End =========================");
							}	*/	
							
							 /* =======================================All detail pages amazon slot id's test cases End======================================================================================*/
		
	
	
	/*
	 * Enable Preconditions for WeatherFX API Parameters validation
	 */

	@Test(priority = 3001, enabled = true)
	@Description("Verify Enable Preconditions For WeatherFX API Parameters")
	public void Verify_enable_preConditions_for_WeatherFx_API_Parameters() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Verify Enable Preconditions for WeatherFX API Parameters test started");
		logStep("Verify Enable Preconditions for WeatherFX API Parameters test started");
		hread.sleep(30000);
		Ad.resetApp();
            Thread.sleep(30000);
		proxy.clearCharlesSession();
AppiumFunctions.Kill_launch();
AppiumFunctions.enter_requiredLocation("30124");
		Thread.sleep(5000);
		proxy.clearCharlesSession();
		AppiumFunctions.Kill_launch();
		Thread.sleep(2000);
		proxy.clearCharlesSession();
		AppiumFunctions.Kill_launch();
	//	Functions.enternewAddress(false, "30124", "Cave Spring, Georgia");
		Thread.sleep(10000);
		// navigate to Hourly tab
		AppFunctions.click_hourly_element();
		Thread.sleep(2000);
		// navigate to Daily tab
		Functions.clickdailydetails();
		Thread.sleep(2000);
		// navigate to Radar tab
		AppiumFunctions.clickOnMaps();
		Thread.sleep(2000);
		CharlesFunctions.archive_folder("Charles");
		Thread.sleep(5000);
		proxy.getXml();
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		CharlesFunctions.archive_folder("Charles");
		//Utils.get_v3_wx_forecast_daily_15day_data();

	}

	

	/*
	 * This method validates wfxtg custom parameter of Hourly details call
	 */
	@Test(priority = 3002, enabled = true)
	@Description("Validating 'wfxtg' custom parameter of Hourly details call ")
	public void Validate_HourlyDetails_wfxtg_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating wfxtg custom parameter of Hourly details call");
		logStep("Validating wfxtg custom parameter of Hourly details call ");
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		Utils.validate_custom_param_val_of_gampad_with_zip("Hourly", "wfxtg", "30124");

	}

	/*
	 * This method validates wfxtg custom parameter of Daily details call
	 */
	@Test(priority = 3003, enabled = true)
	@Description("Validating 'wfxtg' custom parameter of Daily details call ")
	public void Validate_DailyDetails_wfxtg_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating wfxtg custom parameter of Daily details call");
		logStep("Validating wfxtg custom parameter of Daily details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Daily(10day)", "wfxtg", "30124");

	}

	/*
	 * This method validates wfxtg custom parameter of Map details call
	 */
	@Test(priority = 3004, enabled = true)
	@Description("Validating 'wfxtg' custom parameter of Map details call ")
	public void Validate_MapDetails_wfxtg_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating wfxtg custom parameter of Map details call");
		logStep("Validating wfxtg custom parameter of Map details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Map", "wfxtg", "30124");

	}

	/*
	 * This method validates cxtg custom parameter of Hourly details call
	 */
	@Test(priority = 3005, enabled = true)
	@Description("Validating 'cxtg' custom parameter of Hourly details call ")
	public void Validate_HourlyDetails_cxtg_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating cxtg custom parameter of Hourly details call");
		logStep("Validating cxtg custom parameter of Hourly details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Hourly", "cxtg", "30124");

	}

	/*
	 * This method validates cxtg custom parameter of Daily details call
	 */
	@Test(priority = 3006, enabled = true)
	@Description("Validating 'cxtg' custom parameter of Daily details call ")
	public void Validate_DailyDetails_cxtg_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating cxtg custom parameter of Daily details call");
		logStep("Validating cxtg custom parameter of Daily details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Daily(10day)", "cxtg", "30124");

	}

	/*
	 * This method validates cxtg custom parameter of Map details call
	 */
	@Test(priority = 3007, enabled = true)
	@Description("Validating 'cxtg' custom parameter of Map details call ")
	public void Validate_MapDetails_cxtg_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating cxtg custom parameter of Map details call");
		logStep("Validating cxtg custom parameter of Map details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Map", "cxtg", "30124");

	}

	/*
	 * This method validates zcs custom parameter of Hourly details call
	 */
	@Test(priority = 3008, enabled = true)
	@Description("Validating 'zcs' custom parameter of Hourly details call ")
	public void Validate_HourlyDetails_zcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating zcs custom parameter of Hourly details call");
		logStep("Validating zcs custom parameter of Hourly details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip( "Hourly", "zcs", "30124");

	}

	/*
	 * This method validates zcs custom parameter of Daily details call
	 */
	@Test(priority = 3009, enabled = true)
	@Description("Validating 'zcs' custom parameter of Daily details call ")
	public void Validate_DailyDetails_zcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating zcs custom parameter of Daily details call");
		logStep("Validating zcs custom parameter of Daily details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Daily(10day)", "zcs", "30124");

	}

	/*
	 * This method validates zcs custom parameter of Map details call
	 */
	@Test(priority = 3010, enabled = true)
	@Description("Validating 'zcs' custom parameter of Map details call ")
	public void Validate_MapDetails_zcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating zcs custom parameter of Map details call");
		logStep("Validating zcs custom parameter of Map details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Map", "zcs", "30124");

	}

	/*
	 * This method validates hzcs custom parameter of Hourly details call
	 */
	@Test(priority = 3011, enabled = true)
	@Description("Validating 'hzcs' custom parameter of Hourly details call ")
	public void Validate_HourlyDetails_hzcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating hzcs custom parameter of Hourly details call");
		logStep("Validating hzcs custom parameter of Hourly details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Hourly", "hzcs", "30124");

	}

	/*
	 * This method validates hzcs custom parameter of Daily details call
	 */
	@Test(priority = 3012, enabled = true)
	@Description("Validating 'hzcs' custom parameter of Daily details call ")
	public void Validate_DailyDetails_hzcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating hzcs custom parameter of Daily details call");
		logStep("Validating hzcs custom parameter of Daily details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Daily(10day)", "hzcs", "30124");

	}

	/*
	 * This method validates hzcs custom parameter of Map details call
	 */
	@Test(priority = 3013, enabled = true)
	@Description("Validating 'hzcs' custom parameter of Map details call ")
	public void Validate_MapDetails_hzcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating hzcs custom parameter of Map details call");
		logStep("Validating hzcs custom parameter of Map details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Map", "hzcs", "30124");

	}

	/*
	 * This method validates nzcs custom parameter of Hourly details call
	 */
	@Test(priority = 3014, enabled = true)
	@Description("Validating 'nzcs' custom parameter of Hourly details call ")
	public void Validate_HourlyDetails_nzcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating nzcs custom parameter of Hourly details call");
		logStep("Validating nzcs custom parameter of Hourly details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Hourly", "nzcs", "30124");

	}

	/*
	 * This method validates nzcs custom parameter of Daily details call
	 */
	@Test(priority = 3015, enabled = true)
	@Description("Validating 'nzcs' custom parameter of Daily details call ")
	public void Validate_DailyDetails_nzcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating nzcs custom parameter of Daily details call");
		logStep("Validating nzcs custom parameter of Daily details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip("Daily(10day)", "nzcs", "30124");

	}

	/*
	 * This method validates nzcs custom parameter of Map details call
	 */
	@Test(priority = 3016, enabled = true)
	@Description("Validating 'nzcs' custom parameter of Map details call ")
	public void Valida0te_MapDetails_nzcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating nzcs custom parameter of Map details call");
		logStep("Validating nzcs custom parameter of Map details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip( "Map", "nzcs", "30124");
			

	}


	

	
	
	
	

}
