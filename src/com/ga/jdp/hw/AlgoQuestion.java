package com.ga.jdp.hw;

public class AlgoQuestion {
    public static String longestCommonPrefix(String[] words) {
        int commPrefix = 0;
        String ret = "";
        char currChar;
        boolean foundDiff = false;
        if(words.length > 0){
            for(int i = 0; i < words[0].length(); i++){
                currChar = words[0].charAt(i);
                for(int j = 1; j < words.length; j++){
                    if(i <= words[j].length()){
                        foundDiff = words[j].charAt(i) != currChar;
                    }
                }
                if(foundDiff){
                    break;
                }else{
                    commPrefix++;
                }
            }
            ret = words[0].substring(0,commPrefix);
        }
        return ret;

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
