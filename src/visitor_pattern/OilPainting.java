package visitor_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 油画
 * @author: liurunze
 * @create: 2019-09-06 13:18
 **/
public class OilPainting implements Painting {

    private String name;

    private int price;

    private String subject;

    public OilPainting(String name, int price, String subject) {
        this.name = name;
        this.price = price;
        this.subject = subject;
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visitOilPainting(this);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSubject() {
        return subject;
    }
}
