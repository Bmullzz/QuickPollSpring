package quickpoll.repository;

import com.quickpoll.Poll;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by brianmullin on 7/8/17.
 */
public interface PollRepository extends CrudRepository<Poll, Long> {

}
