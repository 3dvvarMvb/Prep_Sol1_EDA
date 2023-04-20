import java.io.*;
import java.util.*;

public class Ejercicio1 {
    public static void Ordenamiento(int[] A, int n){
        if(n==1){
            if(A[n]>A[n-1]){
                int temp=A[n];
                A[n]=A[n-1];
                A[n-1]=temp;
            }
            return;
        }
        if(n%2!=0){
            if(A[n]>A[n-1]){
                int temp=A[n];
                A[n]=A[n-1];
                A[n-1]=temp;
            }
        }
        else{
            if(A[n]<A[n-1]){
                int temp=A[n];
                A[n]=A[n-1];
                A[n-1]=temp;
            }
        }
        Ordenamiento(A,(n-1));
    }
    public static void PrintArray(int[] A,int indice){
        if(indice==A.length){
            return;
        }
        System.out.print(A[indice]+" ");
        PrintArray(A,indice+1);
    }

    public static void main(String[] args){
        int [] Array=new int[]{12, 4, 6, 4, 2, 22, 30, 25};
        int N= Array.length-1;
        Ordenamiento(Array,N);
        PrintArray(Array,0);
    }
}
