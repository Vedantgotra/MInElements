import java.util.Scanner;

//Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
//
//
//
//        Example 1:
//
//        Input:
//        N = 6
//        A[] = {3, 2, 1, 56, 10000, 167}
//        Output:
//        min = 1, max =  10000
public class MInElements {
    public static void main(String[] args) {
        int N,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        N=sc.nextInt();
        int[] A= new int[N];
        for(i=0;i<N;i++){
            A[i]=sc.nextInt();

        }
        int max=A[0];
        int min=A[0];
        for(i=0;i<N;i++) {
            if (max > A[i])
                max = A[i];

            if(min<A[i])
                min=A[i];
        }
        System.out.println("min " + min + " max " + max);
        }
    }

