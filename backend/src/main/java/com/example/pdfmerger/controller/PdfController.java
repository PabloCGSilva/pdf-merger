package com.example.pdfmerger.controller;

import com.example.pdfmerger.dto.MergedPDFResponseDTO;
import com.example.pdfmerger.service.PdfMergeService;
import com.example.pdfmerger.kafka.MergeRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import java.util.Base64;
import java.util.List;
import java.util.Collections;

@RestController
@RequestMapping("/api/pdf")
public class PdfController {

    private final PdfMergeService pdfMergeService;

    public PdfController(PdfMergeService pdfMergeService) {
        this.pdfMergeService = pdfMergeService;
    }

    @PostMapping("/merge")
    public MergedPDFResponseDTO mergePdfs(@RequestBody MergeRequest mergeRequest) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication != null ? authentication.getName() : null;

        byte[] pdfData = convertToByteArray(mergeRequest.getPdfDataString());

        List<String> fileList = Collections.singletonList("path/to/pdf");

        return pdfMergeService.mergePdfs(fileList, mergeRequest.getName(), mergeRequest.getDescription(), email);
    }

    private byte[] convertToByteArray(String pdfDataString) {
        return Base64.getDecoder().decode(pdfDataString);
    }
}
