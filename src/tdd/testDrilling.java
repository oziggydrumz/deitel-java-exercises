package tdd;

public class testDrilling{

            int priceOfUtmeDriller = 1;
    public int priceOfutmeDriller(int numberOfCopies) {
        if(numberOfCopies <=4 ){
            priceOfUtmeDriller = numberOfCopies * 2000;
        }

        return priceOfUtmeDriller;
    }

}