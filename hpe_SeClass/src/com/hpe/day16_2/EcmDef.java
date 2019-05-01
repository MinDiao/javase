package com.hpe.day16_2;
/*
*	编写应用程序EcmDef.java，接收命令行的两个参数，要求不能输入负
	数，计算两数相除。
	对缺少命令行参数(ArrayIndexOutOfBoundsException)、
	除0(ArithmeticException)及输入负数(EcDef 自定义的异常)进行异
	常处理。
	? 提示：
	(1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
	(2)在main()方法中使用异常处理语句进行异常处理。
	(3)在程序中，自定义对应输入负数的异常类(EcDef)。
	(4)运行时接受参数 java EcmDef 20 10
	//args[0]=“20” args[1]=“10”
	(5)Interger类的static方法parseInt(String s)将s转换成对应的int值。
	如int a=Interger.parseInt(“314”); //a=314;
 */
public class EcmDef {
	
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			if (num1 < 0 || num2 < 0) {
				throw new EcDef();
			}
			System.out.println(num1 / num2);
		} catch (EcDef e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
