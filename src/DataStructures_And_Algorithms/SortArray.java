package DataStructures_And_Algorithms;

public class SortArray {
    void selectionSort(int[] list){
        int i,j,x,ind,n;
        n = list.length;

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
        }
    }

    void insertionSort(int[] list){
        int i,j,x,n;
        n = list.length;

        for(i=1; i<n; i++){
            x = list[i];
            j = i-1;
            while(j>=0 & list[j]>x){
                list[j+1] = list[j];
                j--;
                if(j==-1) break;
            }
            list[j+1] = x;
        }
    }

    void mergeSort(int[] list){
        int n = list.length;
        int p = 0;
        int r = n-1;

        devideList(list, p, r);
    }

    void devideList(int[] list, int p, int r){
        if(p < r){
            int q;
            q = (p+r)/2;

            devideList(list, p, q);
            devideList(list, q+1, r);
            MergeList(list, p, q, r);
        }
    }

    void MergeList(int[] list, int p, int q, int r){
        int n1, n2, i, j, k, z, t;
        n1 = q - p + 1;
        n2 = r - q;

        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(i=0; i<n1; i++){
            L[i] = list[p+i];
        }

        for(j=0; j<n2; j++){
            R[j] = list[q + j + 1];
        }

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

    void quickSort(int[] list){
        int n = list.length;
        int p = 0;
        int r = n-1;

        QuickAlign(list, p, r);
    }

    void QuickAlign(int[] list, int p, int r){
        if(p<r){
            int i, j, temp, x;
            x = list[r];
            j = p;

            for(i=p; i<=r; i++){
                if(list[i] <= x){
                    if(i != p){
                        temp = list[j];
                        list[j] = list[i];
                        list[i] = temp;
                    }
                    j++;
                }
            }

            partitionList(list, j-1, p, r);
        }
    }

    void partitionList(int[] list, int x, int p, int r){
        QuickAlign(list, p, x-1);
        QuickAlign(list, x+1, r);
    }
}
