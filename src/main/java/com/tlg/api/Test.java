package com.tlg.api;

import com.tlg.dto.MemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by JieChen on 2018/9/17.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value ="/test",produces = "application/json")
public class Test {
    @RequestMapping(value = "/search" ,method = RequestMethod.POST)
    public Integer find(@RequestBody Integer id) {
        System.out.println(1231233122);
        return 123;
    }
}
