import java.util.Scanner;

/**
 * Created by derek on 10/10/16.
 */
public class Driver {
    public static void main(String args[]){
        //Create map
        HashMapping map = new HashMapping();
        System.out.println("Please enter text: ");

        Scanner scanner = new Scanner(System.in);

        map.MapString(scanner.nextLine());
        System.out.println(map.toString());
    }
}
