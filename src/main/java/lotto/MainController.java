package lotto;

import lotto.message.ViewMessage;
import lotto.view.InputView;
import lotto.view.OutputView;

public class MainController {

    public void run() {
        this.buyLotto();
    }

    public void buyLotto() {
        OutputView.printMessage(ViewMessage.INPUT_LOTTO_MONEY);
        int money = InputView.inputMoney();
        System.out.println(money);
    }
}
