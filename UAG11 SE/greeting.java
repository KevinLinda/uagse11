import java.util.Scanner;

public class greeting{
    public static void main(String [ ] args){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name ? : ");
        String name = in.nextLine();
        System.out.print("Nice to meet you , " + name );
    }
}