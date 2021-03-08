package com.maolabs.forms.core.adapters;
import com.maolabs.forms.core.domain.model.FormCustom;
import com.maolabs.forms.core.ports.FormSchemaValidatorService;
import com.maolabs.forms.web.config.aop.Monitor;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Monitor
public class FormSchemaValidatorServiceMock implements FormSchemaValidatorService {
    public boolean validate(FormCustom form) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return  true;
    }
}
