package com.cat.modules.dynamic.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.extern.slf4j.Slf4j;
import com.cat.base.entity.BaseEntity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 动态消息
 * </p>
 *
 * @author huangjingwei
 * @date 2019-04-14
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class DynamicInfo extends BaseEntity<DynamicInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "dynamic_id")
    @TableField("dynamic_id")
    private String dynamicId;

    /**
     * 所属宠物ID
     */
    @TableField("pet_id")
    private String petId;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private String userId;

    /**
     * 标题
     */
    @TableField("title")
    private String title;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 所在位置
     */
    @TableField("addr")
    private String addr;

    /**
     * 经度
     */
    @TableField("longitude")
    private double longitude;

    /**
     * 纬度
     */
    @TableField("latitude")
    private double latitude;



    /**
     * 点赞数
     */
    @TableField("praise_count")
    private Integer praiseCount;

    /**
     * 评论数
     */
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * 动态类型（1：文字、2：图文、3：视频）
     */
    @TableField("type")
    private String type="0";

    /**
     * 动态来源（微博、知乎、百度等）
     */
    @TableField("source")
    private String source="0";

    /**
     * 封面图
     */
    @TableField("cover_image")
    private String coverImage;

    /**
     * 封面图宽度
     */
    @TableField("width")
    private int width;

    /**
     * 封面图宽度
     */
    @TableField("height")
    private int height;

    /**
     * 媒体数
     */
    @TableField("media_count")
    private int mediaCount;

    /**
     * 是否后台审核通过：0：否、1：是
     */
    @TableField("is_check")
    private String isCheck;

    /**
     * 是否vip发布
     */
    @TableField("is_vip")
    private String isVip;

    /**
     * 圈子id
     */
    @TableField("circle_id")
    private String circleId;
    /** 用户ip **/
    @TableField("create_ip")
    private String createIp;
    /** 用户归属省 **/
    @TableField("create_region")
    private String createRegion;
    /** 用户归属市 **/
    @TableField("create_city")
    private String createCity;

}
