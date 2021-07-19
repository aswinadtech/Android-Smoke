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

	
	
	/*@BeforeClass(alwaysRun = true)
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
		Thread.sleep(20000);
		AppFunctions.gettingApkVersion() ;
		Thread.sleep(5000);
		attachScreen();
	}*/

	
	
	
	/*
	 * Enable Preconditions for WeatherFX API Parameters validation
	 */

	/*@Test(priority = 301, enabled = true)
	@Description("Verify Enable Preconditions For WeatherFX API Parameters")
	public void Verify_enable_preConditions_for_WeatherFx_API_Parameters() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Verify Enable Preconditions for WeatherFX API Parameters test started");
		logStep("Verify Enable Preconditions for WeatherFX API Parameters test started");
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
		// Utils.get_v3_wx_forecast_daily_15day_data();

	}*/


	/*
	 * This method validates wfxtg custom parameter of Hourly details call
	 */
	@Test(priority = 302, enabled = true)
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
	@Test(priority = 303, enabled = true)
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
	@Test(priority = 304, enabled = true)
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
	@Test(priority = 305, enabled = true)
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
	@Test(priority = 306, enabled = true)
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
	@Test(priority = 307, enabled = true)
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
	@Test(priority = 308, enabled = true)
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
	@Test(priority = 309, enabled = true)
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
	@Test(priority = 310, enabled = true)
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
	@Test(priority = 311, enabled = true)
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
	@Test(priority = 312, enabled = true)
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
	@Test(priority = 313, enabled = true)
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
	@Test(priority = 314, enabled = true)
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
	@Test(priority = 315, enabled = true)
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
	@Test(priority = 316, enabled = true)
	@Description("Validating 'nzcs' custom parameter of Map details call ")
	public void Validate_MapDetails_nzcs_Custom_param() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating nzcs custom parameter of Map details call");
		logStep("Validating nzcs custom parameter of Map details call ");
		Utils.validate_custom_param_val_of_gampad_with_zip( "Map", "nzcs", "30124");

	}


	

	
	
	
	

}
