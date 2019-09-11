package visitor_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 展览类
 * @author: liurunze
 * @create: 2019-09-06 14:09
 **/
public class Exhibition implements Painting{

    private List<Painting> paintingList = new ArrayList<>();

    public void addPainting(Painting painting){
        paintingList.add(painting);
    }

    public void removePainting(Painting painting){
        paintingList.remove(painting);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Painting painting : paintingList) {
            painting.accept(visitor);
        }
    }
}
