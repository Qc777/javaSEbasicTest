package com.Neuedu.World0802;

import java.util.*;
public class Topic1_1 {
	public static void main(String[] agrs){
	    String A = "ͳ��һ���ַ����ַ����е�����λ��";
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������Ҫ���ҵ��ַ�");		
		String content = scanner.next();
		char frist = content.charAt(0);
		byte[] pos = {};
		for(int i=0;i<A.length();i++){
			char c = A.charAt(i);
		if(c == frist ){
			pos = Arrays.copyOf(pos,pos.length+1);
			pos[pos.length-1] = (byte)i;
    		}
    	}
    	System.out.println(Arrays.toString(pos));
    	
    	
    }
}