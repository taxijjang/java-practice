public class 포유류 extends 동물 implements 날수있는, 기어다니는{
    public 포유류(){
        myClass = "포유류";
    }

    @Override
    public void fly() {
        System.out.println(this.myClass + "는 날수 잇낭");
    }

    @Override
    public void gi() {
        System.out.println(this.myClass + "는 기어다닐수 있낭");
    }
}
