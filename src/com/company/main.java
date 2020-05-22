package com.company;

public class main {
    void sort(int[] A) {
        int m = A.length;
        if (m<=1) return;
        int odd = 0;
        for (int x : A) {
            if (x%2==1) {
                odd++;
            }
        }
        int i = 0, j = odd;
        while (i<odd && j<A.length) {
            if (A[i]%2==1) {
                i++;
                continue;
            }
            if (A[j]%2==0) {
                j++;
                continue;
            }
            int temp = A[j];
            A[j] = A[i];
            A[i] = temp;
        }
    }

}
