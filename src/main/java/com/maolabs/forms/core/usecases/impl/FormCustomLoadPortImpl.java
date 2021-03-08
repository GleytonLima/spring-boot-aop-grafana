package com.maolabs.forms.core.usecases.impl;

import com.maolabs.forms.core.domain.model.FormCustom;
import com.maolabs.forms.core.ports.FormCustomRepository;
import com.maolabs.forms.core.ports.FormSchemaValidatorService;
import com.maolabs.forms.core.ports.FormStructureService;
import com.maolabs.forms.core.usecases.port.FormCustomLoadPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FormCustomLoadPortImpl implements FormCustomLoadPort {

    private FormCustomRepository formCustomRepository;
    private FormSchemaValidatorService formSchemaValidatorServiceMock;
    private FormStructureService formStructureServiceMock;

    @Override
    public FormCustom loadForm(String formId) throws InterruptedException {
        var formCustom = formCustomRepository.findById(formId);
        var formStructure = formStructureServiceMock.findByFormId(formCustom.getId());
        formCustom.setFormStructure(formStructure);
        formSchemaValidatorServiceMock.validate(formCustom);
        return formCustom;
    }
}
