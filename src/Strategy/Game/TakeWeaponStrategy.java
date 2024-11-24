package Strategy.Game;

public class TakeWeaponStrategy {
    Weapon wp;

    void setWeapon(Weapon wp){
        this.wp = wp;
    }

    void attack(){
        wp.offensive();
    }
}
