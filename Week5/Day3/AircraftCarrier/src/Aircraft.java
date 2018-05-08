public class Aircraft {

    int ammoLevel;
    int baseDamage;
    int maxAmmo;
    int damage;
    String type;


    public Aircraft() {
        this.ammoLevel = 0;
    }

    public int fight() {
        damage = baseDamage * ammoLevel;
        ammoLevel = 0;
        return damage;
    }

    public int refill(int refillVolume) {
        int remainder = 0;
        if ((maxAmmo - ammoLevel) >= refillVolume) {
            ammoLevel += refillVolume;
            remainder = 0;
        } else {
            remainder = refillVolume - (maxAmmo - ammoLevel);
            ammoLevel = maxAmmo;
        }
        return remainder;
    }

    public void getType(Aircraft aircraft) {
        System.out.println(this.type);
    }

    public void getStatus() {
        System.out.println(type + " Ammo: " + ammoLevel + " Base damage: " + baseDamage + " All damage: " + damage);
    }

//    public boolean isPriority(Aircraft aircraft) {
//        return (aircraft instanceof F35);
//    }

    public boolean isPriority() {
        return (this.type == "F35");
    }

    public int getAmmoToFill() {
        //return this.ammoLevel;
        int ammoToFill = 0;
        if (this.type == "F35") {
            ammoToFill = 12 - ammoLevel;
        } else {
            ammoToFill = 8 - ammoLevel;
        }
        return ammoToFill;
    }

}
