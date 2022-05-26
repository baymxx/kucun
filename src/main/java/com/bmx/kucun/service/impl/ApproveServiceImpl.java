package com.bmx.kucun.service.impl;

import com.bmx.kucun.entity.ApproveEntity;
import com.bmx.kucun.mapper.ApproveMapper;
import com.bmx.kucun.service.ApproveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 审批表 服务实现类
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@Service
@AllArgsConstructor
public class ApproveServiceImpl extends ServiceImpl<ApproveMapper, ApproveEntity> implements ApproveService {

}
