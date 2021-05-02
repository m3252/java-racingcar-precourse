package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomNumberUtilsTest {

    private int number;
    private int max;
    private int min;

    @Test
    @DisplayName("랜덤 숫자 생성")
    public void 난수를_생성한다(){
        max = 3;
        min = 3;
        number = RandomNumberUtils.createRandomNumber(max, min);
        assertTrue(number == max || number == min);
    }

    @Test
    @DisplayName("랜덤 숫자 범위 확인")
    public void 난수_범위를_검증한다(){
        max = 9;
        min = 1;
        number = RandomNumberUtils.createRandomNumber(max, min);
        assertTrue(min <= number && number <= max);
    }

    @Test
    @DisplayName("최소 범위가 최대 범위보다 크면 익셉션 발생")
    public void 최소_범위가_최대_범위보다_크면_익셉션_발생(){
        max = 1;
        min = 9;
        assertThatThrownBy(() -> RandomNumberUtils.createRandomNumber(max, min))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("최소 범위가 최대 범위보다 큽니다.");
    }
}
