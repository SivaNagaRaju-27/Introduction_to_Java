package DataStructures_And_Algorithms;

import Syntax_and_Basics.display;
import Syntax_and_Basics.readInt;
import Syntax_and_Basics.readRandInt;

public class SortArrayDemo {
    public static void main(String args[])throws Exception{
        int i,n,opt1 = 0, opt2 = 0;
        int list[], l1[];
        readInt ob = new readInt();
        readRandInt ob1 = new readRandInt();
        SortArray sort = new SortArray();
        display show = new display();

        do{
            int flag = -1;
            System.out.println("\t\t*****Menu*****\n");
            System.out.println("[1]: Random List.");
            System.out.println("[2]: Manual List.");
            System.out.println("[3]: Existing List.");
            System.out.println("[9]: Quit.");
            opt1 = ob.readInteger("Choose An Option");

            if(opt1 == 9) System.exit(0);

            n = ob.readInteger("Enter size of the List");
            list = new int[n];
            l1 = new int[n];
            int l2[] = {10, 60, 20, 65, 25, 53, 42, 50, 90, 50};

            switch(opt1){
                case 1 : flag = 1;
                    for(i=0; i<n; i++){
                        list[i] = ob1.readRandom();
                    }
                break;

                case 2 : flag = 2;
                    for(i=0; i<n; i++){
                        list[i] = ob.readInteger("Enter Element["+(i+1)+"]");
                    }
                break;

                case 3 : flag = 3;
                    list = l2;
                break;

                default : System.out.println("You Choose an Invalid option...");
            }

            System.out.println();
            show.list(list, n);

            if(flag != -1){
                System.out.println("\t\t*****Menu*****\n");
                System.out.println("[1]: Selection Sort.");
                System.out.println("[2]: Insertion Sort.");
                System.out.println("[3]: Merge Sort");
                System.out.println("[4]: Quick Sort.");
                System.out.println("[99]: Quit.");
                opt2 = ob.readInteger("Choose An Option");

                switch(opt2){

                    case 1 : l1 = list.clone();
                        sort.selectionSort(l1);
                        show.list(l1, n);
                    break;

                    case 2 : l1 = list.clone();
                        sort.insertionSort(l1);
                        show.list(l1, n);
                    break;

                    case 3 : l1 = list.clone();
                        sort.mergeSort(l1);
                        show.list(l1, n);
                    break;

                    case 4 : l1 = list.clone();
                        sort.quickSort(l1);
                        show.list(l1, n);
                    break;

                    case 99: System.out.println("You Choose to Quit...Terminating...!");
                        System.exit(0);
                    break;

                    default : System.out.println("You Choose an Invalid option...");
                }
            }

        } while(true);
    }
}
