package com.fetch.skilltest.services;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class EmailValidationService {

    public int countValidEmailAddress(List<String> emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] address = email.toLowerCase().split("@");
            String username = address[0];
            String domainName = address[1];

            username = username.replace(".", "");

            int plusIndex = username.indexOf("+");
            if (plusIndex > -1) {
                username = username.substring(0, plusIndex);
            }

            set.add(username + "@" + domainName);
        }

        return set.size();
    }
}

