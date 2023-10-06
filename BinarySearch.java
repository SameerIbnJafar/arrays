// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BinarySearch{
    public static int binarySearch(int a[],int key){
        int start =0;
        int end =(a.length) -1;
        
        while (start<=end){
            
            int mid=(start+end)/2;
            if(key==a[mid]){
                return mid;
            }
            if(key>a[mid]){
                start =mid+1;
            }
            else{
                end =mid-1;
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14,16};
        int key =22;
        System.out.println("The key is at index: "+binarySearch(a,key));
        }
    }


