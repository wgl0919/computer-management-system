package com.gxnu.service;

import com.gxnu.pojo.Machine;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gxnu.pojo.MachineInfo;
import com.gxnu.pojo.PortalVo;
import com.gxnu.utils.Result;

/**
* @author 王功磊
* @description 针对表【machine】的数据库操作Service
* @createDate 2024-07-07 11:53:03
*/
public interface MachineService extends IService<Machine> {

    Result findNewPage(PortalVo portalVo);


    Result addMachine(Machine machine);

    Result delMachine(String computerId);

    Result findRoomMachines(String roomId);

    Result modifyMachine(Machine machine);

    Machine findMachine(Integer machineId);

    void delMachineByRoomId(String roomId);
}
