package CoreJava;

import org.checkerframework.checker.units.qual.C;

public class ChildClassDemo extends ParentClassDemo{

    public void engine(){
        System.out.println("new engine");
    }
    public void colour(){
        System.out.println(colour);
    }
    public static void main(String[] args) {
        ChildClassDemo cd= new ChildClassDemo();
        cd.colour();
        cd.brakes();

    }

}
