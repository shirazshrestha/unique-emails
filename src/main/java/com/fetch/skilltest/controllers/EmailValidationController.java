package com.fetch.skilltest.controllers;

import com.fetch.skilltest.entities.ApiResponse;
import com.fetch.skilltest.services.EmailValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
public class EmailValidationController {

    @Autowired
    private EmailValidationService service;

    @PostMapping("/count-unique")
    public ResponseEntity<ApiResponse<Integer>> countValidEmails(@RequestBody List<String> emails) {
        ApiResponse<Integer> response = new ApiResponse<>();
        try {
            Integer count = service.countValidEmailAddress(emails);
            response.setMessage("Emails Validated.");
            response.setData(count);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            response.setMessage(e.getMessage());
            response.setStatus(500);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
