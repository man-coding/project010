package ex;

//계산기 인터페이스 만들기.
public interface Calc {

	int ERROR = -9999;

	int add(int num1, int num2);

	int substrcact(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

}
