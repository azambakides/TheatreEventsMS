package com.andraea.theatreeventsms.service;

import com.andraea.theatreeventsms.model.Show;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShowServiceImplTest {

    @Autowired
    ShowService showService;

    @Test
    void test_getAllShows() {
        List<Show> showList = showService.getAllShows();
        assertNotNull(showList);
        assertTrue(showList.size() > 0);
    }

    @Test
    void test_getShowsById() {
        Show show = showService.getShowsById(1L);
        assertNotNull(show);
        Show showNotInDB = showService.getShowsById(999L);
        assertNull(showNotInDB);
    }

}