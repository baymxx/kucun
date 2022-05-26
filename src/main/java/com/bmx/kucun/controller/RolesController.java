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
@RequestMapping("/roles" )
@Api(value = "roles", tags = "角色管理管理")
public class RolesController {

}
