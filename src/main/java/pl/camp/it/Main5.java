package pl.camp.it;

import pl.camp.it.model.Company;
import pl.camp.it.model.Customer;
import pl.camp.it.model.Phones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main5 {
    public static void main(String[] args) {
        Phones phones = new Phones();
        phones.setFaxNumbers(Arrays.asList("123123123", "098098098"));
        phones.setMobileNumbers(Arrays.asList("345345345"));

        Customer customer = new Customer();
        customer.setPhonesList(Arrays.asList(phones));

        Company company = new Company();
        //company.setCustomerList(Arrays.asList(customer));

        //Main5.printPhones(company);

        Main5.superPrintPhones(company);
    }

    private static void printPhones(Company company) {
        if (company != null && company.getCustomerList() != null) {
            for (Customer customer : company.getCustomerList()) {
                if (customer.getPhonesList() != null) {
                    for (Phones phones : customer.getPhonesList()) {
                        if (phones.getFaxNumbers() != null) {
                            for (String number : phones.getFaxNumbers()) {
                                System.out.println(number);
                            }
                        }
                        if (phones.getMobileNumbers() != null) {
                            for (String number : phones.getMobileNumbers()) {
                                System.out.println(number);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void superPrintPhones(Company company) {
        Optional.ofNullable(company).ifPresent(c ->
                Optional.ofNullable(c.getCustomerList()).ifPresent(customers ->
                        customers.forEach(customer -> {
                            Optional.ofNullable(customer.getPhonesList()).ifPresent(phones ->
                                    phones.stream()
                                            .map(phonesElement -> {
                                                List<String> list = new ArrayList<>();
                                                Optional.ofNullable(phonesElement.getFaxNumbers()).ifPresent(list::addAll);
                                                Optional.ofNullable(phonesElement.getMobileNumbers()).ifPresent(list::addAll);
                                                return list;
                                            })
                                            .forEach(strings -> strings.forEach(System.out::println)));
                        })
                )
        );

        /*Optional.ofNullable(company)
                .map(Company::getCustomerList)
                .map(List::stream)
                .flatMap(Stream::findAny)
                .map(Customer::getPhonesList)
                .map(List::stream)
                .flatMap(Stream::findAny)
                .map(phones -> {
                    List<String> list = new ArrayList<>();
                    Optional.ofNullable(phones.getFaxNumbers()).ifPresent(faxList -> list.addAll(faxList));
                    Optional.ofNullable(phones.getMobileNumbers()).ifPresent(mobileNumbers -> list.addAll(mobileNumbers));
                    return list;
                })
                .map(List::stream)
                .ifPresent(s -> s.forEach(System.out::println));*/
    }
}
