package hooks;

import com.BaseLayer.BaseClass;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class HooksClass extends BaseClass {

	@BeforeAll
	public static void setUp() throws Exception {
		BaseClass.initialisation();
	}

//	@BeforeAll
//	public static void getURL() throws Exception {
//		BaseClass.getURL();
//	}

	@AfterAll
	public static void terminateBrowser() throws Exception {
		BaseClass.tearDown();
	}
}
