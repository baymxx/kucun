package com.bmx.kucun.service.impl;

import com.bmx.kucun.entity.ImgsEntity;
import com.bmx.kucun.mapper.ImgsMapper;
import com.bmx.kucun.service.ImgsService;
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
public class ImgsServiceImpl extends ServiceImpl<ImgsMapper, ImgsEntity> implements ImgsService {

}
