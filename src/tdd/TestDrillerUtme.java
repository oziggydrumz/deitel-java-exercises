package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestDrillerUtme {

     @Test
    public void testDrilling(){
          testDrilling copies = new testDrilling();
          int priceOfUtmeDriller = copies.priceOfutmeDriller(3);
          assertEquals(6000,priceOfUtmeDriller);

           //@Test
                 //  public void testDrilling(){
               //testDrilling copies =new testDrilling();
              // int priceOfUtmeDriller = copies.priceOfutmeDriller();

         }

     }
//}
