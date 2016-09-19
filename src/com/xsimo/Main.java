package com.xsimo;

public class Main {

    public static void main(String[] args) {

        for(int i =0;i<3;i++) {
            char a = 'a'-1;//+25;
            char b = '0'-1;//9;
            char c = 'A'-1;//+25;
            char d = '!'-1;//
            a+= Math.ceil((Math.random()*26));
            b+= Math.ceil((Math.random()*10));
            c+= Math.ceil((Math.random()*26));
            d+= Math.ceil((Math.random()*15));
            System.out.print(a);
            System.out.print(b);
            System.out.print(c);
            System.out.print(d);
        }
    }
}
