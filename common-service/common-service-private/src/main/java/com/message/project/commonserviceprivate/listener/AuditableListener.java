package com.message.project.commonserviceprivate.listener;

import com.message.project.commonserviceprivate.entity.Auditable;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public class AuditableListener {

    @PrePersist
    private void preCreated(Object object) {
        if (object instanceof Auditable) {
            Auditable auditable = (Auditable) object;
            auditable.setCreatedDate(LocalDateTime.now());
        }
    }

    @PreUpdate
    private void preModified(Object object) {
        if (object instanceof Auditable) {
            Auditable auditable = (Auditable) object;
            auditable.setModifiedDate(LocalDateTime.now());
        }
    }
}
