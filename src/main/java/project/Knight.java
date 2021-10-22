package project;

public class Knight implements Hero{
    public int healthHero;
    public int power;
    private String name;

    public Knight(int healthHero, int power, String name) {
        if(healthHero > MIN_HEALTH){
            this.healthHero = healthHero;
        }else{
            this.healthHero = MIN_HEALTH;
        }
        this.power = power;
        this.name = name;
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
        return this.power;
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
