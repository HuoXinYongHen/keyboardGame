package com.zyx.LetterGame;

import com.zyx.common.KeyboardbButtons;

/**
 * @author yanxinzhang
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/11/9/12:11
 */
public class SimpleKeyboardGame extends KeyboardGame {

    @Override
    public String getOneLetterCombinationsByNumber(int number) {
        if (number >= 0 && number <= 9) {
            return KeyboardbButtons.dataMap.get(number);
        } else {
            throw new IllegalArgumentException("IllegalArgument param:" + number + ", Please input digits from 0 to 9");
        }
    }
}
