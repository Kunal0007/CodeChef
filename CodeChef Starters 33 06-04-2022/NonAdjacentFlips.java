// ====================================================Non Adjacent Flips=======================================================

import java.util.*;


public class NonAdjacentFlips
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for (int i = 0; i < n; i++){
	        int count = 0;
	        int l = in.nextInt();
	        String s = in.next();
	        for(int c = 0; c < s.length(); c++){
	            if (s.charAt(c) == '0'){
	                continue;
	            }
	            else if (c < s.length()-1 && s.charAt(c)=='1' && s.charAt(c + 1) == '1'){
	                count = 2;
	                break;
	            }
	            else {
	                count = 1;
	            }
	        }
	        System.out.println(count);
	    }
	}
}
