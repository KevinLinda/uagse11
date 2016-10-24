import java.util.Scanner;

public class getNumbers{
    public static void main(String [ ] args){
        result = "";
        s = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number(exit to quit) :");
        int number = in.nextint();
        while (number(!(.equals "exit"))){
            System.out.print("Enter a number(exit to quit) :");
        }
        result = result + number;
        System.out.print(result);
    }
}