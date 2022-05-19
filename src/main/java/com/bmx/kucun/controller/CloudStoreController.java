package com.bmx.kucun.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bmx.kucun.common.R;
import com.bmx.kucun.entity.CloudStore;
import com.bmx.kucun.service.CloudStoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: code generator
 * @Date: 2022/5/16
 */
@RestController
@AllArgsConstructor
@RequestMapping("/cloudstore" )
@Api(value = "cloudstore", tags = "云店修改记录管理")
public class CloudStoreController {

    private CloudStoreService cloudStoreService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param cloudStore 云店修改记录
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R<IPage<CloudStore>> getCloudStorePage(Page page, CloudStore cloudStore) {
        return R.ok(cloudStoreService.page(page, Wrappers.query(cloudStore)));
    }

    /**
     * 通过id查询云店修改记录
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{id}" )
    public R<CloudStore> getById(@PathVariable("id" ) Integer id) {
        return R.ok(cloudStoreService.getById(id));
    }

    /**
     * 新增云店修改记录
     * @param cloudStore 云店修改记录
     * @return R
     */
    @ApiOperation(value = "新增云店修改记录", notes = "新增云店修改记录")
    @PostMapping
    @PreAuthorize("@pms.hasPermission('mall_cloudstore_add')" )
    public R<Boolean> save(@RequestBody CloudStore cloudStore) {
        return R.ok(cloudStoreService.save(cloudStore));
    }

    /**
     * 修改云店修改记录
     * @param cloudStore 云店修改记录
     * @return R
     */
    @ApiOperation(value = "修改云店修改记录", notes = "修改云店修改记录")
    @PutMapping
    @PreAuthorize("@pms.hasPermission('mall_cloudstore_edit')" )
    public R<Boolean> updateById(@RequestBody CloudStore cloudStore) {
        return R.ok(cloudStoreService.updateById(cloudStore));
    }

    /**
     * 通过id删除云店修改记录
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id删除云店修改记录", notes = "通过id删除云店修改记录")
    @DeleteMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('mall_cloudstore_del')" )
    public R<Boolean> removeById(@PathVariable Integer id) {
        return R.ok(cloudStoreService.removeById(id));
    }

}
