package easy15;

import java.util.Arrays;


public class sortarr
{
 
	public static void main(String[] args)
	   {
	     // String[] name = {"loki", "gopi", "kali", "gabi"};
		String[] Words = new String[4]; 
        Words[0] = "Android";
        Words[1] = "Java";
        Words[2] = "CSS";
        Words[3] = "JavaScript";   

        for(String word : Words) {
     	   System.out.println(word);

           // System.out.println(word); 
        } 

	      String temp;
	      

	      int i, j;
	      int n=4;
	      for(i=0; i<n; i++)
	      {
	         for(j=1; j<n; j++)
	         {
	            if(Words[j-1].compareTo(Words[j])>0)
	            {
	               temp=Words[j-1];
	               Words[j-1]=Words[j];
	               Words[j]=temp;
	            }
	         }
	      }
	      
	      System.out.println("\nsort in order:");
	      for(i=0;i<n;i++)
	         System.out.print("  "+Words[i]);
	   }
	
}
