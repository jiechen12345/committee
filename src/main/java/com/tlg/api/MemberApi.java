package com.tlg.api;

import com.tlg.Entity.Departemt;
import com.tlg.business.MemberService;
import com.tlg.dao.DepartmentDao;
import com.tlg.dto.MemberDto;
import com.tlg.request.MemberReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.LinkedList;
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

    @GetMapping("/toAddMember")
    public String toAddModal(Model model) throws IOException {
       List<Departemt> departments = departmentDao.findAll();
        model.addAttribute("depts",departments);
        return "member/list::addModalContens";

    }

    //新增會員
    @RequestMapping(value ="/member",produces = "application/json",method = RequestMethod.POST)
    public String AddModal(@RequestBody MemberReq memberReq,Model model) throws IOException {
       System.out.println("**** "+memberReq.toString());
       memberService.create(memberReq);
        List<MemberDto> memberDtoList = memberService.findAll();
        model.addAttribute("members", memberDtoList);
       return "member/list";
        //return "redirect:/members.html";
    }

    @RequestMapping(value ="/toModifyMember/{id}",method = RequestMethod.GET)
    public String toModifyModal(@PathVariable Integer id,Model model) throws IOException {
        System.out.println("******** "+id.toString());
        MemberDto memberDto = memberService.findOne(id);
        List<Departemt> departments = departmentDao.findAll();
        model.addAttribute("depts",departments);
        model.addAttribute("memberDto",memberDto);
        return "member/list::modifyModalContens";

    }
}
