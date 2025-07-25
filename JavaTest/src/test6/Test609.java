package test6;

enum Gender {
    MALE, FEMALE
}

class Man {
    public void print() {
        System.out.println("남자 입니다.");
    }
}

class Woman {
    public void print() {
        System.out.println("여자 입니다.");
    }
}

public class Test609 {
    public static void main(String[] args) {
        Object human1 = makeHuman(Gender.MALE);
        Object human2 = makeHuman(Gender.FEMALE);
        
        // human1이 참조하고 있는 객체가 Mam 클래스의 인스턴스인가?
        if (human1 instanceof Man) {
            Man man = (Man) human1;
            man.print();
        }

        if (human2 instanceof Woman woman) {
            woman.print();
        }
    }

    public static Object makeHuman(Gender gender) {
        if (gender == Gender.MALE) {
            return new Man();
        } else if (gender == Gender.FEMALE) {
            return new Woman();
        }
        return null;
    }
}
