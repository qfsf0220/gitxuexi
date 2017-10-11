package yibai.EnumTest;

/**
 * Created by Administrator on 2017/10/10.
 */
public class EnumTest003 {
    public static void main(String[] args) {
        for(Boss s :Boss.values()){
//            String username =s.name();
//            String skill =s.getSkill();
//            System.out.println(username+" "+skill);
//            System.out.println(s.getSknum());
            System.out.println(s.name().toLowerCase()+":"+" "+s.getskill());
        }
    }
}
enum  Boss{
    ZHANGZONG("skill",1){
        public String getskill(){
            return "python";
        }
    },
    YANGZONG("skill",2){
        public String getskill(){
            return "java";
        }
    },
    DANGE("skill",3){
        public String getskill(){
            return "windows server";
        }
    },
    XIAOHUOZI("skill",4){
        public String getskill(){
            return "cacti";
        }
    };
    String sk;
    int sknum;

    Boss(String sk, int sknum) {
        this.sk=sk;
        this.sknum = sknum;
    }

    public int getSknum() {
        return sknum;
    }

    public String toString() {
        return this.sk;
    }

    public abstract String getskill();

}