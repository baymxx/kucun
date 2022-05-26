package com.bmx.kucun.service.impl;

import com.bmx.kucun.entity.UsersEntity;
import com.bmx.kucun.mapper.UsersMapper;
import com.bmx.kucun.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@Service
@AllArgsConstructor
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersEntity> implements UsersService {

}
