package ex;

public class Quiz01 {

	public static void main(String[] args) {

		Calc calc = new Calculator();

		if (calc instanceof Calculator) { // 인스턴스의 타입이 Calculator
			Calculator calculator = (Calculator) calc;
			calculator.showInfo();

			System.out.println(calculator.add(3, 4));

		}
	}

}
