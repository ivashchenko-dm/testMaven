package com.divashchenko;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<User> users = new ArrayList<User>();

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
