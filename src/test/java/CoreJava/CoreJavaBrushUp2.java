package CoreJava;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        int[] arr2={2,4,6,33,53,2,37,8,9};
        //print only even number
        for (int i = 0; i < arr2.length ; i++) {
            if(arr2[i]%2==0){
                System.out.println(arr2[i]+" is even number");
                //break;  result only 2
            }else{
                System.out.println(arr2[i]+" is not even number");
            }

        }

        ArrayList<String> a=new ArrayList<>();
        a.add("Leo");
        a.add("Nala");
        a.add("Katy");
        a.add("George");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        String str=a.get(2);
        System.out.println(str);

        //create object of the class-object.method





    }
}
