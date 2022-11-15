package hw3;

public class p09 {
	public static void main(String[] args) {
		//宣告car1型態為class Car
		Car car1;
		//建立class Car給car1
		car1 = new Car();
				
		//給定car1的屬性初值
		car1.num = 1234;
		car1.gas = 20.5;
	}
}
/*
//建立class Car
class Car{
	//class Car的屬性
	int num;
	double gas;
	
	//定義class Car的method
	void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油輛是"+this.gas);
	}
}
*/