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

        int n = 999;
        boolean[] numbers = new boolean[1000];

        for (int i = 0; i < n; i++) {
            numbers[i] = true;

        }
        for (int p = 2; p * p <= 999; p++) {
            if (numbers[p] == true) {
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
