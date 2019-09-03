package memento_pattern;

import java.io.*;

/**
 * @program: Design-Pattern-Practice
 * @description: 需要被记录对象，在我们玩游戏的时候，需要存档和读档，
 *          这里便将游戏记录粗那放在备忘录中，当然如果我们重启游戏，
 *          存在内存中的记录会消失，这时我们需要在本地也存放一份记录。
 * @author: liurunze
 * @create: 2019-08-08 17:20
 **/
public class Originator {


    private String gameRecordTime; // 游戏记录时间

    private String roleName; // 角色名称

    private String address; // 游戏地址

    private Memento gameRecord; //游戏记录

    public Originator(String gameRecordTime, String roleName, String address) {
        this.gameRecordTime = gameRecordTime;
        this.roleName = roleName;
        this.address = address;
        createMemento();
    }

    /**
     * 创建备忘录
     * @return
     */
    public Memento createMemento() {
        // 这是放在内存中的记录
        gameRecord = new Memento(gameRecordTime, address, roleName);

        // 下面是要把记录存在本地
        ObjectOutput output = null;
        try {

            File file = new File("src/memento_pattern/game-record.dat");
            output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(gameRecord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return gameRecord;
    }

    /**
     * 根据其他备忘录恢复
     */
    public void restoreMemento(Memento memento){
        gameRecordTime = memento.getDataTime();
        address = memento.getAddress();
        roleName = memento.getPerson();
    }

    /**
     * 根据自己的备忘录恢复
     */
    public void restoreMemento(){
        gameRecordTime = gameRecord.getDataTime();
        address = gameRecord.getAddress();
        roleName = gameRecord.getPerson();
    }

    public void setGameRecordTime(String gameRecordTime) {
        this.gameRecordTime = gameRecordTime;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "gameRecordTime='" + gameRecordTime + '\'' +
                ", roleName='" + roleName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
