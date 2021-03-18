import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); //입력값 5,8,4 받고
        int c = sc.nextInt();
        sc.close();
 
        System.out.println((a + b) % c); //5와8을 더하고 4로 나눈값의 나머지 1
        System.out.println((a % c + b % c) % c); // 5와 4를 나눈값의 나머지 1 더하기 8을 4로 나눈 나머지 0 = 1 을 4로 나눈 값의 나머지 1
        System.out.println((a * b) % c); //5와8을 곱한값 40 나누기 4의 나머지 0
        System.out.println((a % c * b % c) % c); //5와 4를 나눈값의 나머지 1 곱하기 8과 4를 나눈값의 나머지 0 = 0 을 4로 나눈 나머지 0 
    }
}
