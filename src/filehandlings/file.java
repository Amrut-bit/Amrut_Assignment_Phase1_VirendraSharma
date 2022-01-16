package filehandlings;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
		   try {  
	            File file = new File("H:\\ambu");
	            
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");
	            
	            } 
	            else 
	            {                   
	                if(file.exists())
	                {
	                    System.out.println("File already exists.");
	                }
	                else
	                {
	                	System.out.println("File doesnot exists.");
	                }
	               
	               
	                boolean b = file.delete();
	                if(b==true)
	                {
	                	System.out.println("File deleted !!");
	                }
	                else
	                {
	                	System.out.println("File not deleted");
	                }
	                
	            }  
	        } 
		   catch (IOException e) 
		   {  
	            e.printStackTrace();  
	        } 
		   File file1 = new File("H:\\");
			 System.out.println(file1.list());
	}

}
