package com.PollService.controller;

import com.PollService.model.AnswerNumber;
import com.PollService.model.UserAnswers;
import com.PollService.service.AnswersService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping(value = "/answers")
public class AnswersController {

    @Autowired
    private AnswersService answersService;
    private static final Logger logger = LoggerFactory.getLogger((AnswersController.class));
    @PostMapping(value = "/create")
    public void createAnswers(@RequestBody UserAnswers userAnswers) throws JsonProcessingException {
        answersService.createAnswers(userAnswers);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteAnswersByUserId(@PathVariable(value = "id") Integer userId, @RequestHeader(value = "delToken") String delToken) {
        answersService.deleteAnswers(userId, delToken);
    }
//all 5 responses.
    @GetMapping(value = "/static/1")
    public Map<AnswerNumber, Integer> getUsersChosenByPoll(@RequestParam(value = "id") Integer pollId) {
        return answersService.getUsersChosenByPoll(pollId);
    }
    @GetMapping(value = "/static/2")
    public Integer getUsersAnswerByPoll(@RequestParam(value = "id") Integer pollId) {
        return answersService.getUsersAnswerByPoll(pollId);
    }
    @GetMapping(value = "/static/3")
    public Map<Integer, AnswerNumber> getAnswerEachPollByUser(@RequestParam(value = "id") Integer userId) {
        return answersService.getAnswerEachPollByUser(userId);
    }
    @GetMapping(value = "/static/4")
    public Integer getAnswersByUser(@RequestParam(value = "id") Integer userId) {
        return answersService.getAnswersByUser(userId);
    }
    @GetMapping(value = "/static/5")
    public List<Map<AnswerNumber, Integer>> getAllAnswersEachPollEachOption() {
        return answersService.getAllAnswerEachPollEachOption();
    }
}
