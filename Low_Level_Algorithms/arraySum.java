import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    static int simpleArraySum(int n, int[] ar) 
    {     
        // Initialize 'sum' to 0.
        int sum = 0;
        
        // We want to loop through the array in O(N) time.
        // It's O(N) because we are looping through an array of 'N' elements.
        for(int i = 0; i < n; i++)
        {
            sum += ar[i];
        } 
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++)
        {
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
