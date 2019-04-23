package com.jack.how2j.collectionFramework;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 自己实现一个简单的hashcode
 * @Date: 2019/4/23 09:59
 * @Author: Wyj
 */
public class customHashcode {

    public static int hashcode(String s){

        // 一般写法
//        int hashcode = 0;
//        if (s.length() == 0){
//            return 0;
//        }else {
//            char[] cs = s.toCharArray();
//            for (int i = 0; i < cs.length; i++) {
//                hashcode += cs[i];
//            }
//            hashcode = hashcode * 23;
//        }if (hashcode > 1999){
//            return hashcode % 2000;
//        }
//        if (hashcode < 0) {
//            return Math.abs(hashcode);
//        }
//        return hashcode;

        // 高级写法
        int hashcode = 0;
        if (s.length() == 0) {
            return 0;
        }

        char cs[] = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            hashcode += cs[i];
        }
        hashcode *= 23;

        // 如果hashcoded < 0, 取绝对值（0 - hashcode）
        hashcode = hashcode < 0 ? 0 - hashcode : hashcode;
        hashcode %= 2000;

        return hashcode;

    }

    public static String generateRandomString(int length){

//        length = (int) (Math.random() * 10);
        String str = "";
        for (short i = '0'; i <= '9' ; i++) {
            str += (char)i;
        }
        
        for (short i = 'a'; i <= 'z' ; i++) {
            str += (char)i;
        }
        
        for (short i = 'A'; i <= 'Z' ; i++) {
            str += (char)i;
        }

        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = str.charAt((int) (Math.random() * str.length()));
        }

        return new String(cs);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int len = (int) (Math.random() * 8 + 2);
            String s = generateRandomString(len);
            System.out.printf("%-11s   的哈希值为：%d", s, hashcode(s));
            System.out.println();
        }
    }
}
