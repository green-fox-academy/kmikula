package com.greenfoxacademy.rest.controllers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.nio.charset.Charset;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RController.class)
public class RControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doubling() throws Exception {
        mockMvc.perform(get("/doubling")
                .contentType(MediaType.APPLICATION_JSON)
                .content("6"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect((ResultMatcher) jsonPath("$.result", is("success")))
                .andExpect(content().string("12"));
    }

//    @Test
//    public void greeterMethod() {
//    }
//
//    @Test
//    public void appendStrings() {
//    }
//
//    @Test
//    public void doUntil() {
//    }
//
//    @Test
//    public void arrayHandler() {
//    }
}