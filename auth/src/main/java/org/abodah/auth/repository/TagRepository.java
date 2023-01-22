package org.abodah.auth.repository;

import org.abodah.auth.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
    
}
