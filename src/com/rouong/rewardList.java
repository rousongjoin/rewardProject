package com.rouong;

/**
 * @Description //TODO $奖励清单
 * @Author:rousong
 * @Date:2022/9/24 10:56
 */
public class rewardList {
    String Name;    //奖励名
    int count;      //奖励积攒次数
    int cost;       //奖励兑换需求
    int id;         //唯一id,创建索引

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
