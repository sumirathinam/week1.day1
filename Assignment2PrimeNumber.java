package week1.day1;

public class Assignment2PrimeNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int Num=13;
		boolean flag=true;
		
		for(int i=2; i<=Num/2; i++)
		{
			if(Num%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(!flag)
		
			System.out.println("Number is even number");

		else
			System.out.println("Number is prime number");
		}
	}


