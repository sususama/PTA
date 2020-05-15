package edu.one.zero.one.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num;
        Scanner in= new Scanner(System.in);
        num=in.nextLine();
        String [] nums=num.split(" ");
        int numbers []=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            numbers[i]=Integer.parseInt(nums[i]);
        }
        int remainder1[]=new int[nums.length]
                ,remainder3 [] =new int[nums.length],
                    remainder4 [] =new int[nums.length];
        int j=0,k=0,z=0,x=0;
        int [] a=new int[5];
        for (int i :numbers){
            switch (i%5){
                case 0:
                    if (i%2==0){
                        a[0]+=i;
                    }
                    break;
                case 1:
                    remainder1[j]=i;
                    j++;
                    break;
                case 2:
                    k++;
                    break;
                case 3:
                    remainder3[z]=i;
                    z++;
                    break;
                case 4:
                    remainder4[x]=i;
                    x++;
                    break;
            }
        }
        for (int i=0;i<remainder1.length;i++){
            a[1]= (int) (a[1]+(remainder1[i]*Math.pow(-1,i)));
        }
        a[2]=k;//余2的个数
        float even=0;
        for (int i:remainder3){
            even+=i;
        }
        even=even/remainder3.length;//平均数
        int max=0;
        for (int i:remainder4){
            if (max<i){
                max=i;
            }
        }
        a[4]=max;
        for (int i=0;i<a.length;i++){
            if (i<a.length-1) {
                if (a[i] != 0 && even != 0) {
                    if (i==3){
                        System.out.printf("%.2f"+even);
                    }
                    System.out.print(a[i]);
                }else {
                    System.out.print("N");
                }
                System.out.print(" ");
            }else {
                if (a[4]!=0)
                System.out.print(a[i]);
                else
                    System.out.print("N");
            }

        }
    }
}
