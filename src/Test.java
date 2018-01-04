import java.util.Queue;

public class Test {

    public static void main(String[] args) {


        Queue <Integer> queue = ConsoleReader.createQueue(10);

        System.out.println(SummaryStringCreator.createSum(queue));


    }
}
