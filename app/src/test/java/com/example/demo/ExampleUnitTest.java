package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        String[] strs = new String[]{"test1","test2","test3","test4"};
        int k = 0;
        char ch;
        StringBuilder resAns = new StringBuilder();
        while (true) {
            if(k >= strs[0].length()) {
                System.out.println(resAns);
                return;
            }
            ch = strs[0].charAt(k);
            boolean f = true;
            for(int i = 1; i < strs.length; i++) {
                String currStr = strs[i];
                if(k >= currStr.length()) {
                    System.out.println(resAns);
                    return;
                }
                if(ch != currStr.charAt(k)) {
                    System.out.println(resAns);
                    return;
                }
            }
            if(f) {
                resAns.append(ch);
            }
            k++;
        }
        //System.out.println(resAns);

//        while (true) {
//        }
    }

    @Test
    public void test1() {
        Integer[] nums = new Integer[]{5,525,520,52,25};
        int len = nums.length;
        String[] newNums = new String[len];
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < len; i++) {
            newNums[i] = "" + nums[i];
        }
        Arrays.sort(newNums, (s1, s2) -> {
            if((s1 + s2).compareTo(s2 + s1) < 0) {
                return 1;
            } else {
                return -1;
            }
        });

        for(int i = 0; i < len; i++) {
            ans.append(newNums[i]);
        }
        System.out.println(ans);

        while (true) {
        }
    }
}