class ArrayInObj
  {
    private Patient[] a;
    private int nElems;

  public ArrayInObj(int max)
   {
     a = new Patient[max];
     nElems = 0;
   }

  public void insert(String last, String first, String add, int age)
   {
     a[nElems] = new Patient(last, first, add, age);
     nElems++;
   }

  public void display()
   {
     for(int j=0; j<nElems; j++)
       a[j].displayPatient();
     System.out.println("");
   }

  public void insertionSort()
   {
     int in, out;

     for(out=1; out<nElems; out++)
       {
       Patient temp = a[out]; 
       in = out;

       while(in>0 && a[in-1].getAge() > temp.getAge())
        {
        a[in] = a[in-1]; 
        --in;
        }
       a[in] = temp;
       }
   } 

   public void bubbleSort() 
    {
      int i,j;
      for (i=0; i<nElems-1; i++)
        {  
          for (j=0; j<nElems-1; j++)
           {
              Patient temp = a[j];
              if (a[j].getAge() > a[j+1].getAge()) 
                {
                  a[j]=a[j+1];
                  a[j+1]=temp;
                }
           }
        }
    }

    public void selectionSort() 
      {
        int i,j;
        for (i=0; i<nElems-1; i++) 
          {
            Patient index = a[i];
            for (j=i+1; j<nElems; j++)
              {
                if (index.getAge() > a[j].getAge()) 
                {
                  a[j]=a[j+1];
                  a[j+1]=index;
                }
              }
          }
      }

  } // end of ArrayInObj class