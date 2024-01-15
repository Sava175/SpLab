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

    public void receiveMessage(){
        String message = reader.readMessage();
        String decMessage = enc.decrypt(message);
        printer.sendMessage(decMessage);
    }
    public void sendMessage(){
        String message = reader.readMessage();
        String encMessage = enc.encrypt(message);
        printer.sendMessage(encMessage);
    }
}
