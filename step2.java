//백준 1330

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

//백준 9498번

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

//백준 2753번

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

//백준 14681번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); 각각 12,5 , 9,-13 받음
        int y = sc.nextInt();
        
        if(x > 0 && y > 0){
            System.out.println("1"); //x가 양수이고 y가 양수일때 1출력
        }else if(x < 0 && y > 0){ //x가 음수이고 y가 양수일때 2출력
            System.out.println("2");
        }else if(x < 0 && y < 0){// x가 음수이고 y가 음수일때 3출력
            System.out.println("3");
        }else{
            System.out.println("4"); //그외에는 4출력
        }
        
        
 
        
    }
}

//백준 2884번

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(); //각각 10 10, 0 30, 23 40 받음 
        int m = sc.nextInt();

        if(m >= 45){
            System.out.println(h + " " + (m - 45)); //분이 45보다 크거나 같을때 시간과 분에서 45를 빼라

        }else{
            if(h == 0){ //시간이 0과 같을때 시간은 24로 하고
                h = 24;

            }
            System.out.println(h - 1 + " " + (m + 15)); //시간에서 1을 뺀값에 분을 15 더해라
        }

    }
}
