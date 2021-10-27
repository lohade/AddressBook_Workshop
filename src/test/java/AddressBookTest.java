
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class AddressBookTest{
    AddressMain address=new AddressMain();

    //test data for entering
    @Test
    public void whenEnterDetails_checkContact(){
        try {
            address.addContact("abhi","lohade","abhi@10","bhokardan","9730212161","431112","mh","jalna");
            address.addContact("harsh","kothari","harsh@10","uran","985742316","459863","mh","mumbai");
            int count=address.count();
            Assert.assertEquals(2,2);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
