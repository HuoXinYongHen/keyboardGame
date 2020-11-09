package com.zyx.LetterGame;

import com.zyx.common.KeyboardbButtons;

/**
 * @author yanxinzhang
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/11/9/12:34
 */
public class ExpandKeyboardGame  extends KeyboardGame {

    @Override
    public String getOneLetterCombinationsByNumber(int number) {
        if ( number >= 0 && number <= 99 ) {
            if(number < 10) {
                return KeyboardbButtons.dataMap.get(number);
            }else {
                int first = number/10;
                int sec = number % 10;
                String firstLetters = KeyboardbButtons.dataMap.get(first);
                String secLetters = KeyboardbButtons.dataMap.get(sec);
                return firstLetters + secLetters;
            }
        } else {
            throw new IllegalArgumentException("IllegalArgument param:" + number + ", Please input digits from 0 to 99");
        }
    }

}
