
package com.agile.CodeSamplesForAssertion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
       App c = new App();
             c.operation( );
    }
    
    @Test
    public void shouldReturnTheSumOfTwoNumbers() {
        App app = new App();
        int sum = app.addition(4,5);
        assertEquals(9, sum);
    }
    @Test
    public void shouldReturnsubtractionOfTwoNumbers() {
        App app = new App();
        int sub = app.subtraction(4,5);
        assertEquals(-1, sub);
    }
    @Test
    public void shouldReturnmultiplicationOfTwoNumbers() {
        App app = new App();
        int mul = app.multiply(4,5);
        assertEquals(20, mul);
    }




    
}
