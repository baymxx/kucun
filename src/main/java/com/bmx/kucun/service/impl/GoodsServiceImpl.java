package com.bmx.kucun.service.impl;

import com.bmx.kucun.entity.GoodsEntity;
import com.bmx.kucun.mapper.GoodsMapper;
import com.bmx.kucun.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@Service
@AllArgsConstructor
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, GoodsEntity> implements GoodsService {

}
