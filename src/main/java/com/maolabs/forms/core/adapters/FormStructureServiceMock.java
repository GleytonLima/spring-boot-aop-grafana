package com.maolabs.forms.core.adapters;

import com.maolabs.forms.core.domain.model.FormStructure;
import com.maolabs.forms.core.ports.FormStructureService;
import com.maolabs.forms.web.config.aop.Monitor;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Monitor
public class FormStructureServiceMock implements FormStructureService {
    public FormStructure findByFormId(String id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return new FormStructure();
    }
}
