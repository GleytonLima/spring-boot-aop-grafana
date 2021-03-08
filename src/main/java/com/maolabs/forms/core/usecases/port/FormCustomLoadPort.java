package com.maolabs.forms.core.usecases.port;

import com.maolabs.forms.core.domain.model.FormCustom;

public interface FormCustomLoadPort {
    FormCustom loadForm(String formId) throws InterruptedException;
}
