public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Test test = new Test();

        System.out.println(test.getNum() + ' ' + test.getName() + ' ' + test.isCheck());

        동물 dong = new 동물();
        포유류 dog = new 포유류();

        dong.showMe();
        dog.showMe();

        dog.fly();
        dog.gi();

        System.out.println(dog instanceof 동물);


        System.out.println(Speakable.absoluteZerPoint);
        System.out.println(Speakable.PI);

        Specker reporter1 = new Specker();
        reporter1.sayYes();
    }
}
