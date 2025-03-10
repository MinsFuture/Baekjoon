import java.io.*;
import java.util.*;

public class Main {

    static int []ary;
    static int [] LIS;
    static int lastIndex;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ary = new int[n];
        LIS = new int[n];

        for(int i = 0; i<n; i++){
            ary[i] = sc.nextInt();
        }

        LIS[0] = ary[0];
        lastIndex = 0;
        for(int i = 1; i<n; i++){
            if(LIS[lastIndex] < ary[i]){
                LIS[++lastIndex] = ary[i];
            } else{
                int replaceIndex = findLowerBound(ary[i]);
                LIS[replaceIndex] = ary[i];
            }
        }

        System.out.println(lastIndex + 1);
    }

    public static int findLowerBound(int target){
        int left = 0;
        int right = lastIndex;

        while(left <= right){
            int mid = (left + right) / 2;

            if(LIS[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}