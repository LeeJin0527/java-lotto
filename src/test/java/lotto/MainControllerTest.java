package lotto;

import lotto.message.ErrorMessage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MainControllerTest {

    @ParameterizedTest
    @ValueSource(ints = {14000, 14100 ,25200, 35299})
    void calculateLottoSuccessTest(int money) {
        MainController mainController = new MainController();
        int tickets = mainController.calculateLotto(money);
        Assertions.assertThat(tickets).isEqualTo(money/1000);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -14000, -32000})
    void calculateLottoFailTest(int money) {
        MainController mainController = new MainController();
        Assertions.assertThatThrownBy(() -> mainController.calculateLotto(money))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INPUT_NOT_INTEGER);
    }
}