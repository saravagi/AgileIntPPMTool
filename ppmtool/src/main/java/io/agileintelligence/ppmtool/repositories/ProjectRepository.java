package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProjectRepository extends CrudRepository<Project, Long> {
   Project findByProjectIdentifier(String projectId);
   //where is the logic written for findByProjectIdentifier
    //findBy is only used is the coloumn is unique

   @Override
   Iterable<Project> findAll();
   // we use iterable when we are getting a list in return . Here we are getting Json objects list so we use iterable.




}
