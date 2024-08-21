import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @org.junit.jupiter.api.Test
    void calculateFactorialForZero() {
        assertEquals(1,main.calculateFactorial(0));
    }
    @org.junit.jupiter.api.Test
    void  calculateFactorialForPositiveNumber(){
        assertEquals(1,main.calculateFactorial(1));
        assertEquals(2,main.calculateFactorial(2));
        assertEquals(5040,main.calculateFactorial(7));
    }
    @org.junit.jupiter.api.Test
    void calculateFactorialForNegetiveNumber(){
        assertThrows(IllegalArgumentException.class, ()-> main.calculateFactorial(-1));
    }
}