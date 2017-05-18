package java8Test;

/*简单说，默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。
我们只需在方法名前面加个default关键字即可实现默认方法。*/
public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Car();
		vehicle.print();

	}

}

interface Vehicle{
	default void print(){
		System.out.println("我是一辆车");
	}
	
	static void blowHorn(){//静态方法
		System.out.println("按喇叭！！");
	}
}

interface FourWheeler{
	default void print(){
		System.out.println("我是一辆四轮车");
	}
}

class Car implements Vehicle,FourWheeler{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		FourWheeler.super.print();
		Vehicle.super.print();
		Vehicle.blowHorn();
		System.out.println("我是一辆汽车！！");
	}
	
}
