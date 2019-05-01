/**
 * 
 */
package com.company.view;

import java.util.List;
import java.util.Scanner;

import com.company.po.Company;
import com.company.service.impl.CompanyService;

/** 
 * 	类描述：表示层
 * 	作者： LiuJinrong 
 * 	创建日期：2018年11月4日
 * 	修改人：
 * 	修改日期：
 * 	修改内容：
 * 	版本号： 1.0.0   
 */
public class CompanyView {

	/** 
	 * 	方法描述：主方法
	 * 	@param args
	 */

	static CompanyService service = new CompanyService();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("------------------员工管理系统-------------------");
			System.out.println("1.添加\t2.删除\t3.修改\t4.查询所有\t5.根据姓名查询\t0.退出");
			System.out.println("------------------员工管理系统-------------------");
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

	/*查询所有员工*/
	public static void select() {
		
		System.out.println("------------------查询界面-------------------");
		List<Company> list = service.selectAll();
		//遍历全部
		for (Company per : list) {
			System.out.println(per);
		}
		
	}
	
	/*按指定姓名查询员工*/
	public static void selectName() {
		
		System.out.println("------------------按姓名查询-------------------");
		System.out.println("请输入要查询的姓名：");
		String selectName = sc.next();
		/*判断联系人是否存在*/
		Company company = service.selectName(selectName);
		if (company == null) {
			System.out.println("当前联系人不存在");
		}
		//存在则输出指定用户
		System.out.println(company);
		
	}

	/*添加员工*/
	public static void add() {
		
		System.out.println("------------------添加-------------------");
		// 获取控制台输入
		System.out.println("员工id:");
		int id = sc.nextInt();
		System.out.println("员工姓名：");
		String name = sc.next();
		System.out.println("部门id：(1.管理部),(2.销售部),(3.技术部),(4.运营部),(5.宣传部)");
		int deptid = sc.nextInt();
		System.out.println("入职日期:");
		String date = sc.next();
		System.out.println("员工电话：");
		String tel = sc.next();
		Company company = new Company(id, name, deptid, date, tel);
		if (service.add(company) > 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
		
	}
	
	/*根据员工姓名修改员工*/
	public static void update() {
		System.out.println("------------------修改-------------------");
		System.out.println("请输入要修改的姓名：");
		String updateName = sc.next();
		//判断联系人是否存在
		Company companySelect = service.selectName(updateName);
		//不存在
		if(companySelect==null){
			System.out.println("无信息！");
		}else{
			//存在则输出指定用户
			System.out.println(companySelect);
			//实例化实体类
			Company company = new Company();
			
			System.out.println("请重新输入信息：");
			System.out.println("员工id:");
			company.setEmpID(sc.nextInt());
			System.out.println("员工姓名：");
			company.setEmpName(sc.next());
			System.out.println("部门id：(1.管理部),(2.销售部),(3.技术部),(4.运营部),(5.宣传部)");
			company.setDeptId(sc.nextInt());
			System.out.println("入职日期:");
			company.setEmpBirthday(sc.next());
			System.out.println("员工电话：");
			company.setEmpphone(sc.next());
			//判断是否执行成功
			if (service.update(company, updateName) > 0) {
				System.out.println("修改成功");
			} else {
				System.out.println("修改失败");
			}
		}
		
	}
	
	/*根据员工姓名删除员工*/
	public static void delete() {
		System.out.println("------------------删除-------------------");
		System.out.println("请输入要删除人的姓名：");
		String delName = sc.next();
		// 先查询要删除的人是否存在
		Company company = service.selectName(delName);
		if(company==null){
			System.out.println("无此人信息！");
		}
		//存在则遍历指定用户
		System.out.println(company);
		
		System.out.println("确定要删除吗？1(是)0(否)");
		int input = sc.nextInt();
		if(input == 1){
			service.delete(delName);
			System.out.println("删除成功！");
		}
	}

}



