public class OperadoresLogiscos{
    public static void main(String[] args){
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r,r1,r2;
        r = (x < y && y < z)?true:false;
        r1 = (x < y || y == z)?true:false;
        r2 = (x < y ^ y == z)?true:false;
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
    }
}