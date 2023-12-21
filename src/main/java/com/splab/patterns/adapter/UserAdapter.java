package com.splab.patterns.adapter;

public class UserAdapter implements NewUser{
    private OldUser oldUser;

    public UserAdapter(OldUser oldUser) {
        this.oldUser = oldUser;
    }
    @Override
    public String getUserName() {
        return oldUser.getName();
    }

    @Override
    public int getAge() {
        return oldUser.getAge();
    }
}
