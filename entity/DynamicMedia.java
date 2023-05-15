package com.cat.modules.dynamic.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.extern.slf4j.Slf4j;
import com.cat.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 动态消息图片
 * </p>
 *
 * @author huangjingwei
 * @date 2019-04-15
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class DynamicMedia extends BaseEntity<DynamicMedia> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "dynamic_media_id")
    @TableField("dynamic_media_id")
    private String dynamicMediaId;

    /**
     * 动态ID
     */
    @TableField("dynamic_id")
    private String dynamicId;

    /**
     * 所属宠物ID
     */
    @TableField("pet_id")
    private String petId;

    /**
     * 图片地址
     */
    @TableField("media_url")
    private String mediaUrl;

    /**
     * 小图地址
     */
    @TableField("small_url")
    private String smallUrl;

    /**
     * 类型（1：图片、2：视频）
     */
    @TableField("type")
    private String type;

    /**
     * 排序值
     */
    @TableField("sort_no")
    private Integer sortNo;

    /**
     * 资源图宽度
     */
    @TableField("width")
    private int width;

    /**
     * 资源图宽度
     */
    @TableField("height")
    private int height;

}
