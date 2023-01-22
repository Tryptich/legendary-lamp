package org.abodah.auth.controller;

import org.abodah.auth.model.HistoryModel;
import org.abodah.auth.model.TagModel;
import org.abodah.auth.response.ResponseHandler;
import org.abodah.auth.service.TagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TagController {

    private final TagService tagService;

    public TagController(TagService tagService){
        this.tagService = tagService;
    }

    @PostMapping("tags")
    public ResponseEntity tags(@RequestBody HistoryModel info){
        return ResponseHandler.generateResponse("", "ok", tagService.listTags());
    }

    @PostMapping("addTag")
    public ResponseEntity addTag(@RequestBody TagModel info){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }

    @PostMapping("removeTag")
    public ResponseEntity removeTag(@RequestBody TagModel info){

        return ResponseHandler.generateResponse("", "ok", new ArrayList<>());
    }

}
