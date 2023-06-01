import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplyCalculatorTests {
    
    @DisplayName("10과 20을 곱하여 200이 나오는지 확인")
    @Test
    public void testMultipleTwoNumbers() {

        // given
        int num1 = 10;
        int num2 = 20;

        // when
        MultiplyCalculator multiplyCalculator = new MultiplyCalculator();
        int result = multiplyCalculator.multipleTwoNumbers(num1, num2);

        // then
        Assertions.assertEquals(200, result);
    }
}
