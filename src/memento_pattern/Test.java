package memento_pattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-08-09 14:05
 **/
public class Test {

    /**
     * MementoManager 的作用是部分记录恢复
     * @param args
     */
    public static void main(String[] args) {

        Memento memento = readRecord();

        Originator originator = new Originator(getNow(),
                "capture", "第一关：九层妖塔");
        originator.restoreMemento(memento);

        System.out.println("创建角色并保存记录为："+originator);

        originator.setAddress("第二关：云顶天宫");originator.setGameRecordTime(getNow());
        System.out.println("游戏进入第二关-云顶天宫");
        System.out.println("该角色状态为："+originator);
        originator.createMemento();
        System.out.println("保存该记录...");

        originator.setAddress("第三关：秦岭神树");originator.setGameRecordTime(getNow());
        System.out.println("游戏进入第三关-秦岭神树");
        System.out.println("该角色状态为："+originator);
        System.out.println("回档....");
        originator.restoreMemento();
        System.out.println("当前该角色状态为："+originator);

    }

    public static String getNow(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        return dateTimeFormatter.format(LocalDateTime.now());
    }

    public static Memento readRecord(){

        Memento memento = null;
        ObjectInput objectInput = null;
        try {
            objectInput = new ObjectInputStream(new FileInputStream("game-record.dat"));
            memento = (Memento)objectInput.readObject();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                objectInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return memento;
    }
}
