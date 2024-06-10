package lotto;

import lotto.message.ErrorMessage;
import lotto.message.ViewMessage;
import lotto.view.InputView;
import lotto.view.OutputView;

public class MainController {

    public void run() {
        int money = this.buyLotto();
        int tickets = this.calculateLotto(money);
    }

    public int buyLotto() {
        OutputView.printMessage(ViewMessage.INPUT_LOTTO_MONEY);
        int money = InputView.inputMoney();
        System.out.println(money);
        return money;
    }

    public int calculateLotto(int money) {
        this.validateMoney(money);
        int tickets = money - (money % 1000);
        return tickets / 1000;
    }

    public void validateMoney(int money) {
        if (money <= 0) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_NOT_INTEGER);
        }
    }

}
