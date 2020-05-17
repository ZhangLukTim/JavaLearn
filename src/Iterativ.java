public class Iterativ {
    public int findSec(Liste liste) {
        int max = -1;
        int secMax = -1;
        for (int i = 0; i < liste.size(); i++) {
            if(liste.get(i).getVal() > max) {
                secMax = max;
                max = liste.get(i).getVal();
            }else if(liste.get(i).getVal() > secMax)
                secMax = liste.get(i).getVal();
        }
        return secMax;
    }
}
