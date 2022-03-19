package work6.exercise1.groups;

import work6.exercise1.mountaineers.Mountaineer;

/*Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
        идёт набор в группу или нет;
        массив альпинистов;
        гора;
        должна быть возможность добавить альпиниста в группу, если набор ещё идёт
*/

public class Group {
    private Mountaineer[] members = new Mountaineer[3]; // null, null, null
    public boolean full;
    // setter добавлениев группу

    public void setMembers(Mountaineer[] members) {
        for (int i = 0; i < members.length; i += 1) {
            if (this.members[i] == null) {
              //  this.members[i]. = ;
                System.out.println("Добавлен");
                return;
            } else {
                System.out.println("Группа заполнена");
                return;
            }
        }
    }
}
