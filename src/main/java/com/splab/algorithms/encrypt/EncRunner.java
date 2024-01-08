package com.splab.algorithms.encrypt;

public class EncRunner {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        CeaseEnc ceaseEnc = new CeaseEnc(3);
        Encryptor encryptor = new Encryptor(consoleReader, ceaseEnc, consolePrinter);

        encryptor.sendMessage();
        encryptor.receiveMessage();
    }
}
