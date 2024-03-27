package net.wargaming.test.tasks;

public record Page(int pageNumber) implements Comparable<Page> {

    @Override
    public int compareTo(Page other) {
        return Integer.compare(this.pageNumber, other.pageNumber);
    }
}
