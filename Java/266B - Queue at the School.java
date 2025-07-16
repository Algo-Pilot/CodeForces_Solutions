import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int t=sc.nextInt();
	        String s=sc.next();
	        char ch[]=s.toCharArray();
	        char temp;
	        for(int j=0;j<t;j++)
	        {
	        	for(int i=0;i<ch.length-1;i++)
	        	{
	        	if(ch[i]=='B' && ch[i+1]!='B')
	        	{
	        		temp=ch[i];
	        		ch[i]=ch[i+1];
	        		ch[i+1]=temp;
	        		i++;
	        	}
	        	
	            }
	        }
	        for(int i=0;i<ch.length;i++)
	        {
	        	System.out.print(ch[i]);
	        }
	}
}
