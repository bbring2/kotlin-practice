package lecture.type;

public class TypeCasting {

    public static void main(String[] args) {
        Person person = new Person("최희정", 28);
        String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다.", person.getName(), person.getAge());

        StringBuilder sb = new StringBuilder();
        sb.append("사람의 이름은");
        sb.append(person.getName());
        sb.append("이고 나이는");
        sb.append(person.getAge());
        sb.append("살 입니다.");
    }

    public static void printAgeIfPerson(Object obj) {
        if(obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}
