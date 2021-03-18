//백준 10952번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
      
        
        while(true){ //while문 무한반복
        int a = sc.nextInt();
        int b = sc.nextInt();
            if(a == 0 && b ==0){ //입력된 값이 0과 같으면
                break; //반복문 중단
            }
            System.out.println(a+b); //더한값을 출력
        }
    }
}

//백준 10951번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){ //while문으로 돌리고 hasnextint로 입력값 대기 hasnextint가 거짓일 경우 반복문 종료
        
        int a = sc.nextInt();  //블로그 참조 //https://javacoding.tistory.com/81
        int b = sc.nextInt();
        
        System.out.println(a+b);
        }
    }
}

//백준 1110번
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0; //반복문이 몇 번 반복되었는지 세어주는 변수 
        int c = a; //처음 입력값을 복사한 변수

        while (true) { //무한 반복문
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            b++; //while문 돌릴때마다 초기화한 값 증가

            if (c == a) { //처음 입력값과 개로운 변수가 같으면 반복문 종료
                break; //블로그 참조
            }


        }
        System.out.println(b);
    }
}
