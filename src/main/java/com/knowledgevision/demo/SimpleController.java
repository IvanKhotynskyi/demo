package com.knowledgevision.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(value = "/session/user-details", produces = MediaType.APPLICATION_JSON_VALUE)
//    @CrossOrigin(origins = "http://localhost:8080")
    public String getUser() {
        return "{\"user_id\":20042,\"name\":\"Vadym Ocheretenyuk\",\"first_name\":\"Vadym\",\"last_name\":\"Ocheretenyuk\"," +
                "\"email\":\"vadym.ocheretenyuk@openexc.com\",\"auth_provider\":\"Knowledge Vision\",\"secret_key\":\"a3jr6EimQYV5\"," +
                "\"last_login\":\"2021-06-14T08:10:01Z\",\"user_agreement\":true,\"roles\":[{\"role_id\":20,\"role_name\":\"System Administrator\"}]}";
    }
}
