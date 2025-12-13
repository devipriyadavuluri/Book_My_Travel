package oops_programming_style2;

public class Train {
	public static String bordPoint="Kachiguddam";
	public String trainName;
	public double speed;
	public double distance;
	public String destPoint;
	public String trainNumber;
	
	public void findTime(String tName,double s,double d,String dp,String tNumber)
	{
		trainName=tName;
		speed=s;
		distance=d;
		destPoint=dp;
		trainNumber=tNumber;
	}
	public double timeHour()
	{
		double time=distance/speed;
		return time;
	}
	public void timeMin()
	{
		double timeMin=60*timeHour();
		System.out.println("the train travel in minutes:"+timeMin);
		
	}
	public void showInform()
	{
		System.out.println("train bordingPoint:"+bordPoint);
		System.out.println("train number is:"+trainNumber+"distance covered by :"+distance);
		timeMin();
		
	}

}
