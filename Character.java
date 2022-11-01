public abstract class Character {

    WeaponBehaviour wp;

    public abstract void display();


    public void ATT() {wp.useWeapon();}


    public void setWeapon (WeaponBehaviour w) {wp=w;}

    public void displaychar(){
        display();
        setWeapon(wp);
        ATT();



    }

}
