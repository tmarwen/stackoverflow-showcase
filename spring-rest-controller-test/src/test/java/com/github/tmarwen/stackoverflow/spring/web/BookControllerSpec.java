package com.github.tmarwen.stackoverflow.spring.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class BookControllerSpec {

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new BookController()).build();
    }

    @Test
    public void testBookCreation() throws Exception {
         mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/books/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(
                                "{\"name\":\"Java Networking\",\"authorName\":\"Eliott Rusty Harold\",\"isbn\":\"custom-isbn\"}"
                        )
        ).andExpect(
                MockMvcResultMatchers.status().isCreated()
        ).andExpect(
                MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.authorName").exists()
        ).andDo((result) -> {
            System.err.println(result.getResolvedException());
            System.out.println(result.getResponse());
        }).andReturn();
    }
}
