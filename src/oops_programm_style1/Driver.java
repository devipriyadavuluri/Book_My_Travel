package oops_programm_style1;

public class Driver {
	public static void main(String[] args)
	{
		Train train1=new Train();
		Train train2=new Train();
		train1.trainName="Vijayawada Express";
		train1.speed=80;
		train1.distance=600;
		train1.destPoint="Vijayawada";
		train1.trainNumber="KAC811";
		double time=train1.distance/train1.speed;
		double timeMIN=time*60;
		System.out.println("Dear passenger "+train1.trainNumber +"is about depart from"+Train.bordPoint+" to "+train1.destPoint);
		System.out.println(train1.trainName+"will travel average speed"+train1.distance+"");
		train2.trainName="Simhadri Express";
		train2.speed=85;
		train2.distance=800;
		train2.destPoint="Simhadri";
		train2.trainNumber="KAC784";
		double time1=train2.distance/train2.speed;
		double timeMIN1=time1*60;
		   
	}

}
