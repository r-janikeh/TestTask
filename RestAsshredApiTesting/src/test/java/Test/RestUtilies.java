package Test;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtilies {
	public static String getusername()
	
	{
		String generatedstring= RandomStringUtils.randomAlphabetic(1) ;
		return ("john"+generatedstring);
		
	}
	
public static String getfirstName()
	
	{
		String generatedstring= RandomStringUtils.randomAlphabetic(1) ;
		return ("mike"+generatedstring);
		
	}
	
public static String getlastName()

{
	String generatedstring= RandomStringUtils.randomAlphabetic(1) ;
	return ("john"+generatedstring);
	
}

public static String getemail()

{
	String generatedstring= RandomStringUtils.randomAlphabetic(1) ;
	return (generatedstring+ "mailinator.com");
	
}

public static String getpassword()

{
	String generatedstring= RandomStringUtils.randomNumeric(4) ;
	return (generatedstring);
	
}
public static String getphone()

{
	String generatedstring= RandomStringUtils.randomNumeric(4) ;
	return (generatedstring);
	
}

}
