package pillersofjava;

public class polymorphasim {
	public int polymorphasim(int x, int y) 
    { 
        return (x + y); 
    } 
    public int polymorphasim(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double polymorphasim(double x, double y) 
    { 
        return (x + y); 
    } 


	public static void main(String[] args) {
		polymorphasim s = new polymorphasim(); 
        System.out.println(s.polymorphasim(10, 20)); 
        System.out.println(s.polymorphasim(10, 20, 30)); 
        System.out.println(s.polymorphasim(10.5, 20.5));


	}

}
