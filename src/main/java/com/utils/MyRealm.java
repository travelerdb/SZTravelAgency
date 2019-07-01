package com.utils;

import com.entity.lyq.Empaccount1;
import com.entity.lyq.Permisstab1;
import com.entity.lyq.Roletab1;
import com.service.lyq.Empaccount1Service;
import com.service.lyq.PermisstabService;
import com.service.lyq.Roletab1Service;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyRealm extends AuthorizingRealm {
    @Resource
    private Empaccount1Service us;

    @Resource
    private Roletab1Service roleService;

    @Resource
    private PermisstabService permissService;

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Empaccount1 emp=(Empaccount1)SecurityUtils.getSubject().getPrincipal();
        String userName=emp.getAccNum();
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        Set<String> roles=new HashSet<String>();
        List<Roletab1> rolesByUserName = roleService.getRolesByUserName(userName);
        for(Roletab1 role:rolesByUserName) {
            System.out.println("---------role-------------");
            System.out.println(role.getRoleName());
            roles.add(role.getRoleName());
        }
        List<Permisstab1> permissionsByUserName = permissService.getPermissionsByUserName(userName);
        for(Permisstab1 permission:permissionsByUserName) {
            System.out.println("---------permission-------------");
            System.out.println(permission.getPerTitle());
            info.addStringPermission(permission.getPerTitle());
        }
        info.setRoles(roles);
        return info;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("token.getPrincipal:" + token.getPrincipal());
        System.out.println("token.getCredentials:" + token.getCredentials());
        String userName = token.getPrincipal().toString();
        Empaccount1 empaccount1 = us.login(userName);
        if (empaccount1 != null) {
            // Object principal, Object credentials, String realmName  empaccount1.getAccNum()
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(empaccount1, empaccount1.getPassword(), getName());
            return authcInfo;
        } else {
            return null;
        }
    }

}