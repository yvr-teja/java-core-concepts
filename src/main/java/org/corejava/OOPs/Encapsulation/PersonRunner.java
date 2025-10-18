package TopicWisePrograms.OOPs.Encapsulation;

public class PersonRunner {
    public static void main(String[] args) {
        Person charan =new Person();
        charan.setAge(22);
        int realAgeOfCharan =charan.getAge()+10;
        System.out.println("charan age : "+charan.getAge());

        Person ravi = new Person();
        ravi.setAge(31);
        int realOfAgeRavi = ravi.getAge()+20;
        System.out.println("ravi age : "+ravi.getAge());
    }
}
