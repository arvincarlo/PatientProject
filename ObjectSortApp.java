class ObjectSortApp
  {
  public static void main(String[] args)
   {
   int maxSize = 100;
   ArrayInObj arr = new ArrayInObj(maxSize);

   arr.insert("Alvarado", "Elmer", "Apalit Pampanga", 24);
   arr.insert("Alvarado", "Elmer", "Apalit Pampanga", 59);
   arr.insert("Alvarado", "Elmer", "Apalit Pampanga", 37);
   arr.insert("Alvarado", "Elmer", "Apalit Pampanga", 107);
   arr.insert("Alvarado", "Elmer", "Apalit Pampanga",  43);
   arr.insert("Alvarado", "Erwin", "Apalit Pampanga", 21);
   arr.insert("Alvarado", "Elmer", "Apalit Pampanga", 29);
   arr.insert("Alvarado", "Elmer", "Apalit Pampanga", 72);
   arr.insert("Alvarado", "Elmer", "Apalit Pampanga", 22);
   arr.insert("Alvarado", "Edwin", "Apalit Pampanga", 18);

   System.out.println("Before sorting:");
   arr.display();

   arr.selectionSort();

   System.out.println("After sorting:");
   arr.display(); 
   }
  }