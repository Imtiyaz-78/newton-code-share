package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaxNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testcase = 1; testcase <= t; testcase++) { //n*(4n) -> 4n^2 -> n^2
            // t*(4n)
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            } //n
            int firstMaxiIdx = -1, firstMaxi = -1;
            for (int i = 0; i < n; i++) {
                if (firstMaxi < arr[i]) {
                    firstMaxi = arr[i];
                    firstMaxiIdx = i;
                }
            } //n
            arr[firstMaxiIdx] = -1;

            int secondMaxiIdx = -1, secondMaxi = -1;
            for (int i = 0; i < n; i++) {
                if (secondMaxi < arr[i]) {
                    secondMaxi = arr[i];
                    secondMaxiIdx = i;
                }
            } //n

            arr[secondMaxiIdx] = -1;


            int thirdMaxiIdx = -1, thirdMaxi = -1;
            for (int i = 0; i < n; i++) {
                if (thirdMaxi < arr[i]) {
                    thirdMaxi = arr[i];
                    thirdMaxiIdx = i;
                }
            } //n
            // n+ n+ n+n => 4n
            System.out.println(firstMaxi + " " + secondMaxi + " " + thirdMaxi);
        }
    }
}