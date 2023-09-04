package org.studyeasy;

interface Lamda{
	abstract public int demo();
	
}

public class App {
	public static void main(String[] args) {
		Lamda lamda = ()->{
		    System.out.println("Statement 1");	
			return 10;
		};
			
		System.out.println(lamda.demo());
	
		
	}

}
