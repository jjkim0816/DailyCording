import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int removeK = sc.nextInt();
        sc.close();
        
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i = 1; i <= number; i++) {
            list.add(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        int index = 0;
        while(list.size() > 1) {
            index = (index + (removeK - 1)) % list.size();
            sb.append(list.remove(index)).append(", ");
        }
        
        sb.append(list.remove()).append(">");
        System.out.println(sb);
    }
}