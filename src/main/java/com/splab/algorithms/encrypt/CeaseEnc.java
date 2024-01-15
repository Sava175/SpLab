package com.splab.algorithms.encrypt;

import lombok.Data;

@Data
public class CeaseEnc implements EncryptAble{
    public int key;

    public CeaseEnc(int key) {
        this.key = key;
    }

    @Override
    public String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++){
            char symbol = message.charAt(i);
            symbol+= key;
            result.append(symbol);
        }
        return  result.toString();
    }

    @Override
    public String decrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char symbol = message.charAt(i);
            symbol-= key;
            result.append(symbol);
        }
        return result.toString();
    }
}
