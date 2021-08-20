package com.andraea.theatreeventsms.service;

import com.andraea.theatreeventsms.model.Show;
import com.andraea.theatreeventsms.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    ShowRepository showRepository;

    @Override
    public List<Show> getAllShows() {
        List<Show> show = new ArrayList<>();
        show = showRepository.findAll();
        return show;
    }

    @Override
    public Show getShowsById(Long id) {
        Optional<Show> show = showRepository.findById(id);
        return show.orElse(null);
    }

    @Override
    public void saveOrUpdate(Show show) {
        showRepository.save(show);
    }

    @Override
    public void delete(Long id) {
        showRepository.deleteById(id);
    }
}
