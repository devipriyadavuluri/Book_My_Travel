package oops_programming_style2;

public class Driver {
	public static void main(String[] args)
	{
		Train train1=new Train();
		Train train2=new Train();
		train1.findTime("Vijayawada Express", 80, 60, "Vijayawada", "KAC811");
		train1.showInform();
	}

}
