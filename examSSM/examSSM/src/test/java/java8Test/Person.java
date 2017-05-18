package java8Test;

import java.util.Comparator;

public class Person {
	public String name;
	public String location;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString(){
		return "Person name is"+name+";location"+location;
	}
	
	//使用String默认的排序规则，比较的是Person的name字段
	Comparator<Person> byName = Comparator.comparing(p -> p.getName());
	//不用写传入参数,传入的用Person来声明
	Comparator<Person> byName2 = Comparator.comparing(Person::getName);

}
