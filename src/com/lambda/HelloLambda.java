package lambda;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by HCLEE on 2016. 4. 30..
 */
public class HelloLambda {
    public static void main(String[] args){

        log(sum(1,2));

        log(() -> {
            int s =0;
            for(int i=0; i < 3; i++){
                s += Math.random()*10;
            }
            return s;
        });
    }




    public static int sum(int i, int j){
        return i + j;
    }

    public static void log(Object o){
        System.out.println(o);
    }

    public static void log(Sumda o){
        System.out.println(o);
    }

    public static void log(Bottle b){
        System.out.println(b.bottle());
    }
}
