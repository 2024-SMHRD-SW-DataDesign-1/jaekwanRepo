import java.nio.file.spi.FileSystemProvider;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("팀장 첫번째 커밋");
		System.out.println("팀원1 두번째 커밋");
		System.out.println("팀원2 세번째 커밋");
		System.out.println("아현: 4번째 커밋");
		System.out.println("팀장 다섯번째 커밋");
		int i = 6;
		System.out.println("팀원1" + i++ + "번째 커밋");
		System.out.println("팀원2" + i++ + "번째 커밋");
	}

}
