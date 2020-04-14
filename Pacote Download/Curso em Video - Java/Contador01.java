public class Contador01{
    public static void main(String[] args){
        int cc = 1;
        while(cc <= 4){
            System.out.println("Cambalhota " + cc);
            cc++;
        }
        int a = 0;
        while(a<10){
            a++;
            if(a == 5 || a == 7){
                continue;
            }
            System.out.println("Cambalhota " + cc);
        }
        int q = 0;
        while(q<10){
            q++;
            if(q == 2 || q == 3 || q == 4){
                continue;
            }
            if (q == 7){
                break;
            }
            System.out.println("Cambalhota " + q);        
        }
    }
}