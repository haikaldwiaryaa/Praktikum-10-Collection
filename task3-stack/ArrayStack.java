import java.util.ArrayList;

public class ArrayStack<T> {
    private final int maxsize;
    private final ArrayList<T> items;

    public ArrayStack(int maxsize) {
        if (maxsize <= 0)
            throw new ArrayStackException(
                    "Stack size must be positive");
        this.maxsize = maxsize;
        this.items = new ArrayList<>();
    }

    public void push(T item) {
        if (items.size() == maxsize)
            throw new ArrayStackException("Overflow Error");
        items.add(item);
    }

    public T pop() {
        if (isEmpty())
            throw new ArrayStackException("Underflow Error");
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static class ArrayStackException extends RuntimeException {
        public ArrayStackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        ArrayStack<Integer> numbers = new ArrayStack<>(3);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());

        ArrayStack<String> texts = new ArrayStack<>(2);
        texts.push("PBO");
        texts.push("Collection");
        System.out.println(texts.pop());
        System.out.println(texts.pop());
        System.out.println("numbers kosong? " + numbers.isEmpty());

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        try {
            numbers.push(40);
        } catch (ArrayStackException e) {
            System.out.println("Overflow test: " + e.getMessage());
        }

        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println("numbers kosong lagi? " + numbers.isEmpty());

        try {
            numbers.pop();
        } catch (ArrayStackException e) {
            System.out.println("Underflow test: " + e.getMessage());
        }
    }
}