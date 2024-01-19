package New;

public class Marks {

	public static void main(String[] args)
	{
		int marks = 60;
		
		if((marks<=100) && (marks>=80))
				{
			System.out.println("A grade");
				}
		else if((marks<=80) && (marks>=60))
				{
			System.out.println("B grade");
				}
		else if((marks<=60) && (marks>=40))
		{
		
			System.out.println("C grade");
		}
		
		else if(marks==0)
		{
			System.out.println("Repeat class");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
