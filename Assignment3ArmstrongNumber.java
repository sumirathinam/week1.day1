package week1.day1;

public class Assignment3ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =371;
		System.out.println("Given number is " +num);
		int calc,remain,origi=0;
		remain=num;
		origi=0;
		while(remain!=0)
		{
			calc=remain%10;
			remain=remain/10;
			origi=origi+(origi*origi*origi);			
			
		}

		 if(num==origi)
		 
			 System.out.println("Number " +num +" is armstrong ");
			 
		 else
			 System.out.println("Number " +num +" is not armstrong ");
	}

}
