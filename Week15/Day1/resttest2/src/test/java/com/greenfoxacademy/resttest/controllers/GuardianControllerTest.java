package com.greenfoxacademy.resttest.controllers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void groot_translation() throws Exception {
        mockMvc.perform(get("/groot?received=test")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect( jsonPath("$.received", is("test")))
                .andExpect( jsonPath("$.translated", is("I am groot")));
    }

    @Test
    public void groot_translationNoInput() throws Exception {
        mockMvc.perform(get("/groot?received="))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect( jsonPath("$.error", is("I am groot")));
    }

}

