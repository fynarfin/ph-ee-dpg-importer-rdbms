package org.mifos.pheedpgimporterrdbms.entity.task;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findByWorkflowInstanceKey(String workflowInstanceKey);

}
