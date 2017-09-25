/*
 * David Hiebl
 * 3BHIF
 * 2017/18
 */
package hiebldavid_gcd;

import java.io.*;

public class HieblDavid_GCD {

    public static void main(String[] args) throws IOException {
        System.out.print("GCD\n");
        System.out.print("===\n");
        System.out.print("\n");
        int a = 0;
        int b = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Zahl 1: ");
        a = Integer.valueOf(in.readLine());
        System.out.print("Zahl 2: ");
        b = Integer.valueOf(in.readLine());
        System.out.printf("GCD-PrimeFactors: %d\n", gcdPrimeFactors(a, b));
        System.out.printf("GCD-Euclean: %d\n", gcdEuclean(a, b));
    }
    /**
     * 
     * @param a
     * @param b
     * @return gcd
     * 
     * Funktioniert durch Primzahlenzerlegung
     */
    public static int gcdPrimeFactors(int a, int b){
        int ggt = 1;
        int index = 2;
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        while (a != 1 && b != 1) {  
            if (a % index == 0 && b % index == 0) {
                ggt *= index;
            }          
            if (a % index == 0) {
                a /= index;
            }
            if (b % index == 0) {
                b /= index;
            }
            if (a % index != 0 && b % index != 0) {
                index++;
            }
        }
        return ggt;
    }
    /**
     * 
     * @param a
     * @param b
     * @return gcd
     * 
     * gcd nach Eucleanischen Algorithmus
     */
    public static int gcdEuclean(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcdEuclean(b, a % b);
    }
}
