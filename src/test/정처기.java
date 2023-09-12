package test;

public class 정처기 {
    public static void main(String[] args) {
        int w=3, x=4, y=3, z=5;

        if((w ==2 | w==y) & !(y>z) & (1==x^y!=z)){
            w=w+y;
            if(7==x^y!=w)
                System.out.println("w = " + w);
            else
                System.out.println("x = " + x);
        }else {
            w=y+z;
            if(7== y^z != w)
                System.out.println("w = " + w);
        else
            System.out.println("z = " + z);
        }

    }
}
