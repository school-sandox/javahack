package com.raif.service.front;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для взаимодействия с фронтом.
 */
@RestController
public class SelfEmployedController {


    @RequestMapping(value = "/selfemployed/user", method = RequestMethod.PUT)
    public Boolean saveData(@RequestBody UserInfo userInfo) {

        return true;
    }
}
