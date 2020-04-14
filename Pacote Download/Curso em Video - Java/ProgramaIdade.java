import java.util.Scanner;
public class ProgramaIdade{
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int idade = 2020 - nasc;
        System.out.println("Sua idade é " + idade);
        if(idade>=18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }
    }
}