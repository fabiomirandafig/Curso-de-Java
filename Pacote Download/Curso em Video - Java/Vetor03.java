import java.util.Arrays;
public class Vetor03{
    public static void main(String []args){
        double x[] = {3.2,2.7,4.23,1.315,-5.4};
        for(double valor:x){
            System.out.println(valor + " ");
        }
        Arrays.sort(x);
        for(double valor:x){
            System.out.println(valor + " ");
        }
    }
}