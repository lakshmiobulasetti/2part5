import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
     String s1,s2;
     Scanner s =new Scanner(System.in);
     System.out.println("enter the first string");
     s1=s.nextLine();
     System.out.println("enter the second string");
     s2=s.nextLine();
     if(s1.compareTo(s2)>0)
     {
     System.out.println("first string is greater than second");
     }
     else if(s1.compareTo(s2)<0)
     {
     System.out.println("the first string id smaller than second");
     }
     else
     {
     System.out.println("both strings are equal");
	}
	System.out.println(s1);
	}
}
     

