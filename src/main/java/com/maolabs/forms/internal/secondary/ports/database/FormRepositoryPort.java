package com.maolabs.forms.internal.secondary.ports.database;

import com.maolabs.forms.internal.application.Form;

public interface FormRepositoryPort {
    Form findById(String id) throws InterruptedException;
    void update(Form form) throws InterruptedException;
}
