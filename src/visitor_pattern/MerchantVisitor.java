package visitor_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 商人
 * @author: liurunze
 * @create: 2019-09-06 13:26
 **/
public class MerchantVisitor implements Visitor {

    @Override
    public void visitOilPainting(OilPainting oilPainting) {
        System.out.println("商人看油画的名字："+oilPainting.getName()+"，和价格："+oilPainting.getPrice());
    }

    @Override
    public void visitTraditionalChinesePainting(TraditionalChinesePainting traditionalChinesePainting) {
        System.out.println("商人看国画的名字："+traditionalChinesePainting.getName()+"、价格："+
                traditionalChinesePainting.getPrice()+"，和画家名字："+traditionalChinesePainting.getPainterName());
    }
}
