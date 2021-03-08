package com.maolabs.forms.core.ports;

import com.maolabs.forms.core.domain.model.FormCustom;

public interface FormCustomRepository {
    FormCustom findById(String id) throws InterruptedException;
    void update(FormCustom formCustom) throws InterruptedException;
}
