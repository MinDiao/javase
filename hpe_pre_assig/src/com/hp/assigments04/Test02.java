package com.hp.assigments04;

public class Test02{
	public static void main(String[] args){
		int[] a={6,1,8,2,5,3,6};
		int temp=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int sum = 0;
		for(int i=0;i<a.length;i++){
			a[i] += 5;
			
			//System.out.print(a[i] +",");
			sum += a[i];
			
		}
		int sum2 = sum % 10;
		System.out.print(sum2);
	}
}