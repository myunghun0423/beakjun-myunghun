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
