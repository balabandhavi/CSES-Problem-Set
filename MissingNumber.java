import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        long[] arr=new long[n];

        long sum=0;

        for(int i=0;i<n-1;++i) {
            arr[i]=(long) sc.nextInt();
            sum+=arr[i];
        }

        long totalSum=(long) n*(n+1)/2;

        long missingNumber= (totalSum-sum);

        System.out.println(missingNumber);

        sc.close();

    }
}