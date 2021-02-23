package org.dataprovider;

import org.testng.annotations.*;

public class DataProviders {
	@Test(dataProvider="login")
	public void test(String user, String pass,String cin,String cout,String namef,String namel,String add,String ccnum1,String ccv1) {
    
	}
	@DataProvider(name="login")
	private Object[][] getdata() {
       return new Object[][] {
    	   {"PavithraPrabhu","prabhu2701","08/02/2021","12/02/2021","pavithra","sivakumar","nabsxhgzuyfdhuggfrhxdgysrh","1234567891234567","123"},
    	   {"PavithraPrabhu","prabhu2701","08/02/2021","12/02/2021","pavithra","sivakumar","nabsxhgzuyfdhuggfrhxdgysrh","1234567891234567","123"},
    	   {"PavithraPrabhu","prabhu2701","08/02/2021","12/02/2021","pavithra","sivakumar","nabsxhgzuyfdhuggfrhxdgysrh","1234567891234567","123"}

       };
	}

}
