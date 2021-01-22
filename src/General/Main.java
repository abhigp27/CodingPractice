package General;

import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int f=0, l=-1;
        for(int i=0;i<n;) {
            if (sum > s) {
                while (sum > s && f<= i) {
                    sum -= arr[f];
                    f++;
                }
            } else if (sum < s) {
                sum += arr[i];
                i++;
            }

            if (sum == s) {
                l = i;
                list.add(f+1);
                list.add(l);
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int N = 5, S = 12;
        int A[] = {1,2,3,7,5};
        ArrayList<Integer> list = subarraySum(A, N, S);
        list.forEach(System.out::println);
    }
}
