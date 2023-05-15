package com.cat.modules.dynamic.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.annotation.TableId;
import com.cat.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 动态浏览记录
 * </p>
 *
 * @author huangjingwei
 * @date 2021-09-07
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class DynamicViewLog extends BaseEntity<DynamicViewLog> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("id")
    @TableField("id")
    private String id;

    /**
     * 动态ID
     */

    @TableField("dynamic_id")
    private String dynamicId;

    /**
     * 用户id
     */

    @TableField("user_id")
    private String userId;



}
