package Syntax_and_Basics;

public class Sort {
    public static void main(String args[]) throws Exception {
        int i,n,opt1=0,opt2=0;
        int list[],l1[];
        read ob = new read();
        Sort sort = new Sort();
        display show = new display();

        do{
            int flag = -1;
            System.out.println("\t\t*****Menu*****\n");
            System.out.println("[1]: Random List.");
            System.out.println("[2]: Manual List.");
            System.out.println("[3]: Existing List.");
            System.out.println("[9]: Quit.");
            opt1 = ob.readInt("Choose An Option");
            System.out.println();
            n = ob.readInt("Enter size of the List");
            list = new int[n];
            l1 = new int[n];
            int l2[] = {52, 45, 86, 31, 41, 85, 59, 49, 85, 61};

            switch(opt1){
                case 1 : flag = 1;
                    for(i=0; i<n; i++){
                        list[i] = ob.readRandom();
                    }
                break;

                case 2 : flag = 2;
                    for(i=0; i<n; i++){
                        list[i] = ob.readInt("Enter Element["+(i+1)+"]");
                    }
                break;

                case 3 : flag = 3;
                    list = l2;
                break;

                case 9 : System.out.println("You Choose to Quit...Terminating...!");
                break;

                default : System.out.println("You Choose an Invalid option...");
            }

            System.out.println();
            show.list(list, n);

            if(flag != -1){
                do{
                    System.out.println("\t\t*****Menu*****\n");
                    System.out.println("[1]: Bubble Sort.");
                    System.out.println("[2]: Selection Sort.");
                    System.out.println("[3]: Insertion Sort.");
                    System.out.println("[4]: Merge Sort");
                    System.out.println("[9]: Input New list.");
                    System.out.println("[99]: Quit.");
                    opt2 = ob.readInt("Choose An Option");

                    switch(opt2){
                        case 1 : l1 = list.clone();
                            sort.bubble(l1, n);
                        break;

                        case 2 : l1 = list.clone();
                            sort.selection(l1, n);
                        break;

                        case 3 : l1 = list.clone();
                            sort.insertion(l1, n);
                        break;

                        case 4 : l1 = list.clone();
                            sort.mergeSort(list, n);
                        break;

                        case 9 : break;

                        case 99: System.out.println("You Choose to Quit...Terminating...!");
                            System.exit(0);
                        break;

                        default : System.out.println("You Choose an Invalid option...");
                    }

                    show.list(l1, n);
                } while(opt2 != 9);
            }

        } while(opt1 != 9);
    }

    void test(int[] list, int n){
        int i;
        for(i=0; i<n-1; i++){
            if(list[i] > list[i+1]){
                System.out.println("\nTest Failed Due to anomaly at index-["+i+"]\n");
                return;
            }
        }
        System.out.println("\nTest Passed...!\n");
    }

    void bubble(int[] list, int n){
        int i,j,temp;
        display show = new display();
        var srt = new Sort();

        System.out.println("\nTest Initialized...");
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
        srt.test(list, n);
        System.out.println("Test Completed...");
    }

    void selection(int[] list, int n){
        int i,j,x,ind;
        var show = new display();
        var srt = new Sort();
        
        System.out.println("\nTest Initialized...");
        for(i=0; i<n-1; i++){
            x = list[i];
            ind = -1;
            for(j=i+1; j<n; j++){
                if(list[j] < x){
                    x = list[j];
                    ind = j;
                }
            }
            if(ind != -1){
                list[ind] = list[i];
                list[i] = x;
            }
            show.list(list, n);
        }
        srt.test(list, n);
        System.out.println("Test Completed...");
    }

    void insertion(int[] list, int n) {
        int i,j,x;
        var show = new display();
        var srt = new Sort();
        
        System.out.println("\nTest Initialized...");
        for(i=1; i<n; i++){
            x = list[i];
            j = i-1;
            while(j>=0 & list[j]>x){
                list[j+1] = list[j];
                j--;
                if(j==-1) break;
            }
            list[j+1] = x;
            show.list(list, n);
        }
        srt.test(list, n);
        System.out.println("\t\tTest Completed...\n");
    }

    void mergeSort(int[] list, int n){
        int p = 0;
        int r = n-1;
        var show = new display();
        var srt = new Sort();

        System.out.println("\n\t\tTest Initialized...");
        System.out.println();
        devideList(list, p, r);
        System.out.println();
        show.list(list, n, "Sorted List");
        srt.test(list, n);
        System.out.println("\t\tTest Completed...\n");
    }

    void devideList(int[] list, int p, int r){
        var show = new display();

        if(p < r){
            int q;
            q = (p+r)/2;

            show.list(list, p, r);

            devideList(list, p, q);

            devideList(list, q+1, r);
            Merge(list, p, q, r);
        }

    }

    void Merge(int[] list, int p, int q, int r){
        //var show = new display();
        int n1, n2, i, j, k, t, z;
        n1 = q - p + 1;
        n2 = r - q;

        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(i=0; i<n1; i++){
            L[i] = list[p+i];
        }
        //show.list(L,n1,"L");

        for(j=0; j<n2; j++){
            R[j] = list[q + j + 1];
        }
        //show.list(R, n2,"R");

        i = 0;
        j = 0;

        for(k = p; k<r & i<n1 & j<n2; k++){
            if(L[i] <= R[j]){
                i++;
            }else{
                list[k] = R[j];
                z = k+1;
                for(t=0; t<n1-i; t++){
                    list[z] = L[t+i];
                    z++;
                }
                j++;
            }
        }
    }
}
