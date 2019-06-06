package unit12;

import java.io.File;

public class TestBufferedWriter {
    public static void main(String[] args) {
        //郑伯克段于鄢
        String content = "隐公元年\n" +
                "元年春王正月。三月，公及邾仪父盟于蔑。夏五月，郑伯克段于鄢。\n" +
                "秋七月，天王使宰咺来归惠公、仲子之赗。九月，及宋人盟于宿。冬十有二月，祭伯来。公子益师卒。\n" +
                "元年春，王周正月。不书即位，摄也。\n" +
                "三月，公及邾仪父盟于蔑，邾子克也。未王命，故不书爵。曰“仪父”，贵之也。公摄位而欲求好于邾，故为蔑之盟。\n" +
                "夏四月，费伯帅师城郎。不书，非公命也。\n" +
                "初，郑武公娶于申，曰武姜，生庄公及共叔段。庄公寤生，惊姜氏，故名曰“寤生”，遂恶之。爱共叔段，欲立之。\n" +
                "亟请于武公，公弗许。及庄公即位，为之请制。公曰：“制，岩邑也，虢叔死焉。佗邑唯命。”请京，使居之，谓之京城大叔。\n" +
                "祭仲曰：“都，城过百雉，国之害也。先王之制：大都，不过参国之一；中，五之一；小，九之一。今京不度，非制也，君将不堪。”\n" +
                "公曰：“姜氏欲之，焉辟害？”对曰：“姜氏何厌之有？不如早为之所，无使滋蔓！蔓，难图也。蔓草犹不可除，况君之宠弟乎？”公曰：“多行不义，必自毙，子姑待之。”\n" +
                "既而大叔命西鄙、北鄙贰于己。公子吕曰：“国不堪贰，君将若之何？欲与大叔，臣请事之；若弗与，则请除之，无生民心。”公曰：“无庸，将自及。”\n" +
                "大叔又收贰以为己邑，至于廪延。子封曰：“可矣，厚将得众。”公曰：“不义不暱，厚将崩。”\n" +
                "大叔完聚，缮甲兵，具卒乘，将袭郑，夫人将启之。公闻其期，曰：“可矣！”命子封帅车二百乘以伐京。京叛大叔段，段入于鄢，公伐诸鄢。五月辛丑，大叔出奔共。\n" +
                "书曰：“郑伯克段于鄢。”段不弟，故不言弟；如二君，故曰克；称郑伯，讥失教也：谓之郑志。不言出奔，难之也。";

        String dirPath = "C:\\Users\\Administrator\\Desktop\\files1";
        File dir = new File(dirPath);
        String fileName = "春秋·隐公元年.txt";

        FileManager.useBufferedWriter(dir, fileName, content);
    }
}