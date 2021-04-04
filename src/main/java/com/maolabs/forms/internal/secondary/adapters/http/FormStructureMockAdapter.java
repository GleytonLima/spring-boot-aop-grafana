package com.maolabs.forms.internal.secondary.adapters.http;

import com.maolabs.forms.internal.application.FormStructure;
import com.maolabs.forms.internal.application.Monitor;
import com.maolabs.forms.internal.secondary.ports.http.FormStructurePort;

import java.util.concurrent.TimeUnit;

@Monitor
public class FormStructureMockAdapter implements FormStructurePort {
    public FormStructure findByFormId(String id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return new FormStructure();
    }
}
