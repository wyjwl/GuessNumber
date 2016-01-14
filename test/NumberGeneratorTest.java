import com.company.NumberGenerate;
import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.*;

/**
 * Created by lenovo on 2015/12/26.
 */
public class NumberGeneratorTest {

    public boolean isNumber(String number){

        return number.matches("[0-9]*");
    }

    public boolean isUnRepeat(String number){
        char[] c=number.toCharArray();
        for(int i=0;i<number.length();i++){
            if(number.lastIndexOf(c[i])!=i){
                return false;
            }
        }
        return true;
    }

    public boolean isEqual(String str1,String str2){
        return str1.equals(str2);
    }
    @Test
    public void should_generate_number_is_4_digit(){
        String number= new NumberGenerate().generate();
        assertEquals (number.length(),4);
    }

    @Test
    public void should_generate_is_number(){
        String number= new NumberGenerate().generate();
        assertEquals(isNumber(number),true);
    }

    @Test
    public void should_generate_number_is_unRepeat(){
        String number= new NumberGenerate().generate();
        assertEquals(isUnRepeat(number),true);
    }

    @Test
    public void should_generate_number_is_random(){
        String number1= new NumberGenerate().generate();
        String number2= new NumberGenerate().generate();
        assertEquals(isEqual(number1,number2),false);
    }
}
