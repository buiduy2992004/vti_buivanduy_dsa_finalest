package org.example;

public class Bai4_1 {
    public static void main(String[] args) {
        int A[] = {100, 2130, 123, 3, 54, 6, 1, 2111, 1, 1, 1, 1, 1, 1, 45, 5, 465, 46, 1234, 54353};
        int size = A.length;
        for(int i = 0;i< size -1;i ++)
                for(int j = i+1;j< size -1 ; j ++) {
                    if (A[i]%2==1)
                    if (A[i] > A[j]) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
            }
        for(int i = 0;i< size;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println("Độ phức tạp của thật toán là O(n^2)");

    }

}