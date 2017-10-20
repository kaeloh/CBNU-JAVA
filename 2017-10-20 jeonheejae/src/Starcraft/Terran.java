package Starcraft;
public class Terran extends Starcraft 
{
    // 추상 클래스는 오버라이딩 해서 사용
    @Override
    public void attack() 
    {
        System.out.println("테란의 공격");
    }
}
