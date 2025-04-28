//package com.spectrum.ott.controller;
//
//import com.spectrum.ott.model.Content;
//import com.spectrum.ott.service.ContentService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//@RestController
//@RequestMapping("/api/contents")
//public class ContentController {
//
//    private final ContentService contentService;
//
//    public ContentController(ContentService contentService){
//        this.contentService=contentService;
//    }
//
//    @GetMapping("/find")
//    public List<Content> listContent() {
//        return contentService.searchAll();
//    }
//
//    @PostMapping("/create")
//    public Content createContent(Content content) {
//        return contentService.upload(content);
//    }
//}
