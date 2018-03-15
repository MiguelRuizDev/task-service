package org.activiti.incubator.taskservice;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource (collectionResourceRel = "tasks", path = "tasks")
public interface TaskRepository extends PagingAndSortingRepository <Task, Long>//thanks to this, we have find by ID

{

    List<Task> findByTitle(@Param("title") String title);

    //List<Task> findByCreationDate(@Param("creationDate") Date creation_date);

    //List<Task> findByDueDate(@Param("dueDate") Date due_date);

    List<Task> findByAssignedUser(@Param("assignedUser") String name);

    List<Task> findByPriority(@Param("priority") int priority);

    List<Task> findByParent(@Param("parent") long parent_id);

    //should there be a findByChild???

}


