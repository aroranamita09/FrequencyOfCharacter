package com.stackroute;

public class TotalOccurences {
   int checkOccurence(String str1, String str2){
        int count  = 0;
        for (int  i=0; i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(0)){
                count++;
            }
        }
        return count;
    }

}

