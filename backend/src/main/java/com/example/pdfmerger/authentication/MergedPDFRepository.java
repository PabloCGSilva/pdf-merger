package com.example.pdfmerger.repository;

import com.example.pdfmerger.model.MergedPDF;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MergedPDFRepository extends JpaRepository<MergedPDF, Long> {
    Page<MergedPDF> findByUsersEmail(String email, Pageable pageable);
}
