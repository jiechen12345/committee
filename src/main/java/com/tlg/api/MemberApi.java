package com.tlg.api;

import com.tlg.Entity.Departemt;
import com.tlg.business.MemberService;
import com.tlg.dao.DepartmentDao;
import com.tlg.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;


/**
 * Created by JieChen on 2018/7/24.
 */
@Controller
public class MemberApi {
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private MemberService memberService;

    //查詢會員列表
    @GetMapping("/members")
    public String list(Model model) {
        List<MemberDto> memberDtoList = memberService.findAll();
        model.addAttribute("members", memberDtoList);
        return "member/list";

    }

    @GetMapping("/member")
    public String toAddModal(Model model) throws IOException {
//        List<Departemt> departments = departmentDao.findAll();
//        model.addAttribute("departments", departments);
        model.addAttribute("aaa","123");
        return "member/list::modalContens";

    }
}
