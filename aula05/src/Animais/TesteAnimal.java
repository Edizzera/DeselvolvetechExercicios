package Animais;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro("Caramelo");
        Gato frida = new Gato("Frida");


        System.out.println(caramelo.late());
        System.out.println(caramelo.getNome() + " "+ caramelo.caminha());
        System.out.println(frida.mia());
        System.out.println(frida.getNome() + " " + frida.caminha());



    }
}
