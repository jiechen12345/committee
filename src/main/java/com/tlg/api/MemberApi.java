package com.tlg.api;

import com.tlg.Entity.Member;
import com.tlg.business.MemberService;
import com.tlg.dao.MemberDao;
import com.tlg.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;


/**
 * Created by JieChen on 2018/7/24.
 */
@Controller
public class MemberApi {

    @Autowired
    private MemberService memberService;
    //查詢會員列表
    @GetMapping("/members")
    public String list(Model model) throws IOException {
        List<MemberDto> memberDtoList=memberService.findAll();
        model.addAttribute("members",memberDtoList);
        return "member/list";

    }


}
