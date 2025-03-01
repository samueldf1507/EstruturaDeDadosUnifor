package EstruturaDeDados.Unifor.Aula02.domain;

public class StaticList {
    public int numberOfElements;
    public int capacity;
    public int[] vector;

    public StaticList(int cap) {
        vector = new int[cap];
        numberOfElements = 0;
        capacity = cap;
    }

    public boolean isFull() {
        return numberOfElements == capacity;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    //Imprime a lista na tela
    public void showList() {
        System.out.println("Lista: ");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(vector[i]);
            if (i < numberOfElements - 1) {
                System.out.println(" ");
            }
        }
        System.out.println();
    }


    //Adiciona um elemento no final da lista
    public void insertAtTheEnd(int element) {
        if (isFull()) {
            System.out.println("A lista estaá cheia!");
        }

        vector[numberOfElements] = element;
        numberOfElements++;
    }

    //Remove o último elemento da lista
    public double removeAtTheEnd() {
        if (isEmpty()) {
            System.out.println("A lista está vazia!");
        }
        int removedElement = vector[numberOfElements - 1];
        numberOfElements--;
        return removedElement;
    }

    //Adiciona um elemento no ínicio da lista
    public void insertAtTheBeggining(int element) {
        if (isFull()) {
            System.out.println("A lista está vazia");
        }

        for (int i = numberOfElements; i > 0 ; i--) {
            vector[i] = vector[numberOfElements - 1];
        }
        vector[0] = element;
        numberOfElements++;
    }

    //Remove um elemento no início da lista
    public double removeAtTheBeginning() {
        if (isEmpty()) {
            System.out.println("A lista está vazia!");
        }

        int removedElement = vector[0];
        for (int i = 1; i < numberOfElements; i++) {
            vector[i - 1] = vector[i];
        }
        numberOfElements--;
        return removedElement;
    }

    //Adiciona um elemento numa posição específica da lista
    public void insertPosition(int element, int pos) {
        if (isFull()) {
            System.out.println("A lista está cheia!");
            return;
        }
        for (int i = numberOfElements; i < pos; i--) {
            vector[i] = vector[i - 1];
        }
        vector[pos] = element;
        numberOfElements++;

    }

    //Remove um elemento na posição específica da lista
    public int removePosition(int pos) {
        if (isEmpty()) {
            System.out.println("A lisa está vazia!");
        }
        int removedElement = vector[pos];
        for (int i = pos + 1; i < numberOfElements ; i++) {
            vector[i - 1] = vector[i];
        }
        numberOfElements--;
        return removedElement;
    }
}

