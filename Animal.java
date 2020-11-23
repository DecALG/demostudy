package test_1122;

public abstract class Animal {
	private String name;
	
	Animal(String name){
		this.name=name;
	}
	 abstract void cry();
	 
	 String getName() {
		 return name;
	 }

}
