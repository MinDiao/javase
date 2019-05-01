package com.hpe.day12_3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		PhoneManageServer arr[] = new PhoneManageServer[10];
		
		/*arr[0] = new Person("sdf", "sdlfk", 23, "sdkf", "sdklf", "sdklf");
		arr[1] = new Person("qwer", "sdlfk", 23, "sdkf", "sdklf", "sdklf");*/
		
		//定义数组总下标
		int index = 0;
		//菜单输入循环
		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("电话本管理系统"); 
			System.out.println("1.添加   2.删除   3.修改   4.查询所有   5.根据姓名查询   0.退出"); 
			System.out.println("请选择业务"); 
			int input = sc.nextInt();

			switch (input) {
				case 0:/*退出系统*/
					System.out.println("退出系统");
					/*System.exit(0);*/
					i = arr.length + 1;//超出总循环判断
					break;
	
				case 1:/*输入数值实例化数组对象*/
					//输入
					System.out.println("添加电话本");
					System.out.println("姓名：");
					String name = sc.next();
					System.out.println("性别：");
					String sex = sc.next();
					System.out.println("年龄");
					String age = sc.next();
					System.out.println("电话");
					String phone = sc.next();
					System.out.println("QQ");
					String qq = sc.next();
					System.out.println("地址");
					String location = sc.next();
					//实例化数组对象
					arr[index] = new PhoneManageServer(name, sex, age, phone, qq, location); 
					index++;//下标自增
					System.out.println("添加成功");
					break;
				
				case 2:/*删除电话本*/
					System.out.println("删除电话本");
					System.out.println("请输入要删除的姓名：");
					Scanner sc1 = new Scanner(System.in);
					//循环
					for (int j = 0; j < index; j++) {
						if (sc1.next().equals(arr[j].name)) {
							/*for (int k = 0; k < index - 1; k++) {
								arr[k] = arr[k + 1];
							}
							index--;*/
							arr[j] = null;
							System.out.println(arr.length);
							System.out.println("删除成功");
							break;
						} else {
							System.out.println("无此联系人");
						}
					}
					break;
				
				case 3:/*根据判断姓名是否相等，循环修改，然后再次实例化数组对象*/
					System.out.println("修改电话本");
					System.out.println("请输入要修改的姓名：");
					Scanner sc2 = new Scanner(System.in);
					//循环
					for (int j = 0; j < index; j++) {
						//判断姓名是否相等
						if (sc2.next().equals(arr[j].name)) {
							System.out.println("添加电话本");
							System.out.println("姓名：");
							String name1 = sc.next();
							System.out.println("性别：");
							String sex1 = sc.next();
							System.out.println("年龄");
							String age1 = sc.next();
							System.out.println("电话");
							String phone1 = sc.next();
							System.out.println("QQ");
							String qq1 = sc.next();
							System.out.println("地址");
							String location1 = sc.next();
							arr[j] = new PhoneManageServer(name1,sex1,age1,phone1,qq1,location1);
							System.out.println("修改成功");
							break;
						} else {
							System.out.println("无此联系人");
						}
					}
					break;
				
				case 4:/*遍历打印所有电话本*/
					System.out.println("打印所有电话本");
					for (int j = 0; j < index; j++) {
						System.out.println(arr[j]);
					}
					break;
				
				case 5:/*根据姓名查询*/
					System.out.println("根据姓名查询");
					Scanner sc3 = new Scanner(System.in);
					for (int j = 0; j < index; j++) {
						if (sc3.next().equals(arr[j].name)) {
							System.out.println(arr[j]);
						} else {
							System.out.println("查无此人");
						}
					}
					break;
				
				default:
					System.out.println("无此功能");
					break;
					
			}
			
		}
	}
}
