package ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		DBDriver dbDriver = null;

		if (num == 1) {
			dbDriver = new MySqlDBDriver();
		} else if (num == 2) {
			dbDriver = new OracleDBDriver();
		} else if (num == 3) {
			dbDriver = new PostgresDBDriver();
		} else {
			System.out.println("기능이 없습니다.");
		}
		if (dbDriver != null) {

		}
	}

}

class MySqlDBDriver implements DBDriver {

	public void dbConnect() {
		System.out.println("MySql DB에 연결합니다.");
	}

}

class OracleDBDriver implements DBDriver {

	public void dbConnect() {
		System.out.println("Oracle DB에 연결합니다.");
	}

}

class PostgresDBDriver implements DBDriver {

	public void dbConnect() {
		System.out.println("Postgres DB에 연결합니다.");

	}

}