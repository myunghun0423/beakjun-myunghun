// 백준 11654번

public class Main{
    public static void main(String[] args)throws Exception{ //스캐너를 쓰지 않을 경우 반드시 예외 처리를 해주어야 한다
        
        int a = System.in.read();

        System.out.print(a);//System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다
    }
}

//백준 11720번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //먼저 숫자 개수인 N을 입력받는다
        String a = sc.next(); //숫자를 정수가 아닌 문자열로 입력을 받는다.

        int sum = 0;

        for(int i = 0; i < N; i++){ // for문을 통해 입력받은 문자열의 첫번째 원소 charAt(0) 부터 마지막 원소 charAt(N) 까지 각 원소의 누적 합을 구하면 된다
            sum += a.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}

//백준 10809번

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[26]; // int형 배열 하나 생성하여 모두 -1로 초기화

        for(int i = 0; i < array.length; i++){
            array[i] = -1;
        }
        String st = br.readLine(); // st라는 문자열이 주어짐

        for(int i = 0; i < st.length(); i++){ //반복문을 통해 각문자 검사 charAt() 메소드를 사용하여 문자를 추출한뒤 ch 라는 변수에 저장
            char ch = st.charAt(i);

            if(array[ch - 'a'] == -1){ //array 원소값이 -1 인 경우 초기화
                array[ch - 'a'] = i;
            }
        }
        for(int val : array){
            System.out.print(val + " ");
        }
    }
}

//백준 2675번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int R = sc.nextInt();
            String S = sc.next();

            for(int j = 0; j < S.length(); j++){
                for(int k = 0; k < R; k++){
                    System.out.print(S.charAt(j));

                }
            }
            System.out.println();
        }
    }
}

// 백준 1157번

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       int[] array = new int[26]; //알파벳의 개수는 26자
       String st = sc.next();

       for(int i = 0; i < st.length(); i++){
           if('A' <= st.charAt(i) && st.charAt(i) <= 'Z'){ //대문자 범위 지정
               array[st.charAt(i) - 'A']++; //해당 인덱스의 값 증가
           }else{//소문자 범위
               array[st.charAt(i) - 'a']++;
           }
       }
       int max = -1;
       char ch = '?';

       for(int i = 0; i < 26; i++){
           if(array[i] > max){
               max = array[i];
               ch = (char)(i + 65); //대문자로 출력해야 하므로 65(아스키코드)를 더해준다
           }else if(array[i] == max){
               ch = '?';
           }
       }
       System.out.print(ch);
    }
}

//백준 1152번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        
        // st에 공백을 기준으로 나눈 토큰들을 st 에 저장한다 
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // countTokens는 토큰의 개수를 반환한다
        System.out.print(st.countTokens());

    }
}

//백준 2908번


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.print(a > b ? a:b);
    }
}
// 백준 5622번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        
        int count = 0;
        int k = st.length();

        for(int i = 0; i < st.length(); i++){
            switch(st.charAt(i)){
                case 'A' : case 'B' : case 'C': //가장 첫 문자는 A 이므로 같은 대열에 있는 A, B, C 는 2 부터 시작하기 때문에 3초가 걸린다
                    count += 3;
                    break;
                case 'D' : case 'E' : case 'F': // 한칸 옆에있는 숫자를 걸기위해선 1초씩 더 걸린다고 했으므로 +1 씩 카운트 해준다
                    count += 4;
                    break;
                case 'G' : case 'H' : case 'I':
                    count += 5;
                    break;
                case 'J' : case 'K' : case 'L':
                    count += 6;
                    break;
                case 'M' : case 'N' : case 'O':
                    count += 7;
                    break;
                case 'P' : case 'Q' : case 'R': case  'S' :
                    count += 8;
                    break;
                case 'T' : case 'U' : case 'V':
                    count += 9;
                    break;
                case 'W' : case 'X' : case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }  
            
        }
        System.out.print(count);
    }
}

// 백준 2941번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int length = st.length();
        int count = 0;

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);

            if(ch == 'c' && i < length -1){ //ch 가 c 일 경우
                if(st.charAt(i + 1) == '=' || st.charAt(i + 1) == '-'){
                    i++; // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                }
            }else if(ch == 'd' && i < length -1){ //d 일 경우
                if(st.charAt(i + 1) == '-'){
                    i++;

                }else if(st.charAt(i + 1) == 'z' && i < length -2){
                    if(st.charAt(i + 2) == '='){ //dz= 일경우
                        i += 2;
                    }

                }
            }else if((ch == 'l' || ch == 'n') && i < length -1){
                if(st.charAt(i + 1) == 'j'){ //lj 또는 nj 일 경우
                    i++;

                }
            }else if ((ch == 's' || ch == 'z') && i < length -1){
                if(st.charAt(i + 1) == '='){ // s= 또는 z= 일 경우
                    i++;
                }
            }
            count++;

        }
        System.out.println(count);
    }
}

//백준 1316번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws IOException {

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            if(check() == true){
                count++;
            }
        }System.out.println(count);

    }
    public static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String st = br.readLine();

        for(int i = 0; i < st.length(); i++){
            int now = st.charAt(i); //i 번째 문자 저장(현재문자)
            
            //앞의 문자와 i 번째 문자가 같지 않으면
            if(prev != now){
                // 해당 문자가 처음 나오는 경우
                if(check[now - 'a'] == false){
                    check[now - 'a'] = true; //true로 바꿔준다
                    prev = now; //다음턴을 위해 prev 도 바꿔준다
                }else{
                    return false; //함수 종료
                    
                }
                //앞선 문자와 i 번째 문자가 같으면
                //else문은 없어도 좋다
            }else{
                continue;
            }
            
        }return true;
    } 
    
}
