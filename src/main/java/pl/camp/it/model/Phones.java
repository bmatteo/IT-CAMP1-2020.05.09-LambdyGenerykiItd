package pl.camp.it.model;

import java.util.List;

public class Phones {
    private List<String> faxNumbers;
    private List<String> mobileNumbers;

    public List<String> getFaxNumbers() {
        return faxNumbers;
    }

    public void setFaxNumbers(List<String> faxNumbers) {
        this.faxNumbers = faxNumbers;
    }

    public List<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }
}
