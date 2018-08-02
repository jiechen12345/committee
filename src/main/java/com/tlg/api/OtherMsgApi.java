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

    //查詢他訊息
    @GetMapping("/members")
    public String list(Model model) {
        List<OtherMsgDto> memberDtoList = otherMsgService.findAll();
        model.addAttribute("members", memberDtoList);
        return "member/list";

    }

    //新增其他訊息
    @PostMapping("/otherMsg")
    public void AddModal(OtherMsgReq otherMsgReq) throws IOException {
        System.out.println(otherMsgReq.toString());
        //return "redirect:/members.html";
    }
}
