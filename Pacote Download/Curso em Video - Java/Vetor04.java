import java.util.Arrays;
public class Vetor04{
    public static void main(String[] args){
        int vet[] = {3,6,1,8,4,2,1,9};
        int p = Arrays.binarySearch(vet, 8);
        System.out.println("Encontrei o valor na posição " + p);
    }
}