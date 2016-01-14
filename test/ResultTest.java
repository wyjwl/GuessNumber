import com.company.ReturnResult;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lenovo on 2015/12/26.
 */
public class ResultTest {
    @Test
    public void should_equals_0A0B() {
        assertEquals(new ReturnResult().getResult("1234", "5678"), "0A0B");
    }

    @Test
    public void should_equals_4A0B() {
        assertEquals(new ReturnResult().getResult("1234", "1234"), "4A0B");
    }

    @Test
    public void should_equals_2A2B(){
        assertEquals(new ReturnResult().getResult("1234", "1243"), "2A2B");
    }
}
