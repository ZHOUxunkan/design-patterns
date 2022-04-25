package com.zxk.chain.of.responsibility;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
