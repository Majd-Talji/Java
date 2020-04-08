package _02_OOP._09_Interfaces.zB02_throws_Exception_in_Interface;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Phone implements PhoneNumber{

    @Override
    public void checkNumber(String number) throws Exception {
        if (number.length() > 40) {
            throw new Exception("Number is not too big!");
        }
    }
    
}
