package com.runbarry.spring.starter;

public class StudyService {
    private StudyProperties properties;

    public StudyService(StudyProperties properties) {
        this.properties = properties;
    }

    public String snapFinger() {
        return "I am " + properties.getName();
    }
}
