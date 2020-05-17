public class Main {
    public static void main(String[] args) {
        //任意构造一个新的Liste。
        Liste liste = new Liste(new Eintrag(1), new Eintrag(10));
        liste.add(new Eintrag(6));
        liste.add(new Eintrag(8));

        Iterativ iterativ = new Iterativ();
        int iterativSec = iterativ.findSec(liste);
        System.out.println(iterativSec);

        Rekursiv rekursiv = new Rekursiv();
        int rekursivSec = rekursiv.secMax(liste);
        System.out.println(rekursivSec);

    }
}
