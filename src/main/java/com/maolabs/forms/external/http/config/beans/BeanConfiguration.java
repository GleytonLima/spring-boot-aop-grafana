package com.maolabs.forms.external.primary.http.config.beans;

import com.maolabs.forms.AopApplication;
import com.maolabs.forms.internal.primary.adapters.FormLoadAdapter;
import com.maolabs.forms.internal.primary.ports.FormLoadPort;
import com.maolabs.forms.internal.secondary.adapters.database.FormRepositoryMockAdapter;
import com.maolabs.forms.internal.secondary.adapters.http.FormSchemaValidatorMockAdapter;
import com.maolabs.forms.internal.secondary.adapters.http.FormStructureMockAdapter;
import com.maolabs.forms.internal.secondary.ports.database.FormRepositoryPort;
import com.maolabs.forms.internal.secondary.ports.http.FormSchemaValidatorPort;
import com.maolabs.forms.internal.secondary.ports.http.FormStructurePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AopApplication.class)
public class BeanConfiguration {
    @Bean
    FormStructurePort formStructurePort() {
        return new FormStructureMockAdapter();
    }

    @Bean
    FormSchemaValidatorPort formSchemaValidatorPort() {
        return new FormSchemaValidatorMockAdapter();
    }

    @Bean
    FormRepositoryPort formRepositoryPort() {
        return new FormRepositoryMockAdapter();
    }

    @Bean
    FormLoadPort formLoadPort(FormStructurePort formStructurePort, FormSchemaValidatorPort formSchemaValidatorPort, FormRepositoryPort formRepositoryPort) {
        return new FormLoadAdapter(formRepositoryPort, formSchemaValidatorPort, formStructurePort);
    }
}
