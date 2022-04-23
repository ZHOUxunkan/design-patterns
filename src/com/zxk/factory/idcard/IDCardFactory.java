package com.zxk.factory.idcard;

import com.zxk.factory.framework.Factory;
import com.zxk.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouer
 * @date 2022-04-23
 */

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard) p).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
