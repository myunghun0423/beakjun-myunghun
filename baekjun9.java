import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); //입력값으로 7, 3을 받고
        
 
        System.out.println(a + b); // 더한 값 10
        System.out.println(a - b); // 뺀값 4
        System.out.println(a * b); // 곱한값 21
        System.out.println(a / b); // 나눈 값 2
        System.out.println(a % b); //나머지값 1
    }
}
