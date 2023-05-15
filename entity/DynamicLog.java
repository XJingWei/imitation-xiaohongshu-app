package com.cat.modules.dynamic.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.annotation.TableId;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import com.cat.base.entity.BaseEntity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.annotation.TableField;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 动态日志
 * </p>
 *
 * @author huangjingwei
 * @date 2020-10-14
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class DynamicLog extends BaseEntity<DynamicLog> {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    @TableField("id")
    private String id;

    /**
     * 动态id
     */

    @TableField("dynamic_id")
    private String dynamicId;

    /**
     * 用户id
     */

    @TableField("user_id")
    private String userId;

    /**
     * 状态:1-新增、2-删除、3-审核通过、4-审核驳回
     */

    @TableField("status")
    private Integer status;

    /**
     * 备注
     */

    @TableField("remark")
    private String remark;



}
