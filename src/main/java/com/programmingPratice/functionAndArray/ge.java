package com.programmingPratice.functionAndArray;

import java.util.ArrayList;
import java.util.List;

public class ge<h> {
    public String id;
    public List<h> id1;

    public ge(String id, List<h> id1) {
        this.id = id;
        this.id1 = id1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<h> getId1() {
        return id1;
    }

    public void setId1(List<h> id1) {
        this.id1 = id1;
    }

    public static void main(String[] args) {

        ArrayList<ge<Useral>> userArrayList = new ArrayList<>();

        ArrayList<Useral> userArrayList1 = new ArrayList<>();
        Useral user = new Useral();
        user.setId("1");
        user.setName("wer");
        userArrayList1.add(user);
        userArrayList.add(new ge<>("userList", userArrayList1));

        ArrayList<ge<role>> role = new ArrayList<>();

        ArrayList<role> roleArrayList = new ArrayList<>();
        role role1 = new role();
        role1.setId("1");
        role1.setName("wer");
        roleArrayList.add(role1);
        role.add(new ge<>("userList", roleArrayList));
    }
}
