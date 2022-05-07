import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StingExaple {
    @Test(expected = NullPointerException.class)
    public void givenNullInteger_whenToString_thenNullPointerException() {
        Integer input = null;

        String str = input.toString();
    }


    @Test(expected = ClassCastException.class)
    public void givenIntegerObject_whenCastToObjectAndString_thenCastClassException() {
        Integer input = 1234;
        Object obj = input;
        String str = (String) obj;
    }

    @Test
    public void givenIntegerNotNull_whenCastToObject_thenGetToStringReturnsString() {
        Integer input = 1234;

        Object obj = input;

        //Assert.assertEquals("1234", StringCastUtils.getStringRepresentation(obj));
        //Assert.assertNotSame("1234", StringCastUtils.getStringRepresentation(obj));
    }
    @Test
    public void compareToComparator()
    {
        List<Integer> players = Arrays.asList(9, 9, 1,7,10,6,12,1,4,20,10);
        Comparator<Integer> nameComparator = Comparator.comparing(Integer::valueOf);
        Collections.sort(players, nameComparator);

        System.out.println(players.toString());

    }




}
