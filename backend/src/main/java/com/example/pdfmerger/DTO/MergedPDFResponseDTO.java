package com.example.pdfmerger.dto;

import java.time.LocalDateTime;

public class MergedPDFResponseDTO {

    private Long id;
    private String name;
    private String description;
    private byte[] pdfData;
    private LocalDateTime createdAt;

    public MergedPDFResponseDTO(Long id, String name, String description, byte[] pdfData, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.pdfData = pdfData;
        this.createdAt = createdAt;
    }

    // Getters and setters here
}
