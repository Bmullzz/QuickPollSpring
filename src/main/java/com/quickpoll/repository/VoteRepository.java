package com.quickpoll.repository;

import com.quickpoll.entity.Vote;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by brianmullin on 7/8/17.
 */
public interface VoteRepository extends CrudRepository<Vote, Long> {

}
