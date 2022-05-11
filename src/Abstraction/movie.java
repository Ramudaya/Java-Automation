package Abstraction;

public class movie
{
	public movie(float fo,long date) {
	System.out.println("movie name:" +fo+","+date);

}
    public movie(float no,short dig) {
    System.out.println("flat no:"+no+","+dig );
    }
    public movie(char initial,String namee) {
    System.out.println("director ini :"+initial+","+namee);
	}
    public movie() {
    System.out.println("welcome to movie");
    }
	
	
	public static void main(String[] args) {
		movie m = new movie();
		movie m1 = new movie(65.87f,277863);
		movie m2 = new movie(54.344f,97);
		movie m3 = new movie('h',"vinod");
		
		
		
		
	}
	
	
}


