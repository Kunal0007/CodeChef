import java.util.*;
import java.lang.*;
import java.io.*;

public class TheCoolerDilemma1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++){
	        int x = in.nextInt();
	        int y = in.nextInt();
	        int m = in.nextInt();
	        if (x*m < y){
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    }
    }
}
