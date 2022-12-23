package nameCRUD;

import java.util.LinkedList;
import java.util.Scanner;

public class NameRecordManagement {

    LinkedList<Record> list;

    public NameRecordManagement() {
        list=new LinkedList<>();
    }

    public boolean find(int idNum){
        for (Record l : list){
            if(l.getId()==idNum){
                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    public Record findRecord(int idNumber){
        for (Record lm : list){
            if (lm.getId()==idNumber){
                return lm;
            }
        }
        return null;
    }

    public void add(Record record){
        if (!find(record.getId())){
            list.add(record);
        }
        else
            System.out.println("Record already exists in the Record List");
    }

    public void delete(int recId){
        Record recordDel=null;

        for (Record ld : list){
            if (ld.getId()==recId){
                recordDel=ld;
            }
        }

        if (recordDel==null){
            System.out.println("Invalid record Id");
        }
        else {
            list.remove(recordDel);
            System.out.println("Successfully removed record from list");
        }
    }

    public void update(int id, Scanner input){
        if (find(id)){
            Record rec= findRecord(id);
            System.out.println("What is the new Name Id ?");
            int idNUm=input.nextInt();
            input.nextLine();

            System.out.println("What is the new Name ? ");
            String name =input.nextLine();

            rec.setId(idNUm);
            rec.setName(name);
            System.out.println("Record Update Successfully");

        }
        else {
            System.out.println("Record Not Found in the Name List");
        }
    }

    public void display(){
        if (list.isEmpty()){
            System.out.println("The List has no records");
        }
        for (Record record : list){
            System.out.println(record.toString());
        }
    }
}
