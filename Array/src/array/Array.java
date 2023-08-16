
package array;


public class Array {

   
    public static void main(String[] args) {
       String[] studentName=new String[10];
       studentName[0]="Rajib";
       studentName[1]="Limon";
       
       int[]marks=new int[10];
       marks[0]=45;
       marks[1]=0;
       marks[2]=45;
       marks[3]=45;
       marks[4]=45;
       marks[5]=45;
       marks[6]=45;
       marks[7]=45;
       marks[8]=45;
       marks[9]=45;
       
       for(int i=0; i<studentName.length; i++){
           System.out.println("Student name is "+studentName[i]+" and mark is "+marks[i]);
       
       }
       
//       for(int mark:marks){
//           System.out.println(mark);
//       }


        
    }
    
}
