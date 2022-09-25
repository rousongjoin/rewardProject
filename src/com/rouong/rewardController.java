package com.rouong;

/**
 * @Description //TODO 奖励操作接口$
 * @Author:rousong
 * @Date:2022/9/24 11:01
 */
public  interface rewardController {
    /*
         * @Author 肉松 
         * @Description //TODO 新增奖励列表项
         * @Date 11:05 2022/9/24
         * @Param [name, count]
         * @return void
         **/
    public void AddRewardTerm(String name,int count);


    /*
         * @Author 肉松
         * @Description //TODO 移除奖励列表项
         * @Date 16:32 2022/9/24
         * @Param [name]
         * @return void
         **/
    public void RemoveRewardTerm(String name);


    public void luckDraw();
}
