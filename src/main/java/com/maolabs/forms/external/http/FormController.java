package com.maolabs.forms.external.primary.http;

import com.maolabs.forms.internal.application.Form;
import com.maolabs.forms.internal.primary.ports.FormLoadPort;
import lombok.AllArgsConstructor;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/forms")
@AllArgsConstructor
public class FormController {

    private FormLoadPort formLoadPort;

    @GetMapping("/{id}")
    public Form loadForm(@PathVariable String id) throws InterruptedException {
        MDC.put("requisicao_id", UUID.randomUUID().toString());
        return formLoadPort.loadForm(id);
    }
}
