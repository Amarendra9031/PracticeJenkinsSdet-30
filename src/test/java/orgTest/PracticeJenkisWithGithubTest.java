package orgTest;

import org.testng.annotations.Test;

public class PracticeJenkisWithGithubTest 
{
	@Test
	public void PracticeJenkisWithGithubTest() 
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("url");
		System.out.println(URL);
	}

}
