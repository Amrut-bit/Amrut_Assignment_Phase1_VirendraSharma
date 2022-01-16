package myassignment;

public class arrays {

	public static void main(String[] args)
	{
		
		System.out.println(" one dimensional array: "); 
		int[] a = new int[3];
		 a[0] = 1;
		 a[1] = 111;
		 a[2] = 1111;
		 
        for (int i = 0; i < 3; i++)
        {
            System.out.println(a[i]);
        }
        
        int[][] arrnumbers = {{2, 4},{6, 8}};   
        System.out.println("Two dimensional array: ");    
        for(int j = 0; j < 2; j++) 
        {
           for(int k = 0; k < 2; k++) 
           {
              System.out.print(arrnumbers[j][k]);
           }
           System.out.println();
        }
        
        
	}
	
	

}
