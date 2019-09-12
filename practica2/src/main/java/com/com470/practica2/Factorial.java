
package com.com470.practica2;

public class Factorial {
    int contador;

        public long calculaFactorial(int number) {
        contador++;

        if (number < 0)
            throw new IllegalArgumentException();

        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++)
                result = result * i;
        }

        return result;
    }
}
