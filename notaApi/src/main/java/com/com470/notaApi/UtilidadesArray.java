package com.com470.notaApi;

public class UtilidadesArray {

    public String[] ArrayStrings(String... strings) {
        String[] array = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array[i] = strings[i];
        }
        return array;
    }

    public boolean esMayorQue10(int num) {
        if (num > 10) {
            return true;
        } else {

            return false;
        }
        //return num>10;
    }

}
