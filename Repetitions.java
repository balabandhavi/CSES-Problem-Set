import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Repetitions{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        char current=str.charAt(0);

        PriorityQueue<Integer> pq=new PriorityQueue<>( Collections.reverseOrder());

        int count=1;

        for(int i=1;i<str.length();++i){

            if(current!=str.charAt(i)){
                pq.add(count);
                current=str.charAt(i);
                count=1;
                continue;
            }

            ++count;
        }

        if(!pq.isEmpty()) count=Math.max(count,pq.peek());

        System.out.println(count);

        sc.close();
    }
}