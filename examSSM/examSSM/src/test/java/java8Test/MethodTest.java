package java8Test;

import java.util.ArrayList;
import java.util.List;

/*方法引用通过方法的名字来指向一个方法。
方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
方法引用使用一对冒号(::)。*/
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
        
	      names.add("Apple");
	      names.add("Redis");
	      names.add("Nashorn");
	      names.add("Baidu");
	      names.add("Mail");
	        
	      names.forEach(System.out::println);
	      
	}
	
	/*1.构造器引用：它的语法是Class::new，或者更一般的Class< T >::new 注意：这个构造器没有参数。
	 * 实例如下：
	final Car car = Car.create( Car::new );
	final List< Car > cars = Arrays.asList( car );
	2.静态方法引用：它的语法是Class::static_method，实例如下：
	cars.forEach( Car::collide );
	3.特定类的任意对象的方法引用：它的语法是Class::method实例如下：
	cars.forEach( Car::repair );
	4.特定对象的方法引用：它的语法是instance::method实例如下：
	final Car police = Car.create( Car::new );
	cars.forEach( police::follow );*/

}
