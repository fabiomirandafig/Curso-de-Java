public class ComparacaoString{ 

    public static void main(String [] args){
        String nome1 = "Gustavo";//nao foi instanciado
        String nome2 = "Gustavo";//não foi instanciado
        String nome3 = new String("Gustavo");//instanciado
        String res,res2;
        res = (nome2 == nome3)?"Igual":"Diferente";//testa se sao iguais sintaticamente
        res2 = (nome1.equals(nome3))?"Igual":"Diferente";//para objetos utiliza equals inves de ==, testa se o conteudo é igual
        System.out.println(res);
        System.out.println(res2);
    }
}
//OFF: O java é compativel com o html