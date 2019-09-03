package composite_pattern;

public interface Component {

    void add(Component com);
    void remove(Component com);

    void display(int depth);
}
