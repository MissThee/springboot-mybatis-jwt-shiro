package com.github.missthee.controller.example;

import com.github.missthee.tool.Res;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;

@ApiIgnore
//权限访问测试
@RestController
@RequestMapping("/authSecurity")
@PreAuthorize("isAuthenticated()")  //方法上注解会覆盖类上注解
public class AuthSecurityController {

    @RequestMapping("/permit")
    @PermitAll
    public Res PermitAll() {
        return Res.success("PermitAll");
    }

    @RequestMapping("/deny")
    @DenyAll
    public Res DenyAll() {
        return Res.success("DenyAll");
    }

    @RequestMapping("/r1r2")
    @PreAuthorize("hasRole('role1') and hasRole('role2')")
    public Res r1r2() {
        return Res.success("role1 and role2");
    }

    @RequestMapping("/r1p1")
    @PreAuthorize("hasRole('role1') or hasPermission(null,'permission1')")
    public Res r1p1() {
        return Res.success("role1 or permission1");
    }
}
