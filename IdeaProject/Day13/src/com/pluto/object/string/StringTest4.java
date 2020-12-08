package com.pluto.object.string;

public class StringTest4 {
    public static void main(String[] args) {
        String maxStr = "woaijavawozhendeaijavawozhenjavadehenaijavaxinbuxinwoaijavagun";
        String minStr ="java";
        int count = StringTest4.getCount(maxStr, minStr);
        System.out.println(count);

    }

    public static  int getCount(String maxString,String minString) {
        int count = 0;

        int index ;

        while((index = maxString.indexOf(minString))!=-1){
            count++;
//            int startIndex = index + minString.length();
//            maxString = maxString.substring(startIndex);
            maxString = maxString.substring(index+minString.length());
        }
        return count;

    }
}

