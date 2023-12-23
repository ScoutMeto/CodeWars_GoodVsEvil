package org.example;

public class GoodVsEvil {
    public static String battle (String goodAmounts, String evilAmounts) {

        //white-space erase by .split() method at string
        //convertion Strings->Arrays
        String[] goodArray = goodAmounts.split(" ");
        String[] evilArray = evilAmounts.split(" ");

        //declare empty int[] arrays for convertion string array to int array
        int[] goodArrayInt = new int[goodArray.length];
        int[] evilArrayInt = new int[evilArray.length];

        //loops for loading and parsing String values to new parameters
        for (int i = 0; i < goodArray.length; i++) {
            goodArrayInt[i] = Integer.parseInt(goodArray[i]);
        }

        for (int i = 0; i < evilArray.length; i++) {
            evilArrayInt[i] = Integer.parseInt(evilArray[i]);
        }

        //declare empty int[] array for matching points due to type of soldier of concrete army
        int[] goodArrayPoints = new int[goodArrayInt.length];
        int[] evilArrayPoints = new int[evilArrayInt.length];

        //points matching
        for (int i = 0; i < goodArrayPoints.length; i++) {
            switch (i) {
                case 0:
                    goodArrayPoints[i] = goodArrayInt[i]*1;
                    break;
                case 1:
                    goodArrayPoints[i] = goodArrayInt[i]*2;
                    break;
                case 2:
                case 3:
                    goodArrayPoints[i] = goodArrayInt[i]*3;
                    break;
                case 4:
                    goodArrayPoints[i] = goodArrayInt[i]*4;
                    break;
                case 5:
                    goodArrayPoints[i] = goodArrayInt[i]*10;
                    break;
            }
        }

        for (int i = 0; i < evilArrayPoints.length; i++) {
            switch (i) {
                case 0:
                    evilArrayPoints[i] = evilArrayInt[i]*1;
                    break;
                case 1:
                case 2:
                case 3:
                    evilArrayPoints[i] = evilArrayInt[i]*2;
                    break;
                case 4:
                    evilArrayPoints[i] = evilArrayInt[i]*3;
                    break;
                case 5:
                    evilArrayPoints[i] = evilArrayInt[i]*5;
                    break;
                case 6:
                    evilArrayPoints[i] = evilArrayInt[i]*10;
                    break;
            }
        }

        //declare empty int for sum points
        int goodSumPoints = 0;
        int evilSumPoints = 0;

        //loop for sum
        for (int i = 0; i < goodArrayPoints.length; i++) {
            goodSumPoints += goodArrayPoints[i];
        }

        for (int i = 0; i < evilArrayPoints.length; i++) {
            evilSumPoints += evilArrayPoints[i];
        }

        System.out.println(goodSumPoints);
        System.out.println(evilSumPoints);

        //final equals and result
        String result;
        if (goodSumPoints == evilSumPoints) {
            result = "Battle Result: No victor on this battle field";
        } else if (goodSumPoints > evilSumPoints) {
            result = "Battle Result: Good triumphs over Evil";
        } else {
            result = "Battle Result: Evil eradicates all trace of Good";
        }

        return result;
    }
}
