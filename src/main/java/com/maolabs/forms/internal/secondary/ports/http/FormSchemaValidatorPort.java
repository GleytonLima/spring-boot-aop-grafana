package com.maolabs.forms.internal.secondary.ports.http;

import com.maolabs.forms.internal.application.Form;

public interface FormSchemaValidatorPort {
    boolean validate(Form form) throws InterruptedException;
}
