import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string:");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list1 = new LinkedList<>();
            list1.add(string.charAt(i));
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(j) > list1.getLast() ){
                    list1.add(string.charAt(j));
                }
            }
            if (list1.size() > max.size()){
                max.clear();
                max.addAll(list1);
            }
            list1.clear();
        }
        for (Character character: max){
            System.out.print(character);
        }
        System.out.println();
    }
}
