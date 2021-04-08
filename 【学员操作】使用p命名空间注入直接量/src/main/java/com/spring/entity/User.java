package com.spring.entity;

/**
 * @author 南柯
 * @date 2021/4/8 16:12
 */
public class User {
    private String user1;
    private String user2;

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    @Override
    public String toString() {
        return getUser1() + "\n" + getUser2();
    }
}
