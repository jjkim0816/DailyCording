import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        
        int[] numberList = new int[count];
        for (int i = 0; i < count; i++) {
            numberList[i] = sc.nextInt();
        }
        sc.close();
        
        numberList = IntStream.of(numberList).sorted().toArray();
        System.out.println(numberList[0] + " " + numberList[numberList.length - 1]);
    }
}