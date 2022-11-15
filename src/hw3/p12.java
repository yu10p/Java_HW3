package hw3;

public class p12 {
	public static void main(String[] args) {
		//宣告car1型態為class Car
		Car car1;
		//建立class Car給car1
		car1 = new Car();
								
		//給定car1的屬性初值
		car1.num = 1234;
		car1.gas = 20.5;
				
		//使用class car1的method
		car1.showCar();
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
		System.out.println("車號是"+num);
		System.out.println("汽油輛是"+gas);
	}
	
	void showCar() {
		System.out.println("開始顯示車子資料");
		//在class內使用自有的method
		show();
	}
}
*/