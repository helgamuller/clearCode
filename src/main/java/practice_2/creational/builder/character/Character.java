package practice_2.creational.builder.character;

public  class Character {
    private int magic;
    private int health;
    private int armor;
    private int damage;

    public Character(Builder builder){
        this.magic = builder.magic;
        this.armor = builder.armor;
        this.health = builder.health;
        this.damage = builder.damage;
    }
    public static class Builder{
        private int magic;
        private int health;
        private int armor;
        private int damage;

        public Builder setHealth(int health){
            this.health = health;
            return this;
        }
        public Builder setArmor(int armor){
            this.armor =  armor;
            return this;
        }
        public Builder setDamage(int damage){
            this.damage = damage;
            return this;
        }
        public Builder setMagic(int magic){
            this.magic = magic;
            return this;
        }

        public Character build(){
            return new Character(this);
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "magic=" + magic +
                ", health=" + health +
                ", armor=" + armor +
                ", damage=" + damage +
                '}';
    }
}