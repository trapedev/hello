package com.kazuate;

import java.util.Scanner;
import java.util.Random;

public class Main 
{
    public static void main( String[] args ) {

        Random rd = new Random();
        int targetNumber = rd.nextInt(90) + 10;
        Scanner sc = new Scanner(System.in);
     
        for(int i = 0; i < 5; i++) {
            System.out.println("こちらで予想して欲しい数（以下，ターゲット数）を生成しました．あなたが予想した数を入力してください．");
            int guess = sc.nextInt();
            if (guess == targetNumber) {
                    System.out.println("当たり！！！！！！！！");
                    sc.close();
                    return;
                } else if (guess < targetNumber) {
                    System.out.println("予想した数はターゲット数より小さいです．");
                    if (targetNumber - guess >= 20) {
                        System.out.println("ターゲット数より20以上小さいです．");
                    }
                } else {
                    System.out.println("予想した数はターゲット数より大きいです．");
                    if (guess - targetNumber >= 20) {
                        System.out.println("ターゲット数より20以上大きいです．");
                    }
                }
        }
        System.out.println("5回の予想が終了しました．ターゲット数は " + targetNumber + " でした．お疲れ様でした．");
        sc.close();
    }
}
