package com.liwa.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwa.project.model.entity.InterfaceInfo;
import com.liwa.project.model.entity.Post;

/**
* @author asus
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2022-10-30 16:43:02
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
