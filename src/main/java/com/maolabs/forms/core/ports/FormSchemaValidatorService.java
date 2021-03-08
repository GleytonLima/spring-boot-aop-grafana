package com.maolabs.forms.core.ports;

import com.maolabs.forms.core.domain.model.FormCustom;

public interface FormSchemaValidatorService {
    boolean validate(FormCustom form) throws InterruptedException;
}
