package app;

public class App {
    public static void main(String[] args) throws Exception {
        int numero = 10;
        numero = soma(1,2);
        System.out.println("Ola Java do Visual Studio Code" + numero);
    }
    public static int soma(int num1, int num2){
        return num1 + num2;
    }
}