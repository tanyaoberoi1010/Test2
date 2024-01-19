package New;
import java.util.jar.*;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Tanya";
		int count=0;
	
		for(char ch:str1.toCharArray())
		{
			if(ch=='a')
			{
				count++;
				
			}
		}
			
			System.out.println("The number of 'a' in a string -->"+str1+" is count="+" "+count);
		
	}
}
