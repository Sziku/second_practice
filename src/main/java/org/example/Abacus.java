package org.example;

import java.util.Arrays;

public class Abacus {
    public static Integer findAbacus(char[][] arrays) {
        for (int i = 0; i < arrays.length ; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if(arrays[i][j]=='A' && arrays[i][j+1]=='b' && arrays[i][j+2]=='a' && arrays[i][j+3]=='c' && arrays[i][j+4]=='u'&& arrays[i][j+5]=='s'){
                    return i;
                }
            }
        }
        return null;
    }

}
