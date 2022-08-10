package com.bridgelabz;

import javax.swing.*;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {

        this.message = message;
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (message.contains("I am in sad mood"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException("Please enter proper message !");
        }
    }

    public String analyzeMood(String mood) {

        return"SAD";


    }
}
