package com.maolabs.forms.internal.secondary.ports.http;

import com.maolabs.forms.internal.application.FormFieldOption;

import java.util.List;

public interface FormFieldOptionPort {
    List<FormFieldOption> findByFieldId(String fieldId) throws InterruptedException;
}
