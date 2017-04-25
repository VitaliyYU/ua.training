package ua.training.view;

/**
 * Created by vitaliy on 22.04.17.
 */
public class View {

    public void  printMessage(String ... messages){
        for(String message:messages){
            System.out.print(message+" ");
        }
        System.out.println();
    }
}
