package com.stackroute.pe3;

public class ConsecutiveNum {
    boolean number = false;

    public boolean checkConsecutiveNum(String values) {
        String[] strArray = values.split(",");
        for (int i = 0; i < strArray.length - 1; i++) {
            int difference = Integer.parseInt(strArray[i + 1]) - Integer.parseInt(strArray[i]);
            if (difference == 1 || difference == -1) {
                number = true;
            } else {
                number = false;
                break;
            }
        }
        return number;
    }
}
