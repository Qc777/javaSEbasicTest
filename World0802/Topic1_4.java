package com.Neuedu.World0802;

public class Topic1_4 {
    public static void main(String[] args) {
	    int A = 56123;
	    String B = String.valueOf(A);
	    StringBuffer stringBuffer = new StringBuffer(B);
	    StringBuffer stringBuffer2 = stringBuffer.reverse();
	    String C = stringBuffer2.toString();
	    int D = Integer.parseInt(C);
	    System.out.print(D);
	    
}
}
