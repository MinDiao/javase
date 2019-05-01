package com.zw.view;

import java.util.List;
import java.util.Scanner;

import com.zw.po.Student;
import com.zw.service.StudentService;

/*
 * 	从service层中取出数据绑定到页面层
 */
public class StudentView {
	
	static StudentService service = new StudentService();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println("-----------学生管理系统---------");
			System.out.println("1.查询所有 2.添加 3.修改 4.删除 5.退出");
			System.out.println("请选择:");
			int result = sc.nextInt();
			switch (result) {
			case 1:
				//查询所有
				select();
				break;
			case 2:
				//添加
				break;
			case 3:
				//修改
				break;
			case 4:
				//删除
				break;
			case 5:
				//退出
				System.out.println("退出成功");
				System.exit(0);
				break;
			default:
				//输入有误
				System.out.println("输入有误");
				break;
			}
		}
	}
	
	/*查询所有用户*/
	public static void select() {
		System.out.println("------------查询界面-----------");
		List<Student> list = service.getStudentAll();
		for (Student stu : list) {
			System.out.println(stu);
		}
	}
	
}
