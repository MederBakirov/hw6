public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

    boss.setHealthPoint(900);
    boss.setDamage(80);
    boss.weapon.setWeapontype(Weapontype.FIRESHOT);
    boss.weapon.setWeaponName("АК 12 ");
        System.out.println(" Здоровье: " + boss.getHealthPoint()+" Урон: "+boss.getDamage()
                +" Тип Оружия: "+boss.weapon.getWeapontype()+" Название Оружия: "+boss.weapon.getWeaponName());




    }
}