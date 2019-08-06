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
	String race;    //种族
	String profession;    //职业
	String strength;   
	String agility;    //敏捷
	String physical;    //体力
	String mentality;    //智力
	String wisdom;    //智慧
	String life;   
	String magic;   //魔法值
	
		public static void main(String[] args) {
			System.out.println("这是一个RPG游戏！");
			System.out.println("1.开始游戏");
			System.out.println("2.游戏规则");
			System.out.println("3.结束游戏");
			System.out.println("请输入您想进行的操作（1-3）：");
			
			Scanner scanner = new Scanner(System.in);
			int A = scanner.nextInt();
				if(A == 1) {
					System.out.println("请输入您游戏角色的名字:");
					String name = scanner.next();
					System.out.println("1.人类  2.精灵  3.兽人 4.矮人  5.元素");
					System.out.println("请输入您想进行的操作（1-5）：");
					int Ab = scanner.nextInt();
					System.out.println("1.男  2.女");
					System.out.println("请输入您想进行的操作（1-2）：");
					int sex = scanner.nextInt();
					if(Ab != 6) {
						System.out.println("恭喜您，创建成功	！");
						System.out.println("您的游戏名为:"+name);
						if(Ab == 1) {
							System.out.println("您的种族为:人类");
						}else if(Ab == 2) {
							System.out.println("您的种族为:精灵");
						}else if(Ab == 3) {
							System.out.println("您的种族为:兽人");
						}else if(Ab == 4) {
							System.out.println("您的种族为:矮人");
						}else if(Ab == 5) {
							System.out.println("您的种族为:元素");
						}
						
						
						if(sex == 1) {
							System.out.println("您的性别为:男");
						}else {
							System.out.println("您的性别为:女");
						}
						System.out.println("您的职业为:(请进入游戏后自行选择)");
						Random random = new Random();
						int strength = random.nextInt(9999);
						System.out.println("您的力量值为:"+strength);
						int agility = random.nextInt(9999);
						System.out.println("您的敏捷值为:"+agility);
						int physical = random.nextInt(9999);
						System.out.println("您的体力值为:"+physical);
						int mentality = random.nextInt(9999);
						System.out.println("您的智力值为:"+mentality);
						int wisdom = random.nextInt(9999);
						System.out.println("您的智慧值为:"+wisdom);
						System.out.println("您的生命值为:1000");
						System.out.println("您的魔法值为:980");
					}
					
					
					
					
					
					
					
					
					
					
				}else if(A == 2) {
					System.out.println("游戏规则...........");
				}else {
					System.out.println("系统退出");
				}

		}

	
}
