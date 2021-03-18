import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //472
        int n2 = sc.nextInt(); //385
        
        System.out.println(n1 * (n2 % 10)); // 385를 10으로 나눈값의 나머지 5 곱하기 472 = 2360
        System.out.println(n1 * ((n2 % 100) / 10)); //385를 100으로 나눈값의 나머지 85 나누기 10 = 8 곱하기 472 = 3776
        System.out.println(n1 * (n2 / 100)); // 1416
        System.out.println(n1 * n2); //181720
    }
}
