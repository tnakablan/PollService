package com.PollService.model;

public class Answer {
    private Integer userId;
    private Integer pollId;
    private AnswerNumber answerNumber;


    public Answer(Integer userId, Integer pollId, AnswerNumber answerNumber) {
        this.userId = userId;
        this.pollId = pollId;
        this.answerNumber = answerNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
    }

    public AnswerNumber getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(AnswerNumber answerNumber) {
        this.answerNumber = answerNumber;
    }
}
