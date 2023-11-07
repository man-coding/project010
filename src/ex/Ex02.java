package ex;

public class Ex02 {

	public static void main(String[] args) {

		Calc calc = new Calculator(); // 부모타입으로 변수를 형변환시킴

		calc.add(2, 3);
//		calc.showInfo(); // 에러. 자식의 기능임
	}

}
