import org.testng.Assert;

public class mainTest {

    @org.testng.annotations.Test
    public void testCalculateFactorialForZero() {
        Assert.assertEquals(main.calculateFactorial(0),1);
    }
    @org.testng.annotations.Test
    public void testCalculateFactorialForPositiveNumber(){
        Assert.assertEquals(main.calculateFactorial(5),120);
    }
    @org.testng.annotations.Test
    public void testCalculateFactorialForNegativeNumber(){
        try {
            main.calculateFactorial(-1);
            Assert.fail("вызов IllegalArgumentException");

        }catch (IllegalArgumentException e ){

        }
    }

    @org.testng.annotations.Test
    public void testCalculateFactorial() {
    }
}
