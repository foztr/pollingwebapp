package com.pollinglobal.pollservice;

import org.springframework.web.bind.annotation.GetMapping;

public class Poll {
    private int id;
    private int customerId;
    private String question;


    public Poll(int id, int customerId, String question) {
        this.id = id;
        this.customerId = customerId;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public int getCustomerId() {
        return customerId;
    }
}
