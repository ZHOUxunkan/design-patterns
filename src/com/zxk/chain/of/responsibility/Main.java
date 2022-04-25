package com.zxk.chain.of.responsibility;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Support a = new NoSupport("a");
        Support b = new LimitSupport("b",100);
        Support c = new OddSupport("c");
        Support d = new LimitSupport("d",300);
        a.setNext(b).setNext(c).setNext(d);
        for (int i = 0; i < 500; i+=33) {
            a.support(new Trouble(i));
        }
    }
    /* 输出：
        [Trouble 0] is resolved by [b].
        [Trouble 33] is resolved by [b].
        [Trouble 66] is resolved by [b].
        [Trouble 99] is resolved by [b].
        [Trouble 132] is resolved by [d].
        [Trouble 165] is resolved by [c].
        [Trouble 198] is resolved by [d].
        [Trouble 231] is resolved by [c].
        [Trouble 264] is resolved by [d].
        [Trouble 297] is resolved by [c].
        [Trouble 330] cannot be resolved.
        [Trouble 363] is resolved by [c].
        [Trouble 396] cannot be resolved.
        [Trouble 429] is resolved by [c].
        [Trouble 462] cannot be resolved.
        [Trouble 495] is resolved by [c].
     */
}
