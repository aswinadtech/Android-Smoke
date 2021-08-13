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

	

	/*
	 * This method validates cmsid custom parameter of video call
	 */
	@Test(priority = 6000, enabled = true)
	@Description("Validating 'cmsid' custom parameter of Video call ")
	public void Validate_PreRollVideo_cmsid_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating cmsid custom parameter of Video call");
		logStep("Validating cmsid custom parameter of Video call ");
		/*proxy.clearCharlesSession();
		Ad.resetApp();
		Thread.sleep(60000);
		AppiumFunctions.clickOnVideoElementt();
		Thread.sleep(100000);
		this.proxy.getXml();*/
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "cmsid", "NotNull");

	}

	/*
	 * This method validates ttid custom parameter of video call
	 */
	@Test(priority = 6002, enabled = true)
	@Description("Validating 'ttid' custom parameter of Video call ")
	public void Validate_PreRollVideo_ttid_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating ttid custom parameter of Video call");
		logStep("Validating ttid custom parameter of Video call ");
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "ttid", "NotNull");

	}

	/*
	 * This method validates vid custom parameter of video call
	 */
	@Test(priority = 6004, enabled = true)
	@Description("Validating 'vid' custom parameter of Video call ")
	public void Validate_PreRollVideo_lnid_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating lnid custom parameter of Video call");
		logStep("Validating lnid custom parameter of Video call ");
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "lnid",  "NotNull");

	}
	
	/*
	 * This method validates vid custom parameter of video call
	 */
	@Test(priority = 6006, enabled = true)
	@Description("Validating 'vid' custom parameter of Video call ")
	public void Validate_PreRollVideo_vid_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating vid custom parameter of Video call");
		logStep("Validating vid custom parameter of Video call ");
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "vid",  "NotNull");

	}

	
	/*
	 * This method validates vid custom parameter of video call
	 */
	@Test(priority = 6008, enabled = true)
	@Description("Validating 'plist' custom parameter of Video call ")
	public void Validate_PreRollVideo_plist_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating plist custom parameter of Video call");
		logStep("Validating plist custom parameter of Video call ");
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "plist", "NotNull");

	}

	/*
	 * This method validates descritpion url of video call
	 */
	@Test(priority = 6010, enabled = true)
	@Description("Validating 'description url' of Video call ")
	public void Validate_PreRollVideo_description_url_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating description url of Video call");
		logStep("Validating description url of Video call ");
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "description_url", "NotNull");

	}
	
	
	/*
	 * This method validates descritpion url of video call
	 */
	@Test(priority = 6012, enabled = true)
	@Description("Validating 'content url' of Video call ")
	public void Validate_PreRollVideo_content_url_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating content url of Video call");
		logStep("Validating content url of Video call ");
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "content_url", "NotNull");

	}
	

	/*
	 * This method validates Google Interactive Media Ads SDK version i.e. IMA SDK
	 */
	@Test(priority = 6014, enabled = true)
	@Description("Validating Google Interactive Media Ads SDK version of Preroll video call ")
	public void Validate_IMA_SDK_version() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Google Interactive Media Ads SDK version i.e. 'js' parameter of Preroll video call");
		logStep("Validating Google Interactive Media Ads SDK version i.e. 'js' parameter of Preroll video call");

		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "js", properties.getProperty("IMASDKVersion"));

	}
	
	
	
	

	
	
	
	
	




	



	
	
	
	
	
	

}
