/*
* David Lutelmowski
* 3/01/19
* Eratosthenes
*/
package eratosthenes;
/**
 *
 * @author dalut3278
 */
public class Eratosthenes {
        public static void main(String[] args) {
        // This program determines the prime numbers between 1-1000
        int n = 999;
        boolean[] numbers = new boolean[1000];
        // Sets all numbers to true
        for (int i = 0; i < n; i++) {
            numbers[i] = true;
        }
        for (int p = 2; p * p <= 999; p++) {
            if (numbers[p] == true) {
        // Eliminates all values that doesn't satisfy the prime number definition
        for (int i = p * p; i <= n; i += p) {
                    numbers[i] = false;
                }
            }
        }
        System.out.print("The prime numbers are:" + "\n");
        for (int i = 2; i <= n; i++) {
            if (numbers[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
