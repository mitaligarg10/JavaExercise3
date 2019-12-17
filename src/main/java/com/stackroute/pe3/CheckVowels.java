package com.stackroute.pe3;

public class CheckVowels {
    public String[] removeVowels(String string[]) {
        for (int i = 0; i < string.length; i++)
            string[i] = string[i].replaceAll("[aeiouAEIOU]", "");
        return string;
    }
}
