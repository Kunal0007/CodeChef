// ====================================================The Cheaper Cab=======================================================

import java.util.*;

public class TheCheaperCab
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++){
	        int x = in.nextInt();
	        int y = in.nextInt();
	        if (x < y){
	            System.out.println("FIRST");
	        }
	        else if (x > y) {
	            System.out.println("SECOND");
	        }
	        else {
	            System.out.println("ANY");
	        }
	    } 
	}
}
