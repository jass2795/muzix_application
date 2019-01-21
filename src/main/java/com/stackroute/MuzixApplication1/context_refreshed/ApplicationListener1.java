package com.stackroute.MuzixApplication1.context_refreshed;

import com.stackroute.MuzixApplication1.domain.Track;
import com.stackroute.MuzixApplication1.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.context.event.ContextRefreshedEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@Component
public class ApplicationListener1 implements ApplicationListener<ContextRefreshedEvent>
{
    private TrackRepository trackRepository;
@Autowired
    public ApplicationListener1(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        trackRepository.save(new Track(66,"bob marley","gudy gudy"));
        trackRepository.save(new Track(88,"abc","qwert7"));
    }
}
