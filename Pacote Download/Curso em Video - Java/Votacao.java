import java.util.Scanner;
public class Votacao{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano que você nasceu: ");
        int nasc = teclado.nextInt();
        int idade = 2020 - nasc;
        if(idade < 16){
            System.out.println("Você não vota!");
        }
        else if((idade >= 16 && idade < 18) || (idade > 70)){
            System.out.println("Seu voto é facultativo!");
        }
        else{
            System.out.println("Seu voto é obrigatório!");
        }
    }
}