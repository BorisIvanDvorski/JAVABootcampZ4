import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite books and authors. Enter 'stop' to finish.");
        Map<String,String> map = new HashMap<>();
        while(true){
            System.out.print("Book title: ");
            String key = input.next();
            if(key.equals("stop")){
               break;
            }
            else{
                System.out.print("Author name: ");
                String value = input.next();
                map.put(key,value);
            }
        }
        for(String i : map.keySet()) {
            System.out.println(i+" by "+map.get(i));
        }
    }
}