package com.maolabs.forms.external.primary.http;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import com.maolabs.forms.internal.application.Form;
import com.maolabs.forms.internal.primary.ports.FormLoadPort;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {com.maolabs.forms.external.primary.http.FormController.class})
@ExtendWith(SpringExtension.class)
public class FormControllerTest {
    @Autowired
    private com.maolabs.forms.external.primary.http.FormController formController;

    @MockBean
    private FormLoadPort formLoadPort;

    @Test
    public void testLoadForm() throws Exception {
        when(this.formLoadPort.loadForm(anyString())).thenReturn(new Form("42"));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/forms/{id}", "value");
        MockMvcBuilders.standaloneSetup(this.formController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(Matchers.containsString("{\"id\":\"42\",\"titulo\":null,\"formStructure\":null}")));
    }
}

