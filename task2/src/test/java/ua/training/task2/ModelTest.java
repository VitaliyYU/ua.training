package ua.training.task2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vitaliy on 15.04.17.
 */
public class ModelTest {
    @Test
    public void testRandomInRange0to100(){
        Model model=new Model();
        model.setRangeAndRandomSecretKey(0,100);

        Assert.assertTrue(model.getSecretKey()>=0&&model.getSecretKey()<=100);
    }

    @Test
    public void testInputValueBiggerThanSecretKeyInRange0to100(){
        Model model=new  Model();
        model.setRangeAndRandomSecretKey(0,100);
        Integer expected=1;

        Integer biggerTestBet=model.getSecretKey()+1;
        Integer actual=model.checkYourBet(biggerTestBet);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInputValueLessThanSecretKeyInRange0to100(){
        Model model=new  Model();
        model.setRangeAndRandomSecretKey(0,100);
        Integer expected=-1;

        Integer lessTestBet=model.getSecretKey()-1;
        Integer actual=model.checkYourBet(lessTestBet);

        Assert.assertEquals(expected,actual);
    }

}
