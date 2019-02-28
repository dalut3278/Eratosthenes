/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenes;

/**
 *
 * @author dalut3278
 */
public class Eratosthenes {

    public static void main(String[] args) {

        int n = 1000;
        boolean[] numbers = new boolean[1001];

        for (int i = 0; i < n; i++) {
            numbers[i] = true;

        }
        for (int p = 2; p * p <= 1000; p++) {
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
