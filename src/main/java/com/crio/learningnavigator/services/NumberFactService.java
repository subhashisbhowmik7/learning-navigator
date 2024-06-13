package com.crio.learningnavigator.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NumberFactService {
    private final RestTemplate restTemplate;

    public NumberFactService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getNumberFact(int number) {
        String apiUrl = "http://numbersapi.com/" + number;
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
