package com.nastation.pm.beanhbm;

/**
 * @author 张磊
 */
public class Rolehbm {

    int id;// 角色ID
    String roleName;// 角色名称
    String roleDesc;// 角色描述
    String createDate;// 创建角色日期

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
