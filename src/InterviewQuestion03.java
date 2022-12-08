public class InterviewQuestion03 {

    public static void main(String args[]) {
        int kume[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = kume.length; //kumenin length'ini bulup 'n' e assign ediyoruz
        if (altKumeTop(kume, n, sum) == true)
            System.out.println("Subset i ul"
                    + " with given sum");   // eger  islem 'true' a esit ise consol da bu yaziyi dondur.
        else
            System.out.println("No subset with"
                    + " given sum"); // eger  islem 'true' a esit DEGIL ise consol da bu yaziyi dondur.

    }

    // Eger subset var ise sonuc u 'true' olarak dondur
    static boolean altKumeTop(int kume[],
                               int n, int sum) {
        if (sum == 0)
            return true;
        if (n == 0)
            return false;

        if (kume[n - 1] > sum)
            return altKumeTop(kume, n - 1, sum);


        return altKumeTop(kume, n - 1, sum)
                || altKumeTop(kume, n - 1, sum - kume[n - 1]);
    }


}