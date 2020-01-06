package main;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String [] tabS  = new String[100];
        //s = s.replaceAll("[!,?._'@]", " ");
        tabS = s.split("[ !,?._'@]+");
        int len = tabS.length;
        for(int i = 0; i < len ; i++){
            if (tabS[i].length() == 0 ){
                len--;
            }
        }
        System.out.println(len);
        for (int i = 0; i< tabS.length; i++){
            if (tabS[i].length() != 0 )
                System.out.println(tabS[i]);
        }
        scan.close();
    }
}

