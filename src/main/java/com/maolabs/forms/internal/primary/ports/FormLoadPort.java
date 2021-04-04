package com.maolabs.forms.internal.primary.ports;

import com.maolabs.forms.internal.application.Form;

public interface FormLoadPort {
    Form loadForm(String formId) throws InterruptedException;
}
