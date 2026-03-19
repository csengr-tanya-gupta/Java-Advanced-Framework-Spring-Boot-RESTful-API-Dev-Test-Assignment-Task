package university_management_system.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import university_management_system.model.entity.University;

@RepositoryRestResource
public interface UniversityRepository extends JpaRepository<University, Integer>{

}
