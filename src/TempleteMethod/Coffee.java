package TempleteMethod;
import java.util.Scanner;

public class Coffee extends Beverage {
    public void add(){
        System.out.println("커피 추가");
    }

    public boolean wantCondiments(){
        String answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        scanner.close();

        if(answer.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }
}
