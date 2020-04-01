import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int m = sc.nextInt();
        int count=0;
        int sum=0;
        for(int j=0;j<=a.length-m;j++){
        for(int k=j;k<j+m;k++){
            sum+=a[k];
        }
         if(sum==d){
         count++;   
         } 
         sum=0;   }
        
        System.out.println(count);
    }
}
