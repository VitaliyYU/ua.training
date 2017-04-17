package ua.training.task2;

import java.util.List;

/**
 * Created by vitaliy on 15.04.17.
 */
public class View {
    public final static String WRONG_INPUT_DATA = "Wrong input data!!!Enter again in range!!!";
    public final static String YOU_WIN = "Congratulates!!!You win!!!";
    public final static String BIGGER_THAN_YOU_VALUE="Secret key bigger than you value!!!";
    public final static String LESS_THAN_YOU_VALUE="Secret key less than you value!!!";
    public final static String RANGE="Enter value in ";
    public final static String START_GAME="Start game!!!Enter number in range";


    public void printStartMessage(Model  model){
        System.out.println(START_GAME+model.getRangeToString());
    }

    public void printWrongInputDataMessage(Model model){
        System.out.println(WRONG_INPUT_DATA+model.getRangeToString());
    }

    public void printFinalMessage(Model model){
        System.out.println(YOU_WIN+model.getSecretKey());
    }

    public void printBiggerThanYouAnswer(Model model){
        System.out.println(BIGGER_THAN_YOU_VALUE+RANGE+model.getRangeToString());
    }

    public void printLessThanYouAnswer(Model model){
        System.out.println(LESS_THAN_YOU_VALUE+RANGE+model.getRangeToString());
    }

    public void printYourHistory(Model model){
        List<Integer> history=model.getBetHistory();
        System.out.println("Your History: ");
        history.stream().forEach(System.out::println);
    }

}