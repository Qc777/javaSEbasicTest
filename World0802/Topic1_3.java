package com.Neuedu.World0802;

public class Topic1_3 {
    public static void main(String[] args) {
    	String A = "123456789012";
    	int odd = 0;
    	int even = 0;
    	for(int i=0;i<A.length();i++) {
    	    if(i%2 == 0) {
    	    	odd = odd +A.charAt(i);
            }else {
                even = even + A.charAt(i);
            }
    	}
    	System.out.println("奇数和为："+odd);
    	System.out.println("偶数和为："+even);
    }
}
