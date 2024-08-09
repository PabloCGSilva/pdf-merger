package com.example.pdfmerger.service;

import com.example.pdfmerger.dto.MergedPDFResponseDTO;
import org.springframework.stereotype.Service;
import java.util.List;
import java.time.LocalDateTime;

@Service
public class PdfMergeService {

    public MergedPDFResponseDTO mergePdfs(List<String> files, String name, String description, String email) {
        // Implement the merging logic here
        // For now, you can just return a dummy response

        // TODO: Add actual PDF merging logic using a library like iText or Apache
        // PDFBox

        return new MergedPDFResponseDTO(1L, name, description, new byte[0], LocalDateTime.now());
    }
}
