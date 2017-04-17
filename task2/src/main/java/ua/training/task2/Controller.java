package ua.training.task2;

import java.util.Scanner;

/**
 * Created by vitaliy on 15.04.17.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute(){
        Integer min=GlobalConstants.MIN_IN_RANGE;
        Integer max=GlobalConstants.MAX_IN_RANGE;
        model.setRangeAndRandomSecretKey(min,max);

        play();
    }


    public void play(){
        Integer inputValue;
        Scanner input  =new Scanner(System.in);

        view.printStartMessage(model);

        while (true){
            inputValue=input.nextInt();
            if (checkValueNotInRange(inputValue))
                continue;
            Integer resultInThisStep=model.checkYourBet(inputValue);
            if(resultInThisStep==0){
                model.addBetToHistory(inputValue);
                view.printYourHistory(model);
                view.printFinalMessage(model);
                break;
            }
            else if(resultInThisStep==1){
                model.addBetToHistory(inputValue);
                view.printLessThanYouAnswer(model);
            }
            else {
                model.addBetToHistory(inputValue);
                view.printBiggerThanYouAnswer(model);
            }
        }
    }

     public Boolean checkValueNotInRange(Integer inputValue){
        if(inputValue>model.getMaxValueInRange()
                ||inputValue<model.getMinValueInRange()) {
            view.printWrongInputDataMessage(model);
            return true;
        }
        return false;
     }
}
