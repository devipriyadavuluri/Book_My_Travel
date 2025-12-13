package oops_programm_style3;

public class Train {
	public static String bordPoint="Kachiguddam";
	private String trainName;
	private double speed;
	private double distance;
	private String destPoint;
	private String trainNumber;
	
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
