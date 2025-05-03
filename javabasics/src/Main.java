import innerclasses.OuterClass;
import innerclasses.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      LocalInnerClass innerClass = new LocalInnerClass();
//      innerClass.displayOuter();

        StaticInnerClass.innerClass  innerClass =new StaticInnerClass.innerClass();
        innerClass.display();

//        My my = new My() {
//            @Override
//            public void display() {
//                System.out.println("It is an example of Anonymous Inner Class");
//            }
//        };
//
//        my.display();

    }


}