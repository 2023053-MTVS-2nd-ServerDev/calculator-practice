import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlusCalculatorTests {

    @DisplayName("10과 20을 더하여 30이 나오는지 확인")
    @Test
    public void testSumTwoNumbers() {

        //given
        int num1 = 10;
        int num2 = 20;

        //when
        PlusCalculator plusCalculator = new PlusCalculator();
        int result = plusCalculator.sumTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(20, result);
    }
}
