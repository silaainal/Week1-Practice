public class ManualList {
    private int[] data;
    private int size;

    public ManualList(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            System.out.println("List is full");
            return;
        }
        data[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }
        return data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void print() {
        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
