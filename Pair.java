package HomeworkSix;

public class Pair<I, S> {
    private I first;
    private S last;

    public Pair(I first, S last) {
        this.first = first;
        this.last = last;
    }

    public I getFirst() {
        return this.first;
    }

    public S getLast() {
        return this.last;
    }

    public String toString() {
        return "HomeworkSix.Pair{first=" + this.first + ", last=" + this.last + "}";
    }

    public Pair<I, S> swap() {
        return new Pair(this.last, this.first);
    }

    public Pair<I, S> replaceFirstTypeOfElement(Double first, String last) {
        return new Pair(first, last);
    }

    public Pair<I, S> replaceSecondTypeOfElement(int first, Character last) {
        return new Pair(first, last);
    }
}
