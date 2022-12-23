package nameCRUD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NameRecordManagement hr =new NameRecordManagement();

        Record record=new Record();

        record.setId(1);
        record.setName("Gojo");
        hr.add(record);

        Scanner sc=new Scanner(System.in);

        int option=0;

        do {
            menu();
            option= sc.nextInt();


            switch (option){
                case 1:
                    System.out.print("What is  id Number ?");
                    int idNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("what is your Name ? ");
                    String name =sc.nextLine();

                    record =new Record(idNumber,name);
                    hr.add(record);
                    System.out.println(record.toString());
                    break;

                case 2:
                    System.out.println("What is id Number ?");
                    int  nId = sc.nextInt();
                    hr.delete(nId);
                    break;

                case 3:
                    System.out.println("What is the Name id number ?");
                    int nIdNo= sc.nextInt();
                    hr.update(nIdNo,sc);

                    break;

                case 4:
                    System.out.println("What is the Name id ?");
                    int nameId= sc.nextInt();

                    if (!hr.find(nameId)){
                        System.out.println("Name id does not exist");
                    }

                    break;

                case 5:
                    hr.display();
                    break;

                case 6:
                    System.out.println("Thank For using the program. GoodBye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input");
                    break;

            }


        }while (option != 6);




    }
    public static void menu(){
        System.out.println("1: Add Name");
        System.out.println("2: Delete Name");
        System.out.println("3: Update Name");
        System.out.println("4: Search Name");
        System.out.println("5: Display Names");
        System.out.println("6: Exit Program");
        System.out.println("Enter Your Selection : ");

    }
}
