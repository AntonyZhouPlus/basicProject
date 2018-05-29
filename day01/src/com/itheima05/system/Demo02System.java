package com.itheima05.system;

import java.util.Arrays;

/*
  System中的数组复制方法
  public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

          src    : 源数组
          srcPos : 源数组被复制的起始索引
          dest   : 目标数组
          destPos: 目标数组需要复制到的起始索引
          length : 复制元素的个数


 */
public class Demo02System {
    /*
        将src数组中前3个元素，复制到dest数组的前3个位置上

        复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]

        复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]

     */
    public static void main(String[] args) {
        // 源数组
        int[]  src = {1,2,3,4,5};
        // 目标数组
        int[] dest = {6,7,8,9,10};

        // 完成元素的复制   将src数组中前3个元素，复制到dest数组的前3个位置上
        // 使用System类中arraycopy
        System.arraycopy(src,0,dest,0,3);

        // 这就完成复制了 看效果
        System.out.println("源数组  ：" + Arrays.toString(src));
        System.out.println("目标数组：" + Arrays.toString(dest));
    }

}
