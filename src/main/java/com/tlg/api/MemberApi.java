package com.tlg.api;

import com.tlg.Entity.Member;
import com.tlg.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tlg.dao.MemberDao;
import java.io.IOException;
import java.util.List;


/**
 * Created by JieChen on 2018/7/24.
 */
@Controller
public class MemberApi {
    @Autowired
    private MemberDao memberDao;

    //查詢會員列表
    @GetMapping("/members")
    public String list(Model model) throws IOException {
        List<Member> memberList = memberDao.findAll();
        model.addAttribute("members",memberList);
        return "member/list";

    }
}
