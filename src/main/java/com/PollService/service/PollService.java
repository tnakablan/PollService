package com.PollService.service;

import com.PollService.model.Poll;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface PollService {
    public void createPoll(Poll poll) throws JsonProcessingException;
    public Poll readPoll(Integer id);
    public void updatePoll(Poll poll);
    public void deletePoll(Integer id);
    public List<Poll> readAllPoll(Integer idRequest);
}
