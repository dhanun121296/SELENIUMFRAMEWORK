package com.crm.comcast.contactsTest;

import org.testng.annotations.Test;

public class ContactTest 
{
  @Test(groups = "SmokeTest")
  public void createcontactTest()
  {
	  System.out.println("===Contact is created=="+System.getProperty("browser"));
	 
  } 
  @Test(groups = "RegressionTest")
  public void editcontactTest() 
  {
	  System.out.println("===Contact is edited==");
  }
  @Test(groups = "RegressionTest")
  public void deletecontactTest()
  {
	  System.out.println("===Contact is deleted==");
  }
	  System.out.println("===Contact is deleted==");
}
