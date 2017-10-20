package Starcraft;
public class Zerg extends Starcraft 
{
    // 추상 클래스는 오버라이딩 해서 사용
    @Override
    public void attack() 
    {
        System.out.println("저그의 공격");
    }
}
