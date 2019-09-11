package visitor_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 艺术家
 * @author: liurunze
 * @create: 2019-09-06 13:26
 **/
public class ArtistVisitor implements Visitor {

    @Override
    public void visitOilPainting(OilPainting oilPainting) {
        System.out.println("艺术家看油画的名字："+oilPainting.getName()+"，和主题："+oilPainting.getSubject());
    }

    @Override
    public void visitTraditionalChinesePainting(TraditionalChinesePainting traditionalChinesePainting) {
        System.out.println("艺术家看国画的名字："+traditionalChinesePainting.getName()+"、主题："+
                traditionalChinesePainting.getSubject()+"，和画家名字："+traditionalChinesePainting.getPainterName());
    }
}
