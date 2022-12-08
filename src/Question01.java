class Question01 {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 100, 3, -219, -20, 27, 150};

        System.out.println("Minimum fark= "
                + minFarkiBul(arr, arr.length));

    }


    // Iki sayi arasindaki min farki bulan method olusturuldu
    static int minFarkiBul(int[] arr, int n) {

        int fark = Integer.MAX_VALUE;

        //Bir loop olusturularak array icerisindeki sayilar birbirinden cikarildi
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < fark)
                    fark = Math.abs((arr[i] - arr[j]));


        return fark; // Return min fark
    }


}