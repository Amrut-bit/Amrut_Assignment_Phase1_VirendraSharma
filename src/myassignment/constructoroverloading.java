package myassignment;



public class constructoroverloading
{
	 constructoroverloading(int a)
		{
			int areaofsquare = a*a;
		}
	 constructoroverloading(int l,int b)
		{
			double areaofrect=l*b;
		}
	 constructoroverloading(double r)
		{
			 double circle=2*3.142*r;	
		} 

	public static void main(String[] args)
	{
		 constructoroverloading a=new  constructoroverloading(36.53);

		System.out.println(a);
	}

}
