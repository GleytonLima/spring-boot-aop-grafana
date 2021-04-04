package com.maolabs.forms.internal.primary.adapters;

import com.maolabs.forms.internal.application.Form;
import com.maolabs.forms.internal.secondary.ports.database.FormRepositoryPort;
import com.maolabs.forms.internal.secondary.ports.http.FormSchemaValidatorPort;
import com.maolabs.forms.internal.secondary.ports.http.FormStructurePort;
import com.maolabs.forms.internal.primary.ports.FormLoadPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FormLoadAdapter implements FormLoadPort {

    private FormRepositoryPort formRepositoryPort;
    private FormSchemaValidatorPort formSchemaValidatorPortMock;
    private FormStructurePort formStructurePortMock;

    @Override
    public Form loadForm(String formId) throws InterruptedException {
        var formCustom = formRepositoryPort.findById(formId);
        var formStructure = formStructurePortMock.findByFormId(formCustom.getId());
        formCustom.setFormStructure(formStructure);
        formSchemaValidatorPortMock.validate(formCustom);
        return formCustom;
    }
}
