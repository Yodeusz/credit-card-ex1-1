package pl.jkan.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {
    
    @Test
    public void assignCreditLimitToCard() {
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000);
        
        Assert.assertTrue(card.getLimit() == 2000);
    }

    @Test
    public void canBlockCard() {
        
        CreditCard card = new CreditCard();
        
        card.block();
        
        Assert.assertTrue(card.isBlocked());
        
    }

    @Test (expecteed = WithdrawWhenCardBlocked.class)
    public void cantWithdrawWhenCardBlocked () throws Exception {
        CreditCard card = new CreditCard;
        card.assignLimit(200);
        card.withdraw(300);
    }
}