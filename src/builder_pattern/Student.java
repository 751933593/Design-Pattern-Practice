package builder_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 学生类，其中学生姓名和学生学号是必须属性
 * @author: liurunze
 * @create: 2019-07-22 10:11
 **/
public class Student {

    private final String stuName;
    private final String stuNo;
    private final String age;
    private final String sex;
    private final String telNum;

    public Student(StudentBuilder sb) {
        this.stuName = sb.stuName;
        this.stuNo = sb.stuNo;
        this.age = sb.age;
        this.sex = sb.sex;
        this.telNum = sb.telNum;
    }

    public static class StudentBuilder{

        private final String stuName;
        private final String stuNo;
        private String age;
        private String sex;
        private String telNum;

        public StudentBuilder(String stuName,String stuNo) {
            this.stuName = stuName;
            this.stuNo = stuNo;
        }

        public StudentBuilder sex(String sex){
            this.sex = sex;
            return this;
        }

        public StudentBuilder age(String age){
            this.age = age;
            return this;
        }

        public StudentBuilder telNum(String telNum){
            this.telNum = telNum;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getTelNum() {
        return telNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", telNum='" + telNum + '\'' +
                '}';
    }
}
