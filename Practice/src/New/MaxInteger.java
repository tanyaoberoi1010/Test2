package New;

import java.util.Arrays;

public class MaxInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a1 = {12, 45, 6, 78, 32};
	int[] a2 = {12, 45, 6, 78, 32};//output={24,90,12,156,64}
	
	
	if(a1.length!=a2.length)
	{
		System.out.println("Error");
		return;
	}
	
	int[] output=new int[a1.length];
	
	for(int i=0;i<a1.length;i++)
	{
		output[i]=a1[i]*a2[i];
		
	}
	
	System.out.println(Arrays.toString(output));
	}
}
