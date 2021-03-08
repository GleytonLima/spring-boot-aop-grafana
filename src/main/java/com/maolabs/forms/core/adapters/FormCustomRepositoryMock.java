package com.maolabs.forms.core.adapters;

import com.maolabs.forms.core.domain.model.FormCustom;
import com.maolabs.forms.core.ports.FormCustomRepository;
import com.maolabs.forms.web.config.aop.Monitor;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Monitor
public class FormCustomRepositoryMock implements FormCustomRepository {
    @Override
    public FormCustom findById(String id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return new FormCustom(id);
    }

    @Override
    public void update(FormCustom formCustom) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
}
