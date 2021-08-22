package com.andraea.theatreeventsms.controller;

import com.andraea.theatreeventsms.repository.ShowRepository;
import com.andraea.theatreeventsms.service.ShowService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.web.servlet.ModelAndView;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ShowController.class)
class ShowControllerTest {

    @Autowired
    protected MockMvc mockMvc;

    @MockBean
    private ShowRepository showRepository;

    @MockBean
    private ShowService showService;

    @Test
    void inputSubmit() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/TheatreEvents"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attribute("showList", Matchers.notNullValue()));

        MvcResult mvcResult = resultActions.andReturn();
        ModelAndView mv = mvcResult.getModelAndView();
    }
}