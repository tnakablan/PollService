package com.PollService.service;
import com.PollService.model.AnswerNumber;
import com.PollService.model.UserAnswers;
import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.List;
import java.util.Map;
public interface AnswersService {
    public void createAnswers(UserAnswers userAnswers) throws JsonProcessingException;
    public void deleteAnswers(Integer userId, String delToken);

    public Map<AnswerNumber,Integer> getUsersChosenByPoll(Integer pollId);
    public Integer getUsersAnswerByPoll(Integer pollId);
    public Map<Integer, AnswerNumber> getAnswerEachPollByUser(Integer userId);
    public Integer getAnswersByUser(Integer userId);
    public List<Map<AnswerNumber, Integer>> getAllAnswerEachPollEachOption();



}
