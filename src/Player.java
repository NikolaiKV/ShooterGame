class Player {

    public Weapon[] weaponSlots = new Weapon[] {
            new AK(),
            new Pistol(),
            new RPG(),
            new SlingShot(),
            new WaterPistol()
    };

    public Player() {
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= weaponSlots.length)
            throw new IllegalArgumentException("Нет такого слота");
        else if (slot < 0)
            throw new IllegalArgumentException("Слот не может быть меньше 0");

        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
