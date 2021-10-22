package JavaOOP;

class Main {
    int x;
    int y;
    public static void main(String[] args) {
        Hero hero = new Hero("Rivaldo", 21);

        hero.player();

        looping(2, () -> hero.walk());
        looping(3, () -> hero.run());
        looping(5, () -> hero.eat());
        looping(2, () -> hero.drink());
        looping(20, () -> hero.walk());
        looping(6, () -> hero.jump());
        looping(5, () -> hero.sit());
        looping(2, () -> hero.attack());

        
        // Group 2: walk 7x, run 2, eat 3x, drink 2x, jump 6x, sit 5x, walk 10x, attack
        // 2x

        hero.player();

    }

    static void looping(int x, Runnable r) {
        for (int i = 0; i < x; i++) {
            r.run();
        }
    }
}
