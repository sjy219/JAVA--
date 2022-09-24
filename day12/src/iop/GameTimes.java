package iop;

/*
* 需求：请写程序实现小游戏只能玩3此，如果还想玩，提示：游戏试玩次数已结束，想玩请充值
* 思路：
*   1.写一个游戏类，里面有一个小游戏
*   2.写一个测试类
*       1.从文件中读取数据到Properties集合，用load方法实现
*           文件已存在：game.txt
*           里面有一个数值：count=0;
*       2.通过Properties集合获取玩游戏的次数
*       3.判断次数是否到达3此了
*           如果到了，给出提示：游戏试玩已结束，想玩请充值
*           如果不到3次，：
*               玩游戏：
*               次数+1；重新写回文件，用Properties的Store方法
*
*  properties在这里的好处就是可以将直接将类似于集合的键值对写入文件，而不用采取stringbuilder拼接的方式
* */

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class GameTimes {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        FileReader fr = new FileReader("day12//game.txt");
        prop.load(fr);
        fr.close();
        String count = prop.getProperty("count");
        int cou = Integer.parseInt(count);
        if (cou == 3) {
            System.out.println("想玩请充值");
        } else {
            GamePlay gamePlay = new GamePlay();
            gamePlay.game();
            cou++;
            String times = String.valueOf(cou);
            prop.setProperty("count", times);
            FileWriter fw = new FileWriter("day12//game.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
