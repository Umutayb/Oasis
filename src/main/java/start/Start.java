package start;

import utils.Printer;

public class Start {
    public static void main(String[] args) {
        Printer log = new Printer(Start.class);
        log.new Important("Welcome to the Oasis.");
    }
}
