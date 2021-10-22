package JavaOOP;

public class Hero extends Human {
    private int energy = 100;

    public Hero(String name, int age){
        this.name = name;
        this.age = age;
    }

    void player(){
        System.out.println("========= Player ========");
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Energy : " + this.energy);
        System.out.println("==========================");

    }

    void checkEnergy(){
        if (energy <= 0) {
            System.out.println("Energi Anda habis! Player " + this.name + " tamat!");
        }
    }

    void run(){
        checkEnergy();
        System.out.println(this.name + " sedang berlari....");
        energy -= 10;
    }

    void eat(){
        checkEnergy();
        System.out.println(this.name + " sedang berlari....");
        energy += 20;
    }

    void drink(){
        checkEnergy();
        System.out.println(this.name + " sedang berlari....");
        energy += 20;
    }

    void sit(){
        checkEnergy();
        System.out.println(this.name + " sedang berlari....");
        energy += 10;
    }

    void jump(){
        checkEnergy();
        System.out.println(this.name + " sedang berlari....");
        energy -= 20;
    }

    void attack(){
        checkEnergy();
        System.out.println(this.name + " sedang berlari....");
        energy -= 30;
    }

    /*
     * Buat method untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki
     * kriteria sebagai berikut: - pasang method checkHealth() di dalam method yang
     * akan dibuat - Tampilkan pesan kegiatan yang sedang dilakukan, misal, jika
     * lari: " sedang berlari..." - ubah energy sesuai kegiatan yang dilakukan: eat
     * = +20 drink = +20 jump = -20 sit = +10 attack = -30
     * 
     * Contoh method seperti method run() diatas.
     * 
     */
}
