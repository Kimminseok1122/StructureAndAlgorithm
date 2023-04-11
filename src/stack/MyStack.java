package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyStack<T> {

    private List<T> stack = new ArrayList<>();

    public void push(T t) {
        stack.add(t);
    }

    public Optional<T> pop() {
        if (stack.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(stack.remove(stack.size() - 1));
    }
}
