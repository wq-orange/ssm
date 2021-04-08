package com.spring.entity;

/**
 * @author 南柯
 * @date 2021/4/8 15:56
 */
public class User {
    private String User1;
    private String User2;

    public String getUser1() {
        return User1;
    }

    public void setUser1(String user1) {
        User1 = user1;
    }

    public String getUser2() {
        return User2;
    }

    public void setUser2(String user2) {
        User2 = user2;
    }

    @Override
    public String toString(){
        return getUser1() + "\n" + getUser2();
    }
}
