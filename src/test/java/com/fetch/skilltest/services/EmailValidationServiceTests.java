package com.fetch.skilltest.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class EmailValidationServiceTests {

    @Autowired
    private EmailValidationService service;

    @Test
    void validateEmails(){
        List<String> emails = new ArrayList<>();
        emails.add("test.email@fetchrewards.com");
        emails.add("test.email@gmail.com");

        int count = service.countValidEmailAddress(emails);
        assert (count == 2);
    }
}
