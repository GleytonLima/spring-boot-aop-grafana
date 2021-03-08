package com.maolabs.forms.core.domain.model;

import lombok.Data;

@Data
public class FormCustom {
    public FormCustom(String id) {
        this.id = id;
    }
    private String id;
    private String titulo;
    private FormStructure formStructure;
}
