package com.springselenium.automation.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.springselenium.automation.AutomationApplicationTests;
import com.springselenium.automation.pages.google.BomGourmet;


public class BomGourmetTest extends AutomationApplicationTests {
	
	@Autowired
	BomGourmet bomGourmet;
	

	@BeforeClass
	public void beforeClass() {
		bomGourmet.goTo();
		assertTrue(bomGourmet.isAt());
	}
	
	@Test(invocationCount = 50)
	public void bomGourmetVote() {
		bomGourmet.fillFields();
		bomGourmet.clickSend();
		bomGourmet.clickSendAgain();
	}
}
