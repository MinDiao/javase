package com.tel.view;

import java.util.List;
import java.util.Scanner;

import com.tel.po.Person;
import com.tel.service.PersonService;

/*
 * 从service层中取出数据绑定到页面层
 */
public class PersonView {

	static PersonService service = new PersonService();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println("------------------电话本管理系统-------------------");
			System.out.println("1.添加\t2.删除\t3.修改\t4.查询所有\t5.根据姓名查询\t0.退出");
			System.out.println("------------------电话本管理系统-------------------");
			System.out.println("请选择业务：");
			int result = sc.nextInt();
			switch (result) {
			case 0:
				//退出
				System.out.println("退出成功");
				sc.close();
				System.exit(0);
				break;
			case 1:
				//添加
				add();
				break;
			case 2:
				//删除
				delete();
				break;
			case 3:
				//修改
				update();
				break;
			case 4:
				//查询所有
				select();
				break;
			case 5:
				//根据姓名查询
				selectName();
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
		System.out.println("------------------查询界面-------------------");
		List<Person> list = service.getPersonAll();
		//遍历全部
		for (Person per : list) {
			System.out.println(per);
		}
	}
	
	/*按指定姓名查询电话本*/
	public static void selectName() {
		System.out.println("------------------按姓名查询电话本-------------------");
		System.out.println("请输入要查询的姓名：");
		String selectName = sc.next();
		/*判断联系人是否存在*/
		List<Person> list = service.getPersonNameDao(selectName);
		if (list == null) {
			System.out.println("当前联系人不存在");
		}
		//存在则遍历指定用户
		for (Person per : list) {
			System.out.println(per);
		}
	}

	/*添加电话本*/
	public static void add() {
		System.out.println("------------------添加电话本-------------------");
		// 获取控制台输入
		System.out.println("姓名：");
		String name = sc.next();
		System.out.println("性别：");
		String sex = sc.next();
		System.out.println("年龄：");
		int age = sc.nextInt();
		System.out.println("QQ:");
		String qq = sc.next();
		System.out.println("电话：");
		String tel = sc.next();
		System.out.println("地址：");
		String dir = sc.next();
		Person per = new Person(name, sex, age, tel, qq, dir);
		if (service.addPersonDao(per) > 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
	
	/*修改电话本*/
	public static void update() {
		System.out.println("------------------修改电话本-------------------");
		System.out.println("请输入要修改的姓名：");
		String updateName = sc.next();
		//判断联系人是否存在
		List<Person> list = service.getPersonNameDao(updateName);
		//不存在
		if(list==null){
			System.out.println("无信息！");
		}else{
			//存在则遍历指定用户
			for (Person p : list) {
				System.out.println(p);
			}
			Person per = new Person();
			System.out.println("请重新输入信息：");
			System.out.println("姓名：");
			per.setTname(sc.next());
			System.out.println("性别：");
			per.setTsex(sc.next());
			System.out.println("年龄：");
			per.setTage(sc.nextInt());
			System.out.println("QQ:");
			per.setTqq(sc.next());
			System.out.println("电话：");
			per.setTtel(sc.next());
			System.out.println("地址：");
			per.setTaddr(sc.next());
			//判断是否执行成功
			if (service.updatePersonDao(per,updateName) > 0) {
				System.out.println("修改成功");
			} else {
				System.out.println("修改失败");
			}
		}
		
	}
	
	/*删除电话本*/
	public static void delete() {
		System.out.println("------------------删除电话本-------------------");
		System.out.println("请输入要删除人的姓名：");
		String delName = sc.next();
		// 先查询要删除的人是否存在
		List<Person> list = service.getPersonNameDao(delName);
		if(list==null){
			System.out.println("无此联系人信息！");
		}
		//存在则遍历指定用户
		for (Person p : list) {
			System.out.println(p);
		}
		System.out.println("确定要删除吗？1(是)0(否)");
		int input = sc.nextInt();
		if(input == 1){
			service.deletePersonDao(delName);
			System.out.println("删除成功！");
		}
	}

}
