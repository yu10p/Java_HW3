package hw3;

public class p06 {
	public static void main(String[] args) {
		//宣告car1型態為class Car
		Car car1;
		//建立class Car給car1
		car1 = new Car();
		
		//給定car1的屬性初值
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}
}
/*
//建立class Car
class Car{
	//class Car的屬性
	int num;
	double gas;
}
*/
