package exceptions;

public class trycatch {

	public static void main(String[] args) 
	{
		try{    
            int a[]=new int[5];    
           a[5]=30/0;
           }    
          catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }  
		try 
 	   {
 	   int a[]=new int[5];
 	   a[5]=9;
 	   }
 	   catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        } 
	}

}
