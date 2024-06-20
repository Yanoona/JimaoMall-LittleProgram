package pers.yan.jimao.system.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
* 管理分组表
* @TableName admin_rule_group
*/
public class AdminRuleGroup implements Serializable {

    /**
    * ID
    */
    @NotNull(message="[ID]不能为空")
    private Integer id;
    /**
    * 上级分组
    */
    @NotNull(message="[上级分组]不能为空")
    private Integer pid;
    /**
    * 组名
    */
    @Size(max= 100,message="编码长度不能超过100")
    @Length(max= 100,message="编码长度不能超过100")
    private String name;
    /**
    * 权限规则ID
    */
    @NotBlank(message="[权限规则ID]不能为空")
    @Size(max= -1,message="编码长度不能超过-1")
    @Length(max= -1,message="编码长度不能超过-1")
    private String rules;
    /**
    * 创建时间
    */
    private Integer createtime;
    /**
    * 更新时间
    */
    private Integer updatetime;
    /**
    * 状态:0=禁用,1=启用
    */
    @NotNull(message="[状态:0=禁用,1=启用]不能为空")
    private Integer status;
    /**
    * 逻辑删除
    */
    @NotNull(message="[逻辑删除]不能为空")
    private Integer isDelete;

    /**
    * ID
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 上级分组
    */
    private void setPid(Integer pid){
    this.pid = pid;
    }

    /**
    * 组名
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 权限规则ID
    */
    private void setRules(String rules){
    this.rules = rules;
    }

    /**
    * 创建时间
    */
    private void setCreatetime(Integer createtime){
    this.createtime = createtime;
    }

    /**
    * 更新时间
    */
    private void setUpdatetime(Integer updatetime){
    this.updatetime = updatetime;
    }

    /**
    * 状态:0=禁用,1=启用
    */
    private void setStatus(Integer status){
    this.status = status;
    }

    /**
    * 逻辑删除
    */
    private void setIsDelete(Integer isDelete){
    this.isDelete = isDelete;
    }


    /**
    * ID
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 上级分组
    */
    private Integer getPid(){
    return this.pid;
    }

    /**
    * 组名
    */
    private String getName(){
    return this.name;
    }

    /**
    * 权限规则ID
    */
    private String getRules(){
    return this.rules;
    }

    /**
    * 创建时间
    */
    private Integer getCreatetime(){
    return this.createtime;
    }

    /**
    * 更新时间
    */
    private Integer getUpdatetime(){
    return this.updatetime;
    }

    /**
    * 状态:0=禁用,1=启用
    */
    private Integer getStatus(){
    return this.status;
    }

    /**
    * 逻辑删除
    */
    private Integer getIsDelete(){
    return this.isDelete;
    }

}
