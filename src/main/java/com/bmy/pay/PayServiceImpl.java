package com.bmy.pay;

import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @Override
    public void save(Double money) {
        System.out.println("添加");
    }

    @Override
    public void update(Double money) {
        System.out.println("修改");
    }

    @Override
    public void delete(Double money) {
        System.out.println("删除");
    }

    @Override
    public void sel(Double money) {
        System.out.println("查询");
    }
}
