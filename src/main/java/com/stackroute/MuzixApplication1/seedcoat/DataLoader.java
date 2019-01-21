package com.stackroute.MuzixApplication1.seedcoat;

import com.stackroute.MuzixApplication1.domain.Track;
import com.stackroute.MuzixApplication1.repository.TrackRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import com.stackroute.MuzixApplication1.domain.Track;
@Component

public class DataLoader implements CommandLineRunner
{


   // private final Logger logger= LoggerFactory.getLogger(DataLoader.class);

    private TrackRepository trackRepository;
@Autowired
public DataLoader(TrackRepository trackRepository)
{
    this.trackRepository=trackRepository;
}


    @Override
    public void run(String... args) throws Exception
    {
//logger.info("loading data");
//       Track t1= Track.builder().id(1).name("jasleen kaur").comment("achaaa how are you??").build();
//       trackRepository.save(t1);

       trackRepository.save(new Track(1,"abc","nice"));
trackRepository.save(new Track(2,"xcv","good"));
trackRepository.save(new Track(3,"qwerty","ver nice"));
trackRepository.save(new Track(4,"pop singer1","quit playing games"));

    }
}
