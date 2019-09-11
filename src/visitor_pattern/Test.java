package visitor_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Design-Pattern-Practice
 * @description:
 * @author: liurunze
 * @create: 2019-07-04 10:08
 **/
public class Test {

    public static void main(String[] args) {

        System.out.println("创建一个油画对象，并用商人和艺术家去参观：");
        OilPainting oilPainting = new OilPainting("向日葵",100,"抽象画");
        oilPainting.accept(new MerchantVisitor());
        oilPainting.accept(new ArtistVisitor());
        System.out.println("-------------------------------------------");

        System.out.println("创建一个画展对象，并向里面添加艺术品：");
        Exhibition exhibition = new Exhibition();
        exhibition.addPainting(new OilPainting("向日葵",100,"抽象画"));
        exhibition.addPainting(new TraditionalChinesePainting("八骏图",200,"国画","徐悲鸿"));
        System.out.println("一个商人去参观画展：");
        exhibition.accept(new MerchantVisitor());
        System.out.println("一个艺术家去参观画展：");
        exhibition.accept(new ArtistVisitor());


    }
}
