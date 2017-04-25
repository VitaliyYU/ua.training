package ua.training.controller;

import ua.training.model.Note;
import ua.training.view.View;

import java.util.Scanner;

/**
 * Created by vitaliy on 22.04.17.
 */
public class Controller {
    private View view;
    private Note note;

    public Controller(Note note,View view) {
        this.view = view;
        this.note=note;
    }

    public void executeProcess() {
        Scanner sc=new Scanner(System.in);
        UtilController utilController=new UtilController(sc,view);
        TemplateNotebook templateNotebook=new  TemplateNotebook(utilController,note,view);

        templateNotebook.saveInNote();
        System.out.println(note);

    }
}
