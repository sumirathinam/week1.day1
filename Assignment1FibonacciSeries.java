package week1.day1;

public class Assignment1FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNum=0,secondNum=1;

for(int i=1;i<=8;i++)
{
	System.out.println(firstNum);
		int sum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=sum;
	
}
	}
}
	


