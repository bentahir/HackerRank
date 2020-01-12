package main;


import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        HashMap <Character,Integer> aMap = new HashMap <Character,Integer>();
        HashMap <Character,Integer> bMap = new HashMap <Character,Integer>();
        for (int i = 0; i < a.length() ; i++){
        	char c = a.charAt(i);
        	int new_value = 1;
        	if (aMap.containsKey(c)){
        		new_value = aMap.get(c) + 1;
        		aMap.put(c, new_value);
        	}
        	else{
        		aMap.put(c, new_value);
        	}
        }
        for (int i = 0; i < b.length() ; i++){
        	char c = b.charAt(i);
        	int new_value = 1;
        	if (bMap.containsKey(c)){
        		new_value = bMap.get(c) + 1;
        		bMap.put(c, new_value);
        	}
        	else{
        		bMap.put(c, new_value);
        	}
        }
        if (a.length() != b.length()){
        	return (false);
        }
        else {
        	boolean res = true;
        	for (int i=0; i < b.length() ; i++){
        		if (aMap.get(a.charAt(i)) != bMap.get(a.charAt(i))){
        			res = false;
        			break;
        		}
        	}
        	return (res);
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
