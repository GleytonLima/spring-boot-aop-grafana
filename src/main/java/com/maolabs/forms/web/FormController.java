package com.maolabs.forms.web;

import com.maolabs.forms.core.domain.model.FormCustom;
import com.maolabs.forms.core.usecases.port.FormCustomLoadPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forms")
@AllArgsConstructor
public class FormController {

    private FormCustomLoadPort formCustomLoadPort;

    @GetMapping("/{id}")
    public FormCustom greeting(@PathVariable String id) throws InterruptedException {
        return formCustomLoadPort.loadForm(id);
    }
}
