package Strategy.Game;

interface Weapon {
    public void offensive();
}

class Sword implements Weapon{
    public void offensive(){
        System.out.println("칼을 휘두르다.");
    }
}

class Shield implements  Weapon{
    public void offensive(){
        System.out.println("방패로 밀치다.");
    }
}

class Crossbow implements Weapon{
    public void offensive(){
        System.out.println("석궁을 발사하다.");
    }
}