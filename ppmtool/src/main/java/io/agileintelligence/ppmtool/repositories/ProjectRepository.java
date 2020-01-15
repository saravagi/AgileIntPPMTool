package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
   Project findByProjectIdentifier(String projectId);
   //where is the logic written for findByProjectIdentifier
    //findBy is only used is the coloumn is unique
}
