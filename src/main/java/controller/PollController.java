package controller;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import quickpoll.repository.PollRepository;

/**
 * Created by brianmullin on 7/8/17.
 */
public class PollController {

    @Autowired
    private PollRepository pollRepository;

}
