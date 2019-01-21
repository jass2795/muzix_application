package com.stackroute.MuzixApplication1.applicationrunner_demo;

import com.stackroute.MuzixApplication1.domain.Track;
import com.stackroute.MuzixApplication1.repository.TrackRepository;
import com.stackroute.MuzixApplication1.service.TrackService;
import com.stackroute.MuzixApplication1.service.TrackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class application_demo implements ApplicationRunner
{
    private TrackRepository trackRepository;


    @Autowired
    public application_demo(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception
    {
    trackRepository.save(new Track(55,"michael jackson","quit111"));
    }
}
