package Syntax_and_Basics;

public class bubbleSort {
    public static void main(String args[]) throws Exception {
        int i,n,opt=0;
        int list[];
        read ob = new read();
        bubbleSort bubble = new bubbleSort();
        display show = new display();

        n = ob.readInt("Enter size of the List");
        list = new int[n];

        do {
            System.out.println("\t\t*****Menu*****\n");
            System.out.println("[1]: Random List.");
            System.out.println("[2]: Manual List.");
            System.out.println("[3]: Quit.");

            opt = ob.readInt("Choose An Option");
            switch(opt){
                case 1 :
                    for(i=0; i<n; i++){
                        list[i] = ob.readRandom();
                    }
                    show.list(list, n);
                    bubble.sort(list,n);
                    show.list(list, n);
                break;

                case 2 : 
                    for(i=0; i<n; i++){
                        list[i] = ob.readInt("Enter Element-["+(i+1)+"]");
                    }
                    show.list(list, n);
                    bubble.sort(list,n);
                    show.list(list, n);
                break;

                case 3 : break;

                default : System.out.println("Choose A valid Option...");

            }
        } while(opt != 3);
    }

    private void sort(int[] list, int n){
        int i,j,temp;
        display show = new display();

        System.out.println("Test Initialized...\n");
        for(i=0; i<n-1; i++){
            for(j=0; j<n-i-1; j++){
                if(list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
                show.list(list, n);
            }
            System.out.println();
        }
        System.out.println("\nTest Completed...");
    }
}
