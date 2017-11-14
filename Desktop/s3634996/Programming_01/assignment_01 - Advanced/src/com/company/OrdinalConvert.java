package com.company;

public class OrdinalConvert {
    public static String ordinal(int i) {
        String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + suffixes[i % 10];
        }
    }
    protected static String convert(int i){
        int ordinal_number = i+1;
        String ordinal_letter = ordinal(ordinal_number);
        return ordinal_letter;
    }
}
