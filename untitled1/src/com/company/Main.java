package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 500; i <= 650; i += 10) {
            System.out.println(i);
        }
        int x = 500;
        while (x <= 650) {
            System.out.println(x);
            x += 10;
        }
        int k = 490;
        do {
            k += 10;
            System.out.println(k);
        }
        while (k < 650);
        int b = 0;
        for (int h = 2; ; h++) {
            b += 2 * h - 1;
            if (b > 5000) {
                break;
            }
            System.out.println(b);
        }
        for(int v=1; v<10;v++){
            if (10 % v == 0) {
                System.out.println(v);
            }
            int z=10*9;
            for(int s=8;s>0; s--){
                z+=z*s;
                System.out.println(z);
            }

        }
    }
}
