 public class Vetor01{
     public static void main(String []args){
        int n[] = {3,2,8,7,5,4};//pode ser int []n inves de int n[]
        System.out.println("Total de casas de n " + n.length);
        for(int c = 0; c <= 5; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]); 
        }
        for(int c = 0; c <= n.length-1; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]); 
        }
    }
 }