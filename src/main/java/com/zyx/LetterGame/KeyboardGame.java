package com.zyx.LetterGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author yanxinzhang
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/11/9/12:21
 */
public abstract class KeyboardGame {

    /**
     * 根据单个数字获取对应的多个字母
     * @param number
     * @return
     */
    public abstract String getOneLetterCombinationsByNumber(int number);

    /**
     * 重新组合
     * @param numbers
     * @return
     */
    public List<String> assemblyLetters(int[] numbers){
        List<String> list = new ArrayList<>();
        //使用队列重新组合
        Queue<String> queueList = new LinkedBlockingQueue<String>();;
        for (int number : numbers){
            String letterCombinations = getOneLetterCombinationsByNumber(number);
            if (!"".equals(letterCombinations)) { //number非0&1
                if(queueList.isEmpty()){
                    for (int i = 0; i < letterCombinations.length(); i++) {
                        queueList.add(String.valueOf(letterCombinations.charAt(i)));
                    }
                }else{
                    int size = queueList.size();
                    int index = 0;
                    while(size > index){ //都遍历完
                        String val = queueList.remove(); //从头部取出队列
                        for (int i = 0; i < letterCombinations.length(); i++) {
                            queueList.add(val + letterCombinations.charAt(i)); //组合并追加到队列
                        }
                        index++;
                    }
                }
            }
        }
        list.addAll(queueList);
        return list;
    }


}
