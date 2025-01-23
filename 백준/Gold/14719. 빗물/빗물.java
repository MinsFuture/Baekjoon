import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        boolean[][] block = new boolean[w][h];

        for (int i = 0; i < w; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                block[i][j] = true;
            }
        }

        int sum = 0;

        for (int j = 0; j < h; j++) {
            for(int i = 0; i<w; i++){
                boolean left = false;
                boolean right = false;

                if(!block[i][j]){
                    // 왼쪽
                    for(int l = 0; l<i; l++){
                        if(block[l][j]){
                            left = true;
                            break;
                        }
                    }

                    // 오른쪽
                    for(int r = i+1; r<w; r++){
                        if(block[r][j]){
                            right = true;
                            break;
                        }
                    }

                    if(left && right){
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);


    }
}