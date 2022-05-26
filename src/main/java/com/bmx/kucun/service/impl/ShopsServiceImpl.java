package com.bmx.kucun.service.impl;

import com.bmx.kucun.entity.ShopsEntity;
import com.bmx.kucun.mapper.ShopsMapper;
import com.bmx.kucun.service.ShopsService;
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
public class ShopsServiceImpl extends ServiceImpl<ShopsMapper, ShopsEntity> implements ShopsService {

}
