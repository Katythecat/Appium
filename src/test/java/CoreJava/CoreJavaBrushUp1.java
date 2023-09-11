package CoreJava;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        int num=5;
        String str="Leo is a cat";
        char letter='r';
        double dec=5.99;
        boolean myCard=true;
        System.out.println(num);
        System.out.println(str);
        System.out.println(letter);
        System.out.println(dec);
        System.out.println(myCard);
        //Array - use for store multiple value in one variable
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();

        int[] arr2={1,3,5,6,7};
        System.out.println(arr2[4]);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);

        }




    }
}
