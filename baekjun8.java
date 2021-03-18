import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble(); //나눠야 하므로 int 값이 아닌 소수값인 double로 입력값을 받는다
        
         
        System.out.println(a / b); // 두수를 나눠 출력한다
    }
}
