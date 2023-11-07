package ex;

public class Ex01 {

	public static void main(String[] args) {

		// Calc calc = new Calc(); // 인터페이스는 미완성 상태이기 때문에 인스턴스를 만들 수 없다.(feat.추상클래스)

		Calculator calculator = new Calculator();
//		//Calc calc = new Calculator();  -> 메소드 4개만 쓸 땐 부모타입으로 해도 무관.
//		System.out.println(calc.add(2, 3));

		System.out.println(calculator.add(10, 5));
		System.out.println(calculator.substrcact(10, 5));
		System.out.println(calculator.times(10, 5));
		System.out.println(calculator.divide(10, 5));
		calculator.showInfo();
	}

}

class Calculator implements Calc { // 인터페이스 상속받기 ( implements

	@Override
	public int add(int num1, int num2) { // 물려받은 추상 메소드 구현하기
		return num1 + num2;
	}

	@Override
	public int substrcact(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	public void showInfo() {
		System.out.println("Cal 인터페이스를 구현하였습니다.");
	}

}