import java.util.*;
import java.lang.*;
import java.io.*;


public class TheCoolerDilemma2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++){
	        int x = in.nextInt();
	        int y = in.nextInt();
	        if (y%x != 0){
	            System.out.println(y/x);
	        }
	        else {
	            System.out.println(y/x - 1);
	        }
	    }
    }
}
