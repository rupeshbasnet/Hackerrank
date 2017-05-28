/*2D array - DS*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int sum = Integer.MIN_VALUE;
        
        for(int arr_i=0; arr_i < 4; arr_i++){
            for(int arr_j=0; arr_j < 4; arr_j++){
               int temp = arr[arr_i][arr_j] + arr[arr_i][arr_j+1] + arr[arr_i][arr_j+2] + arr[arr_i + 2][arr_j] + arr[arr_i + 2][arr_j+1] + arr[arr_i+2][arr_j+2] + arr[arr_i + 1][arr_j + 1];
            if (temp > sum)
                sum = temp;
            }
        }
        System.out.println(sum);
    }
}