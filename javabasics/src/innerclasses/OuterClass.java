package innerclasses;

public class OuterClass {

    int x = 45;

  public   class InnerClass{
        int y = 95;
        public void displayInnerClass(){
            System.out.println(x+ "   " + y );
        }
    }

    public void displayOuterClass(){

        InnerClass innerClass = new InnerClass();
        System.out.println(x+ "  " + innerClass.y);
        innerClass.displayInnerClass();

    }

}
