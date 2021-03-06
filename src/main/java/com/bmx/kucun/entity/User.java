package com.bmx.kucun.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @Author: code generator
 * @Date: 2022/5/12
 */
@Data
@TableName("mall_cloud_store")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户")
public class User extends Model<User> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    @ApiModelProperty(value="主键Id")
    private Integer id;

    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 所属店铺id
     */
    @ApiModelProperty(value="所属店铺id")
    private Integer shopId;

    /**
     * 所属店铺名
     */
    @ApiModelProperty(value="所属店铺名")
    private String shopName;

    /**
     * 角色id
     */
    @ApiModelProperty(value="角色id")
    private Integer roleId;

    /**
     * 角色名
     */
    @ApiModelProperty(value="角色名")
    private String authorities;

    public User(Integer id, String userName, String password, String authorities) {
        this.id = id;
        this.username = userName;
        this.password = password;
        this.authorities = authorities;
    }
}
