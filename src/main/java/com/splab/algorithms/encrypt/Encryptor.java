package com.splab.algorithms.encrypt;

import lombok.Data;

@Data
public class Encryptor {
    private ReadAble reader;
    private EncryptAble enc;
    private PrintAble printer;

    public Encryptor(ReadAble reader, EncryptAble enc, PrintAble printer) {
        this.reader = reader;
        this.enc = enc;
        this.printer = printer;
    }

    public void sendMessage(){
        String message = reader.writeMessage();
        String encMessage = enc.encrypt(message);
        printer.printMessage(encMessage);
    }

    public void receiveMessage(){
        String message = reader.writeMessage();
        String decMessage = enc.decrypt(message);
        printer.printMessage(decMessage);
    }
}
