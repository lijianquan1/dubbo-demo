package com.lee.dubbo.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:ljq
 * Date: 2018/5/29
 **/
public class DemoServiceImpl implements DemoService{

    @Override
    public List<String> getPermissions(Long id) {
        ArrayList<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
