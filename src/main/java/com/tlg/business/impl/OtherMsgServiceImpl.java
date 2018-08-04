package com.tlg.business.impl;

import com.tlg.Entity.OtherMsg;
import com.tlg.business.OtherMsgService;
import com.tlg.dao.OtherMsgDao;
import com.tlg.dto.OtherMsgDto;
import com.tlg.request.OtherMsgReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jiechen on 2018/8/2.
 */
@Service
public class OtherMsgServiceImpl implements OtherMsgService {

    @Autowired
    private OtherMsgDao otherMsgDao;
    @Override
    public List<OtherMsgDto> findAll() {
        List<OtherMsgDto> otherMsgDtoList = otherMsgDao.findAll().stream()
                .map(this::getOtherMsgDto)
                .collect(Collectors.toList());
        return otherMsgDtoList;
    }

    @Override
    public void create(OtherMsgReq otherMsgReq) {

    }

    private OtherMsgDto getOtherMsgDto(OtherMsg otherMsg) {
        OtherMsgDto otherMsgDto = new OtherMsgDto();
        otherMsgDto.setId(otherMsg.getId());
        otherMsgDto.setTitle(otherMsg.getTitle());
        otherMsgDto.setEditor(otherMsg.getEditor());
        otherMsgDto.setCtr(otherMsg.getCtr());
        otherMsgDto.setOnShelfDate(otherMsg.getOnShelfDate());
        otherMsgDto.setOffShelfDate(otherMsg.getOffShelfDate());
        otherMsgDto.setUpdatedBy(otherMsg.getUpdatedBy());
        otherMsgDto.setUpdatedAt(otherMsg.getUpdatedAt());
        return otherMsgDto;
    }
}
