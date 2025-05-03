package innerclasses;

public class StaticInnerClass {

    static int x = 10;

    int y = 45;

    public static class innerClass{

      public   void display(){

            System.out.println(x +  "   " + StaticInnerClass.x);
        }

    }

}
