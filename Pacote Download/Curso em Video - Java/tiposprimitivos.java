// int idade = 3;
// float sal = 1825.54f;
// char letra = 'C';
// boolean casado = false;

// int idade = (int)3;
// float sal = (float)1825.54;
// char letra = (char) 'C';
// boolean casado = (boolean) false;

// Integer idade = new Integer(3);
// Float sal = new Float(1825.54);
// Character letra = new Character('C');
// Boolean casado = new Boolean(false);

import java.util.Scanner;
public class tiposprimitivos{
    public static void main(String[] args){
        // String nome = "Fábio";
        // float nota = 8.5f;
        // System.out.print("A nota é " + nota);
        // System.out.println("A nota é " + nota);
        // System.out.printf("A nota de %s é %.2f \n",nome,nota);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n",nome,nota);
    }
}