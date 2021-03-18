import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt(); 입력값 받고 2000, 1999
        
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){ //4로 나눈값의 나머지가 0과 같고 100으로 나눈값의 나머지가 0과 같지않거나 혹은 400으로 나눈값의 나머지가 0과 같으면
            System.out.println("1"); //1을 출력해라
        }else
            System.out.println("0"); //아니면 0을 출력해라 //블로그 참조함 //https://st-lab.tistory.com/23
    }
}
