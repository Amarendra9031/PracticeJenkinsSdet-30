package contactTest;

import org.testng.annotations.Test;

public class JenkinsParamerterTest 
{
	@Test
	public void jenkinsParamerterTest()
	{
		String BROWSER = System.getProperty("browser1");
		System.out.println(BROWSER);
	}

}
