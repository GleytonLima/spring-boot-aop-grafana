package com.maolabs.forms.internal.secondary.adapters.http;

import com.maolabs.forms.internal.application.Form;
import com.maolabs.forms.internal.application.Monitor;
import com.maolabs.forms.internal.secondary.ports.http.FormSchemaValidatorPort;

import java.util.concurrent.TimeUnit;

@Monitor
public class FormSchemaValidatorMockAdapter implements FormSchemaValidatorPort {
    public boolean validate(Form form) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return true;
    }
}
