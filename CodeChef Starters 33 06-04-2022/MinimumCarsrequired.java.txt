====================================================Minimum Cars required=======================================================


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++){
	        int x = in.nextInt();
	        int p = x % 4;
	        if (x <= 4){
	            System.out.println(1);
	        }
	        else {
	            System.out.println(x/4 + 1);
	        }
	    } 
	}
}
