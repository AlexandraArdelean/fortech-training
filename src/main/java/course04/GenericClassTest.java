package course04;

public class GenericClassTest<T> {
    private T data;

    public GenericClassTest(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "GenericClassTest{" +
                "data=" + data +
                '}';
    }
}
