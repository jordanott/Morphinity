import java.util.ArrayList;

public class Matrix {
    public ArrayList<ArrayList<Double>> values;

    public Matrix(ArrayList<ArrayList<Double>> m){
        values = m;
    }
    public double getElement(int i, int j){
        // gets the element at the i,j position in the matrix
        if(i < values.size() | j < values.get(0).size()){
            // check size
            return values.get(i).get(j);
        }
        return -101; // or some error value
    }
    public boolean setElement(int i, int j, double newVal){
        if(i < values.size()){
          if(j < values.get(i).size())
            values.get(i).set(j, newVal);
        }
        // sets the element at the i,j position in the matrix
        if(i >= values.size()){
            // check size
            values.add(new ArrayList<Double>());
        }
        if(j >= values.get(i).size()){
            values.get(i).add(newVal);
        }

        return true;
    }
    public ArrayList<Double> getRow(int i){
        // returns the i-th row of the Matrix
        if(i > values.size()){
            // check size
            return null;
        }
        return values.get(i);
    }
    public ArrayList<Double> getColumn(int j){
        // returns the j-th column of the Matrix
        if(j > values.get(0).size()){
            // check size
            return null;
        }
        ArrayList<Double> retArray = new ArrayList<Double>();
        for(int i = 0; i < values.size(); i ++){
            retArray.add(values.get(i).get(j));
        }
        return retArray;
    }
    public void print(){
        String retS = "";
        for(int i = 0; i < values.size(); i++){
            retS += "|\t";
            for(int j = 0; j< values.get(0).size(); j++){
                retS += values.get(i).get(j).toString() + "\t";
            }
            retS += "|\n";
        }
        System.out.println(retS);
    }
}
