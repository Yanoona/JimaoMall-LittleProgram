package pers.yan.jimao.system.entity;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

/**
* 管理权限分组表
* @TableName admin_rule_group_access
*/
public class AdminRuleGroupAccess implements Serializable {

    /**
    * 管理员ID
    */
    @NotNull(message="[管理员ID]不能为空")
    private Integer uid;
    /**
    * 分组ID
    */
    @NotNull(message="[分组ID]不能为空")
    private Integer groupId;

    /**
    * 管理员ID
    */
    private void setUid(Integer uid){
    this.uid = uid;
    }

    /**
    * 分组ID
    */
    private void setGroupId(Integer groupId){
    this.groupId = groupId;
    }


    /**
    * 管理员ID
    */
    private Integer getUid(){
    return this.uid;
    }

    /**
    * 分组ID
    */
    private Integer getGroupId(){
    return this.groupId;
    }

}
