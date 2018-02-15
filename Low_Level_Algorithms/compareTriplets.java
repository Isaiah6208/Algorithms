import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args)
    {
        // Using Ternary Operators. T
        // The solution will be completed in O(N) time.
        // It is O(6N) because the input is always going to be 6 numbers.
        // So by dropping constants, we have O(N) time as a result.
        
        Scanner in = new Scanner(System.in);
        
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
       
        int  alice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0) ;
        int bob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0) ;
        
        System.out.println(alice + " " + bob);
    }
}
