package com.splab.algorithms.encrypt;

public class EncRunner {
    public static void main(String[] args) {
        ReadAble consoleReader = new ConsoleReader();
        PrintAble consolePrinter = new ConsolePrinter();
        EncryptAble ceaseEnc = new CeaseEnc(3);
        Encryptor encryptor = new Encryptor(consoleReader, ceaseEnc, consolePrinter);

        encryptor.sendMessage();
        encryptor.receiveMessage();
    }
}
