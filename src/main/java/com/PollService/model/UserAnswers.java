package com.PollService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserAnswers {

    private Integer userId;
    @JsonProperty(value = "answers")
    private List<Answer> userAnswers;

    public UserAnswers(Integer userId, List<Answer> userAnswers) {
        this.userId = userId;
        this.userAnswers = userAnswers;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Answer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<Answer> userAnswers) {
        this.userAnswers = userAnswers;
    }
}
