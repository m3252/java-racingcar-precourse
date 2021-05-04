package view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class InputDeviceTest {

    @ParameterizedTest
    @DisplayName("시도할 횟수 입력값은 정수만 입력 가능하다.")
    @ValueSource(strings = {"abc", "가나다", "ㄱㄴㄷ", "ABC", "@#$"})
    public void 시도할_횟수_입력값은_유효성_확인(String inputNumber) {
        assertThatThrownBy(() -> InputDevice.checkInputValidValue(inputNumber))
                .isInstanceOf(NumberFormatException.class)
                .hasMessageContaining("숫자만 입력 가능합니다.");
    }

    @ParameterizedTest
    @DisplayName("시도할 횟수 입력값의 범위는 1에서 1000 사이이다.")
    @ValueSource(strings = {"1001", "0"})
    public void 시도할_횟수_입력값_범위_확인(String inputNumber) {
        assertThatThrownBy(() -> InputDevice.checkInputRange(inputNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자의 범위는 1 ~ 1000 사이로 이루어져야 합니다.");
    }
}
