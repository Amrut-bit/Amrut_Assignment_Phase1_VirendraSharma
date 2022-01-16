package filehandlings;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) {
		try {  
            File file = new File("C:\\Users\\Nozrul\\Desktop\\note.txt");
            
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
            }  
        } 
	   catch (IOException e) 
	   {  
            e.printStackTrace();  
        } 
	}

}
