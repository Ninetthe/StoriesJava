import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la unicornio principal: ");
        String characterName =  keyboard.nextLine();
        System.out.println("Ingrese el nombre de la unicornio secundario: ");
        String characterSecondary = keyboard.nextLine();
        System.out.println("Ingrese el nombre del pueblo o lugar: ");
        String siteName = keyboard.nextLine();

        String story = "En un " + siteName + ", vivía una unicornio llamada " + characterName + ". Su pelaje era tan azul como el cielo y su cuerno brillaba con la intensidad de las estrellas.  " + characterName + " era una criatura llena de energía y curiosidad, pero también era muy desobediente. Le encantaba explorar el bosque por su cuenta, sin importar las advertencias de sus padres.\n" +
                "\n" +
                "Un día, " + characterName + " decidió desobedecer una vez más y se adentró en una zona del bosque que nunca había explorado antes. De repente, se encontró rodeada de una niebla espesa que la desorientó por completo.  " + characterName + " comenzó a caminar sin rumbo fijo, cada vez más asustada. En medio de la niebla, tropezó con una raíz y se lastimó la pata.\n" +
                "\n" +
                "Llena de dolor y miedo,  " + characterName + " comenzó a llorar. De repente, una voz suave y melodiosa la calmó. Era la voz de una unicornio anciana llamada " + characterSecondary + ". " + characterSecondary + " se acercó a  " + characterName + " y la ayudó a curarse la herida.\n" +
                "\n" +
                " " + characterName + ", avergonzada por su desobediencia, le contó a " + characterSecondary + " lo que había sucedido. " + characterSecondary + ", con sabiduría y paciencia, le explicó a  " + characterName + " que la desobediencia podía ser peligrosa y que era importante escuchar a sus padres. También le dijo que la comunicación era fundamental para evitar problemas.\n" +
                "\n" +
                "\"Si hubieras hablado con tus padres y les hubieras contado tu deseo de explorar, ellos te habrían acompañado o te habrían dado instrucciones para que no te perdieras\", le dijo " + characterSecondary + ". \"Recuerda que siempre es mejor hablar con calma y ser obediente, especialmente cuando se trata de tu seguridad\".\n" +
                "\n" +
                characterName + ", comprendiendo el error que había cometido, se disculpó con " + characterSecondary + " y prometió ser más obediente en el futuro. De regreso a casa, " + characterName + " se encontró con sus padres, quienes la recibieron con los brazos abiertos. Desde ese día, " + characterName + " se convirtió en una unicornio más responsable y obediente. Aprendió que la comunicación y la obediencia eran claves para su seguridad y felicidad.\n" +
                "\n" +
                "Moraleja: Ser obediente y comunicar tus deseos con calma te ayudará a evitar problemas y te permitirá disfrutar de una vida más feliz.";

        System.out.println(story);
    }
}