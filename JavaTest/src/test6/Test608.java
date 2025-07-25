package test6;


class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

class Student extends Person {
    protected String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("학교 : " + school);
    }
}

class SalaryStudent extends Student {
    private String job;

    public SalaryStudent(String name, int age, String school, String job) {
        super(name, age, school);
        this.job = job;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("직업 : " + job);
    }
}

public class Test608 {
    public static void main(String[] args) {
        Person kim = new Person("김유신", 24);
        Student kang = new Student("강감찬", 26, "부경대");
        SalaryStudent lee = new SalaryStudent("이순신", 27, "부산대", "개발자");

        Person[] people = { kim, kang, lee };

        for (Person person : people) {
            person.show();
            System.out.println();
        }
    }
}
