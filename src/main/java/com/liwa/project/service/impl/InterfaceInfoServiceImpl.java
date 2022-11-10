package com.liwa.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwa.project.common.ErrorCode;
import com.liwa.project.exception.BusinessException;
import com.liwa.project.mapper.InterfaceInfoMapper;

import com.liwa.project.service.InterfaceInfoService;
import com.liwa.project.model.entity.InterfaceInfo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author asus
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2022-10-30 16:43:02
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();

        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() >50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }

    }

}




