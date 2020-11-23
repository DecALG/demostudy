package test_1122;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Simulator sim=new Simulator();
		System.out.println("请输入动物个数：");
		int k=sc.nextInt();
		Animal animal[]=new Animal[k];
		
		for(int i=0;i<animal.length;i++) {
			System.out.println("请输入动物类型：1--Dog 2--Cat");
			int t=sc.nextInt();
			if(t==1) {
				System.out.println("请输入Dog的名字：");
				String name=sc.next();
				animal[i]=new Dog(name);
				
			}else if(t==2) {
				System.out.println("请输入Cat的名字：");
				String name=sc.next();
				animal[i]=new Cat(name);
				
			}else {
				System.out.println("无此类型！");
				i--;
			}
		}
		
		for(int i=0;i<animal.length;i++) {
			sim.playSimulator(animal[i]);
		}
	}

}
