package com.agile.CodeSamplesForAssertion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
   
   public class EqualitySampleTest {

    @Test
    public void ShouldDisplayWelcomeMessage(){
        EqualitySample equalitySample = new EqualitySample();
        String result = equalitySample.getWelcomeMessage("SANTA");
        assertEquals("Welcome SANTA", result);
    
    }

    @Test
    public void ShouldAppendwithrandomnumber(){
         String someText = "SomeText";
         EqualitySample equalitySample = new EqualitySample();
         String result = equalitySample.getTextAppendWithRandomNumber(someText);
         String result1 = equalitySample.getTextAppendWithRandomNumber(someText);
         assertNotSame(result, result1);
        }

    @Test
    public void ShouldddTwoNumbers(){
       EqualitySample equalitySample = new EqualitySample();
       int sum = equalitySample.addTwoNumbers(3, 7);
       assertEquals(10, sum);
       }

    @Test
    public void ShouldcalulateMaturityAmount(){
        EqualitySample equalitySample = new EqualitySample();
        double maturityAmount = equalitySample.getMaturityAmount(100.10, 5.50);
        assertEquals(116.15, maturityAmount, 0.01);
    }

   @Test
   public void ShouldcheckWeekendDaysList(){
       EqualitySample equalitySample = new EqualitySample();
       List<String> weekendDaysList = equalitySample.weekendDays();
       assertNotNull(weekendDaysList);
      
    }
         

    }

    



