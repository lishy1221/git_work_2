package java8Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//old--采用内部匿名类进行
		List<String> names = Arrays.asList("mark", "anna", "mike", "lisa");
		Collections.sort(names, new Comparator<String>() {
		    public int compare(String a, String b) {
		        return a.compareTo(b);
		    }
		});
		for (String name : names) {
			System.out.println(name);
		}
		
		//使用lambda表达式
		//方式一
		Collections.sort(names, (String a, String b) -> {return a.compareTo(b);});
		//方式二
		Collections.sort(names, (String a, String b) -> a.compareTo(b));
		//方式三
		Collections.sort(names,(a,b)->a.compareTo(b));
		
		
		System.out.println(names);		
		//names.forEach(System.out::println);
		

				
		

	}

}
