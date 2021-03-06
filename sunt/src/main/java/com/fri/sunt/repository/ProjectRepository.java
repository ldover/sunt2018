package com.fri.sunt.repository;


import com.fri.sunt.entity.Author;
import com.fri.sunt.entity.Project;
import com.fri.sunt.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:3000"}, methods = {RequestMethod.GET})
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Optional<Project> findByOrderIndex(int index);

    List<Project> findAllByTheme(Theme theme);

    List<Project> findAllByAuthor(Author author);
}
