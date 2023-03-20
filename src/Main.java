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
        Map<String, String> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        for(String i : result.keySet()) {
            System.out.println(i+" by "+result.get(i)+".");
        }
    }
}