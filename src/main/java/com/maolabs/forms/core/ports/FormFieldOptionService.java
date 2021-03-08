package com.maolabs.forms.core.ports;

import com.maolabs.forms.core.domain.model.FormFieldOption;

import java.util.List;

public interface FormFieldOptionService {
    List<FormFieldOption> findByFieldId(String fieldId) throws InterruptedException;
}
