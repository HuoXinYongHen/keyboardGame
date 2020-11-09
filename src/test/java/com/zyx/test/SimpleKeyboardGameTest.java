package com.zyx.test;

import com.zyx.LetterGame.KeyboardGame;
import com.zyx.LetterGame.SimpleKeyboardGame;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanxinzhang
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/11/9/11:09
 */
public class SimpleKeyboardGameTest {

    /**
     * 输入一个正常数字
     */
    @Test
    public void testOne() {
        int[] number = {5};
        KeyboardGame keyboardGame = new SimpleKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {5}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入多个正常数字数组
     */
    @Test
    public void testMore() {
        int[] number = {5,6};
        KeyboardGame keyboardGame = new SimpleKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {5,6}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     *  输入没字母的特殊数字
     */
    @Test
    public void testNoLetters() {
        int[] number = {0,1};
        KeyboardGame keyboardGame = new SimpleKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {0,1}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     *  输入没字母的特殊数字与正常数字
     */
    @Test
    public void testNoLettersAndNormal() {
        int[] number = { 1,8 };
        KeyboardGame keyboardGame = new SimpleKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = { 1,8 }");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     * 测试左边界外的数字
     */
    @Test
    public void testLeftBound() {
        int[] number = {-2,2,5};
        KeyboardGame keyboardGame = new SimpleKeyboardGame();
        List<String> list =new ArrayList<>();
        try {
            list = keyboardGame.assemblyLetters(number);
            System.out.println("\r\nInput:arr[] = {-2,2,5}");
            System.out.print("Output: ");
            for (String one : list) {
                System.out.print(one + " ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }


    /**
     * 测试右边界外的数字
     */
    @Test
    public void testRightBound() {
        int[] number = {5,4,10};
        KeyboardGame keyboardGame = new SimpleKeyboardGame();
        List<String> list =new ArrayList<>();
        try {
            list = keyboardGame.assemblyLetters(number);
            System.out.println("\r\nInput:arr[] = {5,4,10}");
            System.out.print("Output: ");
            for (String one : list) {
                System.out.print(one + " ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }





}
