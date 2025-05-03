package innerclasses;

public class LocalInnerClass {

    int x = 6520;

    public void displayOuter(){

        class InnerClass{

            int x = 448;

            public void display(){
                System.out.println(x);
            }

        }

        InnerClass innerClass = new InnerClass();
        innerClass.display();
        System.out.println(x + " " +  x );

    }

}
