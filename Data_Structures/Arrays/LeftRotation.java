/*Left Rotation*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[(n+i-r)%n] = in.nextInt(); 
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        
    }
}