import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int A = sc.nextInt(); //각각 1,2 , 10,2 , 5,5 받음
		 int B = sc.nextInt();
		
		if(A>B) 
			System.out.println(">"); //각 비교결과에 맞게 부호 출력 조건문 작성
		else if(A<B)
			System.out.println("<");
		else
			System.out.println("==");
	}
}
