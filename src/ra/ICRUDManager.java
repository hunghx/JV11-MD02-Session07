package ra;

public interface ICRUDManager<T,E> {
    void display(T[] list);
    void add(T element);
    void update(T oldElement, T newElement);
    void delete(E id);
}
