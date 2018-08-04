package com.tlg.api;

import com.tlg.business.OtherMsgService;
import com.tlg.dto.MemberDto;
import com.tlg.dto.OtherMsgDto;
import com.tlg.request.OtherMsgReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by jiechen on 2018/8/2.
 */
@Controller
public class OtherMsgApi {
    @Autowired
    private OtherMsgService otherMsgService;

    //查詢其他訊息
    @GetMapping("/otherMsgs")
    public String list(Model model) {
        List<OtherMsgDto> otherMsgDtoList = otherMsgService.findAll();
        model.addAttribute("otherMsgs", otherMsgDtoList);
        return "otherMsg/otherMsgList";

    }
    //toAddOtherMsg
    @GetMapping("/otherMsg")
    public String toAddOtherMsg(Model model) {
        return "otherMsg/addOtherMsg";

    }

    //新增其他訊息
    @PostMapping("/otherMsg")
    public String AddModal(OtherMsgReq otherMsgReq) throws IOException {
        System.out.println(otherMsgReq.toString());
        return "redirect:/otherMsgs";
    }
}
