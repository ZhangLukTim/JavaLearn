public class Eintrag {
    int val;
    Eintrag next;
    Eintrag prev;

    public Eintrag(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public Eintrag getNext() {
        return next;
    }

    public Eintrag getPrev() {
        return prev;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(Eintrag next) {
        this.next = next;
    }

    public void setPrev(Eintrag prev) {
        this.prev = prev;
    }
}
