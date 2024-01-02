package com.PollService.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient (
        name = "UserProject",
        url = "${UserProject.url}"
)
public interface UserService {
    @GetMapping(value = "/user/confirm/{id}")
    Boolean checkUserConfirmed(@PathVariable(value = "id") Integer  userId);
    @GetMapping(value = "/user/register/{id}")
    Boolean checkUserRegistration(@PathVariable(value = "id") Integer  userId);
}
