package com.maolabs.forms.core.adapters;

import com.maolabs.forms.core.domain.model.FormFieldOption;
import com.maolabs.forms.core.ports.FormFieldOptionService;
import com.maolabs.forms.web.config.aop.Monitor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Monitor
public class FormFieldOptionServiceMock implements FormFieldOptionService {
    public List<FormFieldOption> findByFieldId(String fieldId) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return Collections.emptyList();
    }
}
