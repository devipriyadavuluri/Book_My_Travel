package oops_programm_style3;

public class TrainValidation {
	public static boolean VerifyName(String tname)
	{
		boolean status=false;
	  String trainNames[]= {"Chennnai","Mumbai","Pune","Delhi"	};
	  for(int i=0; i<trainNames.length; i++)
	  {
		  if(trainNames[i]==tname)
		  {
			  return status=true;
		  }
		
	  }
	  return status=false;
	}
	public static boolean VerifySpeed(int speed)
	{
		if(speed>=60 && speed<=100)
		{
			return true;
		}
		return false;
	}
	public static boolean VerifyDistance(int distance)
	{
		if(distance>=500 && distance<=800)
		{
			return true;
		}
		return false;
	}
	private static int DigitNumber(int number)
	{
		while(number>10)
		{
			number=number/10;
		}
		return number;
		
	}

	
	
}