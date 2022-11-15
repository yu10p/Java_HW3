package hw3;

public class p14 {
	public static void main(String[] args) {
		//宣告car1型態為class Car
		Car car1;
		//建立class Car給car1
		car1 = new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}

/*
//建立class Car
class Car{
	//class Car的屬性
	int num;
	double gas;
	
	void setNum(int n) {
		num = n;
		System.out.println("將車號設為"+num);
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("將汽油量設為:"+gas);
	}
}
*/