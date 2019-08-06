package com.Neuedu.World0802;

import java.util.Arrays;

public class Topic2_3 {
    public static void main(String[] args) {
    	char[] A = {1,7,9,11,13,15,17,19};
    	char[] B = {2,4,6,8,10};
    	char[] C = {};
    	C = Arrays.copyOf(A,A.length+5);
    	C[A.length-1] = 10;
    	C[A.length-2] = 8;
    	C[A.length-3] = 6;
    	C[A.length-4] = 4;
    	C[A.length-5] = 2;
    	System.out.print(Arrays.toString(C));
    }
}
