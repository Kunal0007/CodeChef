import java.util.*;
import java.lang.*;
import java.io.*;


public class GCDPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++){
	        int a = in.nextInt();
	        int b = in.nextInt();
	        if (a%2 == 0){
	            if (a + 2 <= b){
	                System.out.println(a + " " + (a + 2));
	            }
	            else {
	                System.out.println(-1);
	            }
	        }
	        if (a % 2 != 0){
	            if (a + 3 <= b && a % 3 == 0){
	                System.out.println(a + " " + (a + 3));
	            }
	            else if (a + 3 <= b){
	                System.out.println((a + 1) + " " + (a + 3));
	            }
	            else {
	                System.out.println(-1);
	            } 
	        }
	    }
    }
}
