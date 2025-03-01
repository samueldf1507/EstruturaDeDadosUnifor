package EstruturaDeDados.Unifor.Aula02.test;

import EstruturaDeDados.Unifor.Aula02.domain.StaticList;

public class StaticListTest {
    public static void main(String[] args) {
        StaticList staticList = new StaticList(10);

        staticList.insertAtTheBeggining(5);
        staticList.insertAtTheEnd(4);
        staticList.insertAtTheEnd(17);
        staticList.insertAtTheEnd(14);

        //Lista supostamente deve ser: [5, 4, 17, 14]
        staticList.showList();

        staticList.removeAtTheBeginning();
        staticList.removeAtTheEnd();

        //Lista supostamente deve ser: [4, 17]
        staticList.showList();

        staticList.insertPosition(7, 1);
        staticList.removePosition(2);

        //Lista supostamente deve ser [4, 7]
        staticList.showList();
    }
}
