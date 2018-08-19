package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.RestApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));


   private MockMvc mockMvc;


    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void doublingWorksProperly() throws Exception {

        mockMvc.perform(get("/doubling?input=6"))
         .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is(6)))
                .andExpect(jsonPath("$.result", is(12)));
    }

    @Test
    public void doublingWithoutInput() throws Exception {

        mockMvc.perform(get("/doubling?input="))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void greeterMethodWorksProperly() throws Exception {

        mockMvc.perform(get("/greeter?name=Petike&title=student"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.name", is("Petike")))
                .andExpect(jsonPath("$.title", is("student")))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));

    }

    @Test
    public void greeterMethodMissingInput() throws Exception {

        mockMvc.perform(get("/greeter?name=&title="))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));


    }


}