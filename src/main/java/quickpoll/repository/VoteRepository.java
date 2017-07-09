package quickpoll.repository;

import com.quickpoll.Vote;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by brianmullin on 7/8/17.
 */
public interface VoteRepository extends CrudRepository<Vote, Long> {
    
}
