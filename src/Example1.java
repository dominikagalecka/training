public class Example1 {
    public static void main(String[] args){
        int x=3, y=3, z, d;
        System.out.println("line 1: " + x++);
        System.out.println("line 2: " + ++y);
        System.out.println("line 3: " + x);
        System.out.println("line 4: " + y);
        z=x++;
        System.out.println("line 5: " + z);
        z=++x;
        System.out.println("line 6: " + z);
        d=z/y;
        System.out.println("line 7: " + d);
    }
}
