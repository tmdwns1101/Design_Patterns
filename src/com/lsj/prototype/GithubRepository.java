package com.lsj.prototype;

public class GithubRepository {

    //user 이름
    private String user;

    //repository 이름
    private String name;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GithubRepository{" +
                "user='" + user + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
