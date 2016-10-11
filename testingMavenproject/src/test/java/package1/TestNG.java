package package1;

		import org.testng.Assert;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;

		public class TestNG {
			
			@BeforeMethod
			public void openURL(){
				System.out.println("Open URL");
			}
			
			@AfterMethod
			public void CloseURL(){
				System.out.println("Close URL");
			}
			
			@Test (priority=0)
			public void login(){
				System.out.println("this is Login Method");
				Assert.assertEquals("gmail", "Gmail");
			}
			
			@Test (dependsOnMethods="login")
			public void add(){
				System.out.println("this is Add Method");
			}

			
			@Test (priority=3)
			public void logout(){
				System.out.println("this is Logout Method");

}
}