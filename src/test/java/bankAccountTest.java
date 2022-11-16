import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bankAccountTest {

    @Test
    public void testDeposit(){
       // test deposit
        bankAccount tester = new bankAccount();
        assertEquals(101.19999999999999,tester.Newdeposit(100.1,1.1));




    }
    @Test
    // test withdraw
    public void testWithdraw(){
        // test deposit
        bankAccount tester = new bankAccount();
        assertEquals(0.0,tester.Newwithdraw(50.0,50.0));




    }}