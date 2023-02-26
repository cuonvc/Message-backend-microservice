package com.message.project.commonserviceprivate.utils;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.boot.model.relational.Database;
import org.hibernate.boot.model.relational.SqlStringGenerationContext;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.UUID;

public class CustomGeneratorId implements IdentifierGenerator {

    private String UUID_SUBSTRING = UUID.randomUUID().toString().substring(0, 7);

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) throws HibernateException {

        StringBuilder builder = new StringBuilder();

        return builder.append(UUID_SUBSTRING);
    }
}
