package com.maolabs.forms.internal.application;

import lombok.Data;

@Data
public class Form {
    public Form(String id) {
        this.id = id;
    }
    private String id;
    private String titulo;
    private FormStructure formStructure;
}
