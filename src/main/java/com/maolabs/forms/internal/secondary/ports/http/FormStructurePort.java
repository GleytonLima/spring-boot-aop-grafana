package com.maolabs.forms.internal.secondary.ports.http;

import com.maolabs.forms.internal.application.FormStructure;

public interface FormStructurePort {
    FormStructure findByFormId(String id) throws InterruptedException;
}
