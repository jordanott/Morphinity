import java.util.*;

public class MatrixOperations{
  Matrix A;
  Matrix B;
  public MatrixOperations(Matrix A, Matrix B){
    this.A = A;
    this.B = B;
  }
  public Matrix operation(String expr){
    //works for case a = b when b exists (add a check that b exists)
    //for a = b+c
    //a=newValue
    //b=value1
    //c=value2
    Matrix result  = new Matrix(new ArrayList<ArrayList<Double>>());

    double result_element = 0;
    double A_element;
    double B_element;

    int column_size = A.getColumn(0).size();
    int row_size = A.getRow(0).size();

    for(int i=0; i<column_size; ++i)
    {
      for(int j=0; j<row_size; ++j)
      {
        A_element = A.getElement(i,j);
        B_element = B.getElement(i,j);
        switch(expr){
          case "+":
          result_element = A_element + B_element;
          break;

          case "-":
          result_element = A_element - B_element;
          break;

          case ".":
          result_element = A_element * B_element;
          break;
        }
        result.setElement(i,j, result_element);
      }
    }
    return result;
  }
  public Matrix multiplication(){

    int row_size_A = A.getRow(0).size();
    int column_size_B = B.getColumn(0).size();
    Matrix result_matrix = new Matrix(new ArrayList<ArrayList<Double>>());
    if (row_size_A != column_size_B) {
      // problem
    }
    else{

      double result_val = 0;
      int a_row_i = 0;
      for(ArrayList<Double> A_row: A.values){
        for(int b_col_i=0; b_col_i < B.getRow(0).size(); ++b_col_i){
          ArrayList<Double> b_col = B.getColumn(b_col_i);
          for(int i=0;i<b_col.size();++i){
          
            result_val += b_col.get(i) * A_row.get(i);
          }
          result_matrix.setElement(a_row_i,b_col_i,result_val);
          result_val = 0;
        }
        ++a_row_i;
      }
    }
    return result_matrix;
  }
}
