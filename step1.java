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
