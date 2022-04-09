// ====================================================Monthly Budget=======================================================

import java.util.*;

public class MonthlyBudget
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++){
	        int x = in.nextInt();
	        int y = in.nextInt();
	        if (x >= y*30){
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	    } 
	}
}
