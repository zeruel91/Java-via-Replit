class Main {
  public static void main(String[] args) {
    int n = 10;
    int[] array = {7,5,9,0,3,1,6,2,4,8};

    for (int i = 0; i<n;i++){
      int min_index = i;
      for (int j = i+1;j<n;j++){
        if (array[min_index]>array[j]){
          min_index = j;
        }
      }
      int t = array[i];
      array[i] = array[min_index];
      array[min_index] = t;
    }
    for(int i = 0; i<n;i++){
    System.out.print(array[i]+" ");
    }




  }
}

//0 1 2 3 4 5 6 7 8 9
