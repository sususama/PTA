package edu.one.zero.one.five;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, l, h;
        System.out.println("请输入考生总数，录取最低分数线，优先录取线");
        n = in.nextInt();
        l = in.nextInt();
        h = in.nextInt();
        Student[] s = new Student[n];
        Student[] excellent;
        Student[] fool;
        Student[] residue;
        for (int i = 0; i < n; i++) {
            in = new Scanner(System.in);
            System.out.println("请输入准考证号，德分，才分");
            s[i].nodes = in.nextLine();
            s[i].morality = in.nextInt();
            s[i].literary = in.nextInt();
        }
        excellent = discerne(s, n, l, h);
        excellent = sorte(excellent);
        System.out.println(excellent.length);
        out(excellent);

    }

    public class Student implements Comparable<Student> {
         int morality;//德
         int literary;//才
         String nodes;

        @Override
        public int compareTo(Student o) {
            return 0;
        }
    }

    public static Student[] discerne(Student[] s, int n, int l, int h) {//筛选才德全尽
        Student[] e = new Student[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].literary >= l && s[i].morality >= h||s[i].literary>=l) {
                e[j] = s[i];
                j++;
            }
        }
        return e;
    }

    public static Student[] sorte(Student[] e) {//德才全尽排序
        Student temp;
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if ((e[j].literary + e[j].morality) < (e[j - 1].literary + e[j - 1].morality)) {
                    temp = e[j];
                    e[j] = e[j - 1];
                    e[j - 1] = temp;
                } else if ((e[j].literary + e[j].morality) == (e[j - 1].literary + e[j - 1].morality)) {
                    for (int k = 0; k < e.length - 1; k++) {
                        for (int z = k + 1; z > 0; z--) {
                            if (e[k].literary< e[k - 1].literary) {
                                temp = e[k];
                                e[k] = e[k - 1];
                                e[k - 1] = temp;
                            }
                        }
                    }
                }

            }
        }
        return e;
    }
    public static void out (Student[]s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].nodes + " " + s[i].morality +" "+ s[i].literary);
        }
    }
}