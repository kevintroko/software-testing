package com.company;

/**
* Find the last index of elements
*
* @param x array to search
* @param y value to look for
* @return the last index of y in x; -1 if absent
* @Throws NullPointerException if x is null
*/

public class Main {
    public static int findLast (int[] x, int y) {
        for(int i=x.length-1; i>0; i--){
            if(x[i]==y){
                return i;
            }
        }
    return -1;
    }
}
