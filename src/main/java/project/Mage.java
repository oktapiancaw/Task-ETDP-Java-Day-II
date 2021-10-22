package project;

public class Mage implements Hero{
    public int healthHero;
    public int power;
    private String name;
    private int bonusPower;

    public Mage(int healthHero, int power, String name, String type) {
        if(healthHero > MIN_HEALTH){
            this.healthHero = healthHero;
        }else{
            this.healthHero = MIN_HEALTH;
        }
        this.power = power;
        this.name = name;
        if(type == "Fire"){
            this.bonusPower = 2;
        }else{
            this.bonusPower = 1;
        }

    }

    @Override
    public int attacked(int damage) {
        System.out.println( this.name + " terkena damage sebesar : " + damage);
        if (this.healthHero >= damage){
            this.healthHero = this.healthHero - damage;
        }else{
            this.healthHero = 0;
        }
        return damage;
    }

    @Override
    public int attack() {
        System.out.println( this.name + " memberikan damage");
        return this.power * this.bonusPower;
    }

    @Override
    public void heal() {
        if(this.healthHero <= MAX_HEALTH){
            System.out.println( this.name + " Berhasil menyembuhkan diri sendiri");
            this.healthHero = MAX_HEALTH;
        }else{
            System.out.println("Darah anda penuh");
        }
    }
}
