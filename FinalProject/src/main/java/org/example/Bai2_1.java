package org.example;

public class Bai2_1 {
    public static void main(String[] args) {
        int n = 123432;
        if (kiemtra(n)){
            System.out.println( "  đối xứng");
        }else {
            System.out.println("không đối xứng");
        }

    }
    public static boolean kiemtra(int n){
        String s = Integer.toString(n);
        int l = s.length()-1;
        for (int i =0; i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(l)){
                return false;
            }
        }
        return true;
    }
}
