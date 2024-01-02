package com.PollService.repository.mapper;

import com.PollService.model.Answer;
import com.PollService.model.AnswerNumber;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component

public class AnswerMapper implements RowMapper<Answer> {
    @Override
    public Answer mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Answer (
                rs.getInt("user_id"),
                rs.getInt("poll_id"),
                AnswerNumber.valueOf(rs.getString("answer_number"))
        );
    }





}
