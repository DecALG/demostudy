package test_1122;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Simulator sim=new Simulator();
		System.out.println("�����붯�������");
		int k=sc.nextInt();
		Animal animal[]=new Animal[k];
		
		for(int i=0;i<animal.length;i++) {
			System.out.println("�����붯�����ͣ�1--Dog 2--Cat");
			int t=sc.nextInt();
			if(t==1) {
				System.out.println("������Dog�����֣�");
				String name=sc.next();
				animal[i]=new Dog(name);
				
			}else if(t==2) {
				System.out.println("������Cat�����֣�");
				String name=sc.next();
				animal[i]=new Cat(name);
				
			}else {
				System.out.println("�޴����ͣ�");
				i--;
			}
		}
		
		for(int i=0;i<animal.length;i++) {
			sim.playSimulator(animal[i]);
		}
	}

}
