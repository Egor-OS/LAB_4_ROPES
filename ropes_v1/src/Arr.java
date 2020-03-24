public class Arr {

    public  Arr(int size){
        Array = new int[size];
    }
    int [] Array;

    public void General_arr (int size){


        int counter=0;

        for (int i = 0; i<size;i++){
            add_item(i); }
        //show(Array,Array.length);

        while (check_child(0)!=0){
        restore(0);
        counter+=Array[0];}
        System.out.println("COUNT ==>> " + counter);

    }

    public byte check_child(int index){
        int size = Array.length; byte i=0;
        if ((size>(index*2)+2) && (Array[(index*2)+2]!=0)) { i += 2; }
        if ((size>(index*2)+1) && (Array[(index*2)+1]!=0)) { i += 1; }
        return i;
    }

    public int min_child(int index){
        if (check_child(index) == 1) return  (index*2)+1;
        else if (check_child(index)==2) return (index*2)+2;
            else if (Array[ind_c(index,1)] >= Array[ind_c(index,2)]) { return ind_c(index,2);}
                else return  ind_c(index,1);
    }

    public void restore(int index){
        while (check_child(index)!=0) {
            if (index!=0) {
            Array[index]= Array[min_child(index)];
            } else {Array[index]+=Array[min_child(index)]; }
            index= min_child(index);
        }
        Array[index]=0;
        //System.out.println();
    }

    public int ind_c(int index, int S){
        if (S==1) { return (index*2)+1;}
        else { return (index*2)+2;}
    }

    public  int rand (){
        int number;
        number = (int)(1+Math.random()*20);
        return number;
    }

    public int parent(int pos){
            return ((pos-1)/2);
    }

    public void add_item(int cur_pos){
        Array[cur_pos] = rand();
        int pos = cur_pos;

        while ((pos>0)&&(Array[pos]<Array[parent(pos)])){
        int sw = Array[pos];
            Array[pos]= Array[parent(pos)];
            Array[parent(pos)]=sw;
        pos = parent(pos);
        }
    }

    public  static void show(int [] arr, int size ){
        for (int i = 0; i< size; i++ ){

            System.out.print("[ "+arr[i]+" ] ");

            double xx = (Math.log(i+2)/Math.log(2));
            if ((xx)-Math.round(xx)==0) {
                System.out.println();
            }
        }

    }
}
