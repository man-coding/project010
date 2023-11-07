package ex;

public class Ex03 {

	public static void main(String[] args) {

		Calc calc = new NewCalculator(); // Calculator -> NewCalculator 로 메소드만 바꿔주면 새로운 계산기 사용 가능

		System.out.println(calc.add(10, 5));
		System.out.println(calc.substrcact(10, 5));
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));

	}

}

class NewCalculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substrcact(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		if (num2 <= 0) {
			return Calc.ERROR;
		} else {
			return num1 * num2;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		if (num1 < num2) {
			return Calc.ERROR;
		}
		return num1 / num2;
	}

}