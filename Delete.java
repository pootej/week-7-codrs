import java.util.Scanner;
class Delete{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={10,20,7,8,5,1,3};
    System.out.println("Enter the value to be deleted:");
    int value=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=value){
        System.out.println(arr[i]+" ");
      }
    }
  }
}