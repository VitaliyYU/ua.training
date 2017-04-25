package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Note;
import ua.training.view.View;

/**
 * Created by vitaliy on 22.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Note model=new Note();
        View view =new View();
        Controller controller =new Controller(model,view);

        controller.executeProcess();
    }
}
