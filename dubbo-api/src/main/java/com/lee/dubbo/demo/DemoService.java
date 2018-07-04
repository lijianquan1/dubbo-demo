package com.lee.dubbo.demo;

import java.util.List;

/**
 * Author:ljq
 * Date: 2018/5/29
 **/
public interface DemoService {
    List<String> getPermissions(Long id);
}
