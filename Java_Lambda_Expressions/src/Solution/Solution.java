package Solution;

import java.io.*;
import java.util.*;
interface PerformOperation {
	boolean check(int a);
}
class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd ()  {

		return (int x) -> { 
			if (x%2 == 0) 
				return false;
			else
				return true;
		}; 
	}
	public PerformOperation isPrime ()  {

		return (int x) -> { 
			int i;
			for (i = 2; i <= x - 1; i++)
			{
				if (x % i == 0)
				{
					return false;
				}
			}
			if (i == x)
			{
				return true;
			}
			return false;

		}; 
	}

 public PerformOperation isPalindrome ()  {

	 return (int x) -> { 
		 String s = String.valueOf(x);
		 String reverse = new StringBuffer(s).reverse().toString();
		 if (s.equals(reverse))
			 return true;
		 else
			 return false;

	 }; 
 }      
 


}


   // Write your code here

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}