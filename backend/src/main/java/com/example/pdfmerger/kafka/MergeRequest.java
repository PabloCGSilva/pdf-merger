package com.example.pdfmerger.kafka;

import java.util.List;

public class MergeRequest {
    private List<String> files;
    private String name;
    private String description;
    private String email;
    private String pdfDataString; // Assuming this is the data

    // Getters and setters
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPdfDataString() {
        return pdfDataString;
    }

    public void setPdfDataString(String pdfDataString) {
        this.pdfDataString = pdfDataString;
    }
}
