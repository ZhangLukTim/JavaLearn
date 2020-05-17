public class Liste {
    Eintrag first;
    Eintrag last;

    public Liste(Eintrag first, Eintrag last) {
        this.first = first;
        this.last = last;

        this.first.prev = null;
        this.first.next = this.last;
        this.last.prev = this.first;
        this.last.next = null;
    }

    public void add(Eintrag e) {
        last.next = e;
        e.prev = last;
        last = e;
    }

    public Eintrag get(int i) {
        Eintrag res = first;
        for (int j = 0; j < i; j++) {
            res = res.next;
        }
        return res;
    }

    public int size() {
        int count = 1;
        Eintrag aFist = first;
        while(aFist.next != null){
            count++;
            aFist = aFist.next;
        }
        return count;
    }
}
