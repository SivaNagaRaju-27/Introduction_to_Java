package Syntax_and_Basics;

public class display {
    public void list(int[] list, int n){
        System.out.print("List = [");
        for(int i=0; i<n; i++){
            if(i<n-1){
                System.out.print(list[i]+" ");
            }else{
                System.out.println(list[i]+"]");
            }
        }
    }

    void list(int[] list, int p, int r){
        System.out.print("List = [");
        for(int i=p; i<=r; i++){
            if(i < r){
                System.out.print(list[i]+" ");
            }else{
                System.out.println(list[i]+"]");
            }
        }
    }

    void list(int[] list, int n, String str){
        System.out.print(str+" = [");
        for(int i=0; i<n; i++){
            if(i<n-1){
                System.out.print(list[i]+" ");
            }else{
                System.out.println(list[i]+"]");
            }
        }
    }
}
