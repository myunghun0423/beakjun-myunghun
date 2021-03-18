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
