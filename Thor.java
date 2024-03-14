public class Thor extends SuperHero implements SkillHero,Nationality{
    public String skill;
    public void skill(String skill){
        System.out.println("skill = "+skill);
    }
    @Override
    public void movements(String movemets) {
       System.out.println("movenemts :"+movemets);
    }
    @Override
    public void weapon(String weapon) {
       System.out.println("Weapon : "+weapon);
    }
    @Override
    public void setNation(String Nation) {
       System.out.println("Nationality : "+Nation);
    }
}
