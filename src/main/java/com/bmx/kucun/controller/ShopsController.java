package com.bmx.kucun.controller;


import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@RestController
@AllArgsConstructor
@RequestMapping("/shops" )
@Api(value = "shops", tags = "店铺管理")
public class ShopsController {

}
