package com.PollService.repository;

import com.PollService.model.Answer;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public interface AnswerRepository {
    public void createAnswer(Answer answer, Integer userId);
    public void deleteAnswers(Integer userId);





    public List<Answer> readAllAnswersByPollId(Integer pollId) throws EmptyResultDataAccessException;
    public List<Answer> readAllAnswersByUserId(Integer userId) throws EmptyResultDataAccessException;


}
