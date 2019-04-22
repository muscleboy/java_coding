package com.jack.how2j.collectionFramework;

import java.util.HashSet;
import java.util.Random;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 从长度为100的字符串数组，使用hashset统计重复字符串
 * @Date: 2019/4/21 17:29
 * @Author: Wyj
 */
public class HashSetPratice {

    /** 
    * @Description: 根据传入的参数，生成随机字符串
     *              先生成'0'-'9', 'a'-'z', 'A'-'Z'的字符串
    * @Param: [length] 
    * @return: java.lang.String
    */ 
    public static String[] generateRandomString(int length){

        String pool = "";
        String ss[] = new String[100];
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }

        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }

        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
    
        char cs[] = new char[length];
        // 48对应 '0' 的ASCII值
        // 添加到String[]数组中
        for (int j = 0; j < ss.length; j++) {
            for (int i = 0; i < cs.length; i++) {
                // 在'0'-'9', 'a'-'z', 'A'-'Z'的字符串中随机取
                int index = (int) (Math.random() * pool.length());
                // 取得index位置的字符, 添加cs[]中，循环length次得到length长度的随机字符串
                cs[i] = pool.charAt(index);
            }
            ss[j] = new String(cs);
        }

        return ss;
    }

    public static void main(String[] args) {

        for (int i = 0; i < generateRandomString(2).length; i++) {
            System.out.print(generateRandomString(2)[i] + " ");
            // 每行20个
            if (19 == i % 20) {
                System.out.println();
            }
        }

        HashSet<String> result = new HashSet<>();

        for (String s1 : generateRandomString(2)) {
            // 记录重复的次数，=1表示匹配到本身，>=2重复
            int repeat = 0;
            for (String s2 : generateRandomString(2)) {
                if (s1.equalsIgnoreCase(s2)) {
                    repeat ++;
                    // 超过两次就算重复，> 2的就不需要比较了
                    if (repeat == 2) {
                        result.add(s2);
                        break;
                    }
                }
            }
        }

        System.out.printf("共有%d中重复数据", result.size());
        System.out.println();
        if (result.size() != 0) {
            System.out.println("分别是：");
            for (String s : result) {
                System.out.print(s + " ");
            }
        }
    }
}

