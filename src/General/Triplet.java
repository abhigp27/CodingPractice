package General;

import java.util.Scanner;

public class Triplet {

    static int countTriplet(int[] arr, int x) {
        int counter = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int temp1 = Math.abs(arr[i] - arr[j]);
                    int temp2 = Math.abs(arr[j] - arr[k]);
                    int temp3 = Math.abs(arr[i] - arr[k]);

                    if (temp1 <= x && temp2 <= x && temp3 <= x)
                        counter++;

                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while (tc > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(countTriplet(arr, k));
            tc--;
        }
    }
}
