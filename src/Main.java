import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n 0 - AK%n 1 - Pistol%n 2 - RPG%n 3 - SlingSot%n 4 - WaterPistol%n",
                player.getSlotsCount()
        );

        while (true) {
            int slot = scanner.nextInt();
            if (slot == (-1)) break;
            player.shotWithWeapon(slot);
        }

        System.out.println("Game over!");
    }
}