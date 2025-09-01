package com.multi.Object.util;

import java.util.Random;

public class UtilEx5 {
    public static void main(String[] args) {
        Random random = new Random();

        // 정수 난수
        int randomInt = random.nextInt(100); // 0~99
        System.out.println("Random Integer: " + randomInt);

        // 실수 난수
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // 불린 난수
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }
}
