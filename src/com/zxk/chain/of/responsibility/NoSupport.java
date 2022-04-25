package com.zxk.chain.of.responsibility;

/**
 * @author zhouer
 * @date 2022-04-25
 * 无法解决问题
 */

public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
