package com.zwh.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zwh.zapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
