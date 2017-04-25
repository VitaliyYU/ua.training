package ua.training.controller;

import ua.training.view.MessageConstants;
import ua.training.view.View;

import java.util.Scanner;

public class UtilController {

    private View view;
    private Scanner scanner;

    public UtilController(Scanner scanner,View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputValueWithRegex(String regex) {
        String value = scanner.nextLine();
        while(!(value.matches(regex))) {
            view.printMessage(MessageConstants.WRONG_DATA);
            value = scanner.nextLine();
        }

        return value;
    }

}
