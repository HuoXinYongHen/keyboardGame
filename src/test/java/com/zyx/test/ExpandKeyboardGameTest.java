package com.zyx.test;

import com.zyx.LetterGame.ExpandKeyboardGame;
import com.zyx.LetterGame.KeyboardGame;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yanxinzhang
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/11/9/11:32
 */
public class ExpandKeyboardGameTest {


    /**
     * 输入一个正常数字0-9是否也满足
     */
    @Test
    public void testOne1() {
        int[] number = {3};
        KeyboardGame keyboardGame = new ExpandKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {3}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入一个正常数字0-99是否也满足
     */
    @Test
    public void testOne2() {
        int[] number = {83};
        KeyboardGame keyboardGame = new ExpandKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {83}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }
    /**
     * 输入多个正常数字0-9是否也满足
     */
    @Test
    public void testMore1() {
        int[] number = {6,9};
        KeyboardGame keyboardGame = new ExpandKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {6,9}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入多个正常数字数组0-99是否也满足
     */
    @Test
    public void testMore2() {
        int[] number = {23,46};
        KeyboardGame keyboardGame = new ExpandKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {23,46}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     * 输入多个正常数字数组0-99是否也满足
     */
    @Test
    public void testMore3() {
        int[] number = {46,3};
        KeyboardGame keyboardGame = new ExpandKeyboardGame();
        List<String> list = keyboardGame.assemblyLetters(number);
        System.out.println("\r\nInput:arr[] = {3,46}");
        System.out.print("Output: ");
        for (String one : list) {
            System.out.print(one + " ");
        }
    }

    /**
     * 测试右边界外的数字
     */
    @Test
    public void testRightBound() {
        int[] number = {9,2,255};
        KeyboardGame keyboardGame = new ExpandKeyboardGame();
        List<String> list =new ArrayList<>();
        try {
            list = keyboardGame.assemblyLetters(number);
            System.out.println("\r\nInput:arr[] = {9,2,255}");
            System.out.print("Output: ");
            for (String one : list) {
                System.out.print(one + " ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }

    /**
     * 测试左边界外的数字
     */
    @Test
    public void testLeftBound() {
        int[] number = {-8,2,67};
        KeyboardGame keyboardGame = new ExpandKeyboardGame();
        List<String> list =new ArrayList<>();
        try {
            list = keyboardGame.assemblyLetters(number);
            System.out.println("\r\nInput:arr[] = {-8,2,67}");
            System.out.print("Output: ");
            for (String one : list) {
                System.out.print(one + " ");
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }





}
