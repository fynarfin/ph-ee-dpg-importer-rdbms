package org.mifos.pheedpgimporterrdbms.entity.variable;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VariableRepository extends CrudRepository<Variable, String> {

    List<Variable> findByWorkflowInstanceKey(String workflowInstanceKey);

}
