package generic;

import java.util.ArrayList;

class Test03< T >{
	
	public void sumFunc(T n1, T n2) {
		System.out.println(n1 + ", " + n2);
	}

}

public class MainClass03 {
	public static void main(String[] args) {
		
		Test03<Integer> t = new Test03();
		t.sumFunc(100, 200);

		Test03<String> t1 = new Test03();
		t1.sumFunc("aaa", "bbb");
		
		ArrayList arr = new ArrayList<>();
		arr.add(1000);
		arr.add("aaa");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		int n = (int)arr.get(0);
		
	}
}

