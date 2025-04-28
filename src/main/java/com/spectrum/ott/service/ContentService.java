//package com.spectrum.ott.service;
//
//import com.spectrum.ott.model.Content;
//import com.spectrum.ott.repository.ContentRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ContentService {
//
//    private final ContentRepository contentRepository;
//
//    public ContentService(ContentRepository contentRepository) {
//        this.contentRepository = contentRepository;
//    }
//
//    public List<Content> searchAll() {
//        return (List<Content>) contentRepository.findAll();
//    }
//
//    public Content upload(Content content) {
//        return contentRepository.save(content);
//    }
//
//}
