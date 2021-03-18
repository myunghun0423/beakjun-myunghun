import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt(); //100 값을 받음
        
         
        if (score >= 90) {
            System.out.println('A'); //100보다 작고 90보다 크거나 같으면 A
        } else if (score >= 80) {
            System.out.println('B'); //100보다 작고 80보다 크거나 같으면 B
        } else if (score >= 70) {
            System.out.println('C'); //100보다 작고 70보다 크거나 같으면 C
        } else if (score >= 60) {
            System.out.println('D'); //100보다 작고 60보다 크거나 같으면 D
        } else {
            System.out.println('F'); //그 외 점수는 F
        }
    }
}
