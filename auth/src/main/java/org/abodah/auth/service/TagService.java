package org.abodah.auth.service;

import java.util.List;
import java.util.stream.Collectors;

import org.abodah.auth.entities.Tag;
import org.abodah.auth.model.TagModel;
import org.abodah.auth.repository.TagRepository;
import org.springframework.stereotype.Service;

@Service
public class TagService {
    
    private final TagRepository tagRepository;

    public TagService(TagRepository repository){
        this.tagRepository = repository;
    }

    public List<TagModel> listTags(){
        return tagRepository.findAll()
                .stream()
                .map(tag -> toTagModel(tag)).collect(Collectors.toList());
    }

    private TagModel toTagModel(Tag tag) {
        TagModel model  = new TagModel();
        model.setUuid(tag.getUuid());
        model.setTagName(tag.getName());
        return model;
    }

    
}
