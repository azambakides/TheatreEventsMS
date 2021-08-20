package com.andraea.theatreeventsms.service;

import com.andraea.theatreeventsms.model.Show;

import java.util.List;

public interface ShowService {
    //Gets the shows that being selected for the database
    public List<Show> getAllShows();
    //Creates an ID to be stored in the database
    public Show getShowsById(Long id);
    //Allows the shows to be saved in the database
    public void saveOrUpdate(Show show);
    //Allows a show to be deleted from the database
    public void delete(Long id);
}
