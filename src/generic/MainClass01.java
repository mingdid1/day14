package generic;

import java.util.ArrayList;

/*
 	generic
 	- 유동적으로 자료형을 부여해 사용할 수 있다
 	- wrapper 자료형으로 부여해야한다
 	
 	wrapper
 	- int : Integer, double : Double, char : Character ..
 	- boolean, byte, char, short, int, long, float, double
 	
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num = 100;
		Integer num2 = 200;
		num = num2;
		
		double do1 = 1.123;
		Double do2 = 2.345;
		
		ArrayList<Double> arr;
		// <E> 클래스형의 자료형으로만 넣어줘야함
	}
	
}
