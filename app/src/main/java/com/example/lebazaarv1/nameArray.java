package com.example.lebazaarv1;

public class nameArray {
    MyAsyncTask myAsyncTaskObj = MyAsyncTask.getInstance();
    int count2=myAsyncTaskObj.count;
    String[] namearray,nr2;
    public String namearr,namearr1;
int i=0;
    public nameArray() {  // constructor

    }
  public void setNamearray(String namearr) {

        this.namearr = namearr;
        dummy(this.namearr);
       i++;
   }

    public String[] getNamearray() {
       // for (int i = 0; i < count2; i++){
         //   namearray[i]=this.namearr;
        //}
       // nr2=dummy(  );
       // namearray=this.namearray;
        return this.namearray;
       // return namearr[];
    }
    public void dummy(String namearr1){
        while (i<count2){
            namearray[i]=namearr1;
        }
        //m3aya name array gahez now
        this.namearray=namearray;
    }

}
