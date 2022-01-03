public class CheckSum {
    int chkPair(int A[], int sum) {
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                if (A[i] + A[j] == sum) {
                    System.out.println(A[i] + ", " + A[j]);
                    return 1;
                }
                if (j == (A.length-2)) {
                    if (A[i] + A[j+1] == sum) {
                        System.out.println(A[i] + ", " + A[j+1]);
                        return 1;
                    }
                }
                for (int k = j + 1; k < A.length; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.println(A[i] + ", " + A[j] + ", " + A[k]);
                        return 1;
                    }
                }
            }
        }
        return -1;
    }
}
