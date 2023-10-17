package org.mifos.pheedpgimporterrdbms.entity.task;


import org.mifos.pheedpgimporterrdbms.entity.parent.AbstractPersistableCustom;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Entity
@Table(name = "tasks")
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
public class Task extends AbstractPersistableCustom<Long> {

    @Column(name = "WORKFLOW_KEY")
    private Long workflowKey;
    @Column(name = "WORKFLOW_INSTANCE_KEY")
    private String workflowInstanceKey;
    @Column(name = "TIMESTAMP")
    private Long timestamp;
    @Column(name = "INTENT")
    private String intent;
    @Column(name = "RECORD_TYPE")
    private String recordType;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "ELEMENT_ID")
    private String elementId;
}
