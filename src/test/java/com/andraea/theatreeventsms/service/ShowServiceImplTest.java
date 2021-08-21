package com.andraea.theatreeventsms.service;

import com.andraea.theatreeventsms.model.Show;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShowServiceImplTest {

    @Autowired
    ShowService showService;

//    @Test
//    void getAllShows() {
//        Show show = showService.getAllShows();
//        assertNotNull(show);
//        Show showNotInDB = showService.getAllShows();
//        assertNull(showNotInDB);
//    }

    @Test
    void getShowsById() {
        Show show = showService.getShowsById(1L);
        assertNotNull(show);
        Show showNotInDB = showService.getShowsById(999L);
        assertNull(showNotInDB);
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void delete() {
    }
}