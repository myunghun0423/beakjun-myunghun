//백준 2557번 

public class Main { 
    public static void main(String[] args){ //Main문 작성
        System.out.println("Hello World!"); //문자 출력
    }
}


//백준 10718번

public class Main { 
    public static void main(String[] args) { //Main문 작성
    System.out.println("강한친구 대한육군");  //문자 출력 2번
    System.out.println("강한친구 대한육군");
    } 
  }
  
//백준 10171번

public class Main{
    public static void main(String[] args){
        System.out.println("\\    /\\"); //역슬래시는 문자로 인식이 되어서
        System.out.println(" )  ( ')");  // 이를 구분하려면 역슬래시 부분 뒤에 하나 더 넣어준다
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}

//백준 10172번

public class Main {
     
    public static void main(String[] args) {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\"); // 따옴표도 마찬가지로 구분해주기 위해 역슬래시를 넣었다
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }
}

//백준 1000번

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); //nextInt로 입력값을 받고
        
 
        System.out.println(a + b); //두 수를 더해서 출력해준다.
    }
}


//백준 1001번

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
 
        System.out.println(a - b); //입력값을 받고 두 수를 빼준다
    }
}

//백준 10998번

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       
         
        System.out.println(a * b); //입력값을 받고 두 수를 곱해준다
    }
}

//백준 1008번

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble(); //나눠야 하므로 int 값이 아닌 소수값인 double로 입력값을 받는다
        
         
        System.out.println(a / b); // 두수를 나눠 출력한다
    }
}

//백준 10869번

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

//백준 10430

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
        System.out.println((a % c * b % c) % c); 5와 4를 나눈값의 나머지 1 곱하기 8과 4를 나눈값의 나머지 0 = 0 을 4로 나눈 나머지 0 
    }
}

//백준 2588번

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

//백준 2739번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt(); 
    
    for(int i = 1; i < 10; i++){ // i 는 1부터 시작하고 i가 입력된 값보다 작을때 까지 돌아라
        System.out.println(a + " * " + i + " = " + (a * i)); //구구단 완성
    }
    }
}

//백준 10950번

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 

        for(int i = 0; i < a; i++){ //i 는 0부터 시작하고 입력된 값보다 작을때 까지 돌아라
            int b = sc.nextInt(); //돌아버린 값 받음
            int c = sc.nextInt();

            System.out.println(b + c); //각 돌아버린 값의 합
        }


    }
}

//백준 8393번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); 
        int b = 0; //b는 0으로 초기화
        
        for(int i = 0; i <= a; i++){ //ii는 1부터 시작하고 입력된 값보다 작을때까지 돌아라
            b = b + i; // 1부터 3까지 돌며 더한값을 출력
        }
        System.out.println(b); // 6출력 //블로그 참조 //https://st-lab.tistory.com/29
    }
}

//백준 15552번

import java.io.*;
import java.util.StringTokenizer;


public class Main{

     public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // inpustream으로 바이트 단위로 받고 BufferedReader 문자화
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //문자 스트림에서 바이트 스트림으로 변환

        int a = Integer.parseInt(br.readLine()); //5 받음

        StringTokenizer st; //문자열 쪼개주고

        for (int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine(), " "); //readLine을 이용해 스트링 값을 반환
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
           bw.flush(); //입력된 데이터 값 방출 //블로그 참조 //https://developer-mac.tistory.com/24
     }
}

//백준 2741번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a  = sc.nextInt(); 
        
        for(int i = 1; i <= a; i++){ //1부터 시작하고 입력된 값보다 작을때까지 돌아라
            System.out.println(i); 1~5 출력
        }
    }
}

//백준 2742번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); 
        
        for(int i = a; i > 0; --i){ 5부터 시작하고 i가 양수일때 까지 돌아라
            System.out.println(i); //5~1 출력
        }
    }
}

//백준 11021번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a  = sc.nextInt();
        
        for(int i = 1; i <= a; i++){ i는 1부터 시작하고 입력된 값보다 작을때 까지 돌아라
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            System.out.println("Case #" + i + ": " + (b+c)); //반복된 값 출력 //블로그 참조 //https://st-lab.tistory.com/33
            
        }
    }
}

//백준 11022번

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();

        for(int i = 1; i <= T; i++){ //i는 1부터 시작하고 i보다 t가 크거나 같을때 까지 돌아라 
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B)); 반복되서 나온 값과 a +b 합한값 출력


        }
    }
}

//백준 2438번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for(int i = 1; i <= a; i++){ //바깥쪽 for문의 인덱스(i, 아이)는 줄을 표현해줍니다
            for(int j = 1; j <= i; j++){ //안쪽 for문에서 이 인덱스를 사용하여, i 만큼 반복하면서 별을 출력합니다.
                System.out.print("*");
                
            }
            System.out.println(); // print는 println과 다르게 출력 후 개행 하지 않으므로 주의 //블로그 참조 //https://rightbellboy.tistory.com/23
            
        }
    }
}

//백준 2439번
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        for (int i = 1; i <= N; i++) { //2438 과 유사하지만 다른점은 공백을 넣어준다는점
            for (int j = 1; j <= N - i; j++) {// i 번째 줄에 공백 n - i 개, 별 n개 찍고 개행
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(); //블로그 참조 //https://rightbellboy.tistory.com/24
        }
    }
}

//백준 10871번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i < a; i++){ //반복문을 돌면서 i 가 출력
            int c = sc.nextInt();
            if(c < b){ //조건문을 걸어 c 보다 작은 자연수 출력
                System.out.print(c + " "); //블로그 참조 //https://javacoding.tistory.com/30
            }
        }
    }
}

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
                break;
            }


        }
        System.out.println(b);
    }
}



