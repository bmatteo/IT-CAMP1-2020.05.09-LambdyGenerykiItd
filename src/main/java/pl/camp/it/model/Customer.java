package pl.camp.it.model;

import java.util.List;

public class Customer {
    private List<Phones> phonesList;

    public List<Phones> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(List<Phones> phonesList) {
        this.phonesList = phonesList;
    }
}
