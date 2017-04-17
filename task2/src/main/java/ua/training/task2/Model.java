package ua.training.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by vitaliy on 15.04.17.
 */
public class Model {
    private  Integer minValueInRange;
    private  Integer maxValueInRange;
    private  Integer secretKey;
    private List<Integer> betHistory;

    public Integer getMinValueInRange() {
        return minValueInRange;
    }

    public Integer getMaxValueInRange() {
        return maxValueInRange;
    }

    public void setMinValueInRange(Integer minValueInRange) {
        this.minValueInRange = minValueInRange;
    }

    public void setMaxValueInRange(Integer maxValueInRange) {
        this.maxValueInRange = maxValueInRange;
    }

    Model(){
        betHistory= new ArrayList<Integer>();
    }

    public Integer checkYourBet(Integer inputValue){
        if(inputValue==secretKey) return 0;
        else if(inputValue<secretKey) {
            setMinValueInRange(inputValue);
            return -1;
        }else {
            setMaxValueInRange(inputValue);
            return 1;
        }

    }

     public void setRangeAndRandomSecretKey(Integer minValueInRange,Integer maxValueInRange){
         this.maxValueInRange=maxValueInRange;
         this.minValueInRange=minValueInRange;
         secretKey=findRandomForSecreteKey();
    }

    public void addBetToHistory(Integer value){
        betHistory.add(value);
    }

    public Integer getSecretKey(){
        return secretKey;
    }

    public Integer findRandomForSecreteKey(){
        Random rand=new Random();
        Integer result =rand.nextInt((maxValueInRange-minValueInRange+1)+minValueInRange);

        return result;
    }


    public String getRangeToString(){
        String result="["+minValueInRange+" "+maxValueInRange+"]";
        return result;
    }

    public List<Integer> getBetHistory() {
        return betHistory;
    }
}
