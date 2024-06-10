package lotto.view;

import lotto.message.ViewMessage;

public class OutputView {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printTickets(int ticket) {
        System.out.printf(ticket + ViewMessage.OUTPUT_LOTTO_TICKETS);
    }
}
