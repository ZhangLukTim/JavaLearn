public class Rekursiv {
    int max = 0;
    int secMax = 0;

    public int secMax(Liste liste) {
        Eintrag eintrag = liste.first;
        return help(eintrag);
    }

    public int help(Eintrag eintrag) {
        if(eintrag.getVal() > max) {
            secMax = max;
            max = eintrag.getVal();
        }else if(eintrag.getVal() > secMax)
            secMax = eintrag.getVal();
        if(eintrag.next != null)
            help(eintrag.next);
        return secMax;
    }
}