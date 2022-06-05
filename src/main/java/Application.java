import main.java.animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik gav = new Kotik("Gav", "gav", 7, 1.205);

        Kotik polt = new Kotik();
        polt.setName("Polt");
        polt.setVoice("argh");
        polt.setSatiety(2);
        polt.setWeight(2.973);

        String[] gavDay = gav.liveAnotherDay();

        for (String day: gavDay) {
            System.out.println(day);
        }

        System.out.println(gav.getName());
        System.out.println(gav.getWeight());

        System.out.println(compareVoice(gav, polt));

        System.out.println(polt.getCount());
    }

    static boolean compareVoice (Kotik kotik1, Kotik kotik2) {
        if (kotik1.getVoice().equals(kotik2.getVoice())) {
            return true;
        } else {
            return false;
        }
    }
}
