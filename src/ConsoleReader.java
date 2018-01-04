import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConsoleReader {

    public static Queue<Integer> createQueue (int size){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0 ; i < size ; i++){
            System.out.println("Podaj liczbe: ");
            queue.add(sc.nextInt());

        }
        return queue;

    }
}
