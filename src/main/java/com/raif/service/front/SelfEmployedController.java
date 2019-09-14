package com.raif.service.front;

import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для взаимодействия с фронтом.
 */
@RestController
@RequestMapping(value = "/selfemployed")
public class SelfEmployedController {


    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public Boolean saveData(@PathVariable Integer id,
                            @RequestBody UserInfo userInfo) {
        System.out.println("URA, RABOTAET NAHOOI!");
        System.out.println(id);
        System.out.println(userInfo.getInn());
        return true;
    }
}
