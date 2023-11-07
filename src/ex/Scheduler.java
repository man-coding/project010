package ex;

public interface Scheduler {

	public void getNextCall(); // 다음 전화를 가져오는 메소드 인터페이스에는 상수와 추상메소드만 있어야 한다.->abstract 생략 가능

	public void sendCallToAgent(); // 상담원에게 전화를 배분하는 메소드
}