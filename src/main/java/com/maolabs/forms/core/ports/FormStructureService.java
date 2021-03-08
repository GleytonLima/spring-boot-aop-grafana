package com.maolabs.forms.core.ports;

import com.maolabs.forms.core.domain.model.FormStructure;

public interface FormStructureService {
    FormStructure findByFormId(String id) throws InterruptedException;
}
