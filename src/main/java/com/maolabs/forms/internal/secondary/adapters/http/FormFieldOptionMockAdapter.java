package com.maolabs.forms.internal.secondary.adapters.http;

import com.maolabs.forms.internal.application.FormFieldOption;
import com.maolabs.forms.internal.application.Monitor;
import com.maolabs.forms.internal.secondary.ports.http.FormFieldOptionPort;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Monitor
public class FormFieldOptionMockAdapter implements FormFieldOptionPort {
    public List<FormFieldOption> findByFieldId(String fieldId) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return Collections.emptyList();
    }
}
