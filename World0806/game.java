package com.Neuedu.World0806;
/**
 *@author Qc
 *@since 20190806
 *@version 1.0
 * */

import java.util.*;
public class game {
	String name; 
	char sex;
	String race;    //����
	String profession;    //ְҵ
	String strength;   
	String agility;    //����
	String physical;    //����
	String mentality;    //����
	String wisdom;    //�ǻ�
	String life;   
	String magic;   //ħ��ֵ
	
		public static void main(String[] args) {
			System.out.println("����һ��RPG��Ϸ��");
			System.out.println("1.��ʼ��Ϸ");
			System.out.println("2.��Ϸ����");
			System.out.println("3.������Ϸ");
			System.out.println("������������еĲ�����1-3����");
			
			Scanner scanner = new Scanner(System.in);
			int A = scanner.nextInt();
				if(A == 1) {
					System.out.println("����������Ϸ��ɫ������:");
					String name = scanner.next();
					System.out.println("1.����  2.����  3.���� 4.����  5.Ԫ��");
					System.out.println("������������еĲ�����1-5����");
					int Ab = scanner.nextInt();
					System.out.println("1.��  2.Ů");
					System.out.println("������������еĲ�����1-2����");
					int sex = scanner.nextInt();
					if(Ab != 6) {
						System.out.println("��ϲ���������ɹ�	��");
						System.out.println("������Ϸ��Ϊ:"+name);
						if(Ab == 1) {
							System.out.println("��������Ϊ:����");
						}else if(Ab == 2) {
							System.out.println("��������Ϊ:����");
						}else if(Ab == 3) {
							System.out.println("��������Ϊ:����");
						}else if(Ab == 4) {
							System.out.println("��������Ϊ:����");
						}else if(Ab == 5) {
							System.out.println("��������Ϊ:Ԫ��");
						}
						
						
						if(sex == 1) {
							System.out.println("�����Ա�Ϊ:��");
						}else {
							System.out.println("�����Ա�Ϊ:Ů");
						}
						System.out.println("����ְҵΪ:(�������Ϸ������ѡ��)");
						Random random = new Random();
						int strength = random.nextInt(9999);
						System.out.println("��������ֵΪ:"+strength);
						int agility = random.nextInt(9999);
						System.out.println("��������ֵΪ:"+agility);
						int physical = random.nextInt(9999);
						System.out.println("��������ֵΪ:"+physical);
						int mentality = random.nextInt(9999);
						System.out.println("��������ֵΪ:"+mentality);
						int wisdom = random.nextInt(9999);
						System.out.println("�����ǻ�ֵΪ:"+wisdom);
						System.out.println("��������ֵΪ:1000");
						System.out.println("����ħ��ֵΪ:980");
					}
					
					
					
					
					
					
					
					
					
					
				}else if(A == 2) {
					System.out.println("��Ϸ����...........");
				}else {
					System.out.println("ϵͳ�˳�");
				}

		}

	
}
