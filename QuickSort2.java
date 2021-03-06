package Problem_Solving_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort2 {
    static void quickSort(int[] ar) {
        quicksort(ar,0,ar.length);
    }
    static void quicksort(int ar[],int st,int en){
        if(st>=en){
            return;
        }
        else{
            int pos=partition(ar,st,en);

            quicksort(ar,st,pos);
            quicksort(ar,pos+1,en);
            if(st!=en-1)
                printArray(ar,st,en);
        }
    }
    static int partition(int[] ar,int st,int en) {
        if(st==en)
            return st;
        int p=ar[st];
        ArrayList<Integer> leftList=new ArrayList<Integer>();
        ArrayList<Integer> rightList=new ArrayList<Integer>();
        for(int i=st+1;i<en;i++){
            if(ar[i]>p){
                rightList.add(ar[i]);
            }
            else{
                leftList.add(ar[i]);
            }
        }
        copy(leftList,ar,st);
        ar[st+leftList.size()]=p;
        copy(rightList,ar,st+leftList.size()+1);
        return st+leftList.size();
    }
    static void copy(ArrayList<Integer> list,int[] ar,int startIdx){
        for(int num:list){
            ar[startIdx++]=num;
        }
    }

    static void printArray(int[] ar,int st,int en) {
        for(int i=st;i<en;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }


   
}
