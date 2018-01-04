import java.util.Queue;

public class SummaryStringCreator {

    public static String createSum (Queue<Integer> queue){
        String result = "";
        long sum = 0;

        while(!queue.isEmpty()){

        result+=" + "+queue.peek();
        sum+= queue.poll();


        }
        result = result.substring(2) + " = "+sum;


    return result;
    }
}
