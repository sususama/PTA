package edu.one.zero.one.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int sum []=new int[1000];
        int j=0;
        for (int i=1;j<=n;i++){
            if (i==2||i==1){
                sum[j]=i;
                j++;
            }else
            if (Main.Judgenumber(i)){
                sum[j]=i;
                j++;
            }
        }
        int k=0;
        for (int i=m;i<=n;i++) {
            if (i < n) {
                if (k == 10) {
                    System.out.println();
                    k = 0;
                }
                if (k % 10 == 9) {
                    System.out.print(sum[i]);
                } else {
                    System.out.print(sum[i] + " ");
                }
                k++;

            }else {
                System.out.print(sum[i]);
            }
        }
    }
    public static boolean Judgenumber(int n){
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

