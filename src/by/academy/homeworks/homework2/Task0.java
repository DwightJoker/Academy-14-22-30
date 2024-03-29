package by.academy.homeworks.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Task0 {

            // Complete the pairs function below.
            static int pairs (int k, int[] arr) {

                int pairsCount = 0;

                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (Math.abs(arr[i] - arr[j]) == k) {
                            pairsCount++;
                        }
                    }
                }
                return pairsCount;
            }

            public static final Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) throws IOException {

                String[] nk = scanner.nextLine().split(" ");

                int n = Integer.parseInt(nk[0]);

                int k = Integer.parseInt(nk[1]);

                int[] arr = new int[n];

                String[] arrItems = scanner.nextLine().split(" ");
                //System.out.println(Arrays.toString(arr));

                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(arrItems[i]);
                    //System.out.println(arr[i]);
                }

                int result = pairs(k, arr);
                System.out.println(result);

                scanner.close();
            }
    }

