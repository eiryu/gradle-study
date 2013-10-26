import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: eiryu
 * Date: 2013/10/26
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class AppTest {
    @Test
    public void helloTest(){
        Assert.assertThat(new App().hello("eiryu"), CoreMatchers.is("hello eiryu"));
    }

}
