package com.maolabs.forms.internal.secondary.adapters.database;

import com.maolabs.forms.internal.application.Monitor;
import com.maolabs.forms.internal.application.Form;
import com.maolabs.forms.internal.secondary.ports.database.FormRepositoryPort;

import java.util.concurrent.TimeUnit;

@Monitor
public class FormRepositoryMockAdapter implements FormRepositoryPort {
    @Override
    public Form findById(String id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return new Form(id);
    }

    @Override
    public void update(Form form) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
}
