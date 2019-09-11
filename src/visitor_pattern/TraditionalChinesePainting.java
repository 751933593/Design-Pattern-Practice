package visitor_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 国画
 * @author: liurunze
 * @create: 2019-09-06 13:23
 **/
public class TraditionalChinesePainting implements Painting{

    private String name;

    private int price;

    private String subject;

    private String painterName;

    public TraditionalChinesePainting(String name, int price, String subject, String painterName) {
        this.name = name;
        this.price = price;
        this.subject = subject;
        this.painterName = painterName;
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visitTraditionalChinesePainting(this);
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

    public String getPainterName() {
        return painterName;
    }
}
