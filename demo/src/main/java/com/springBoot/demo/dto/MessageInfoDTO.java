package com.springBoot.demo.dto;

import lombok.*;

/*
    lombok学习
 */
@Data //@Data注解在类上，会为类的所有属性自动生成setter/getter、equals、canEqual、hashCode、toString方法，如为final属性，则不会为该属性生成setter方法。
//@NoArgsConstructor//生成无参构造器；
//@RequiredArgsConstructor//生成包含final和@NonNull注解的成员变量的构造器；
//@AllArgsConstructor//生成全参构造器
public class MessageInfoDTO {


    @Getter
    @Setter //如果觉得@Data太过残暴，不够精细，可以使用@Getter/@Setter注解，此注解在属性上，可以为相应的属性自动生成Getter/Setter方法
    private String user;

    @NonNull //主要作用于成员变量和参数中，标识不能为空，否则抛出空指针异常,构建实体时这个参数就不能为空
    private String phone;

    private String bjbh;

    private String sxmc;

    private String spdw;

    private String key;

    private String url;

    private String msgUrl;

}
