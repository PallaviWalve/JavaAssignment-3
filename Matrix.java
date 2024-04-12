//Create a class called &#39;Matrix&#39; containing constructor 
//that initializes the number of rows and number of columns of a 
//new Matrix object. The Matrix class has the following information:
//a. number of rows of matrix
//b. number of columns of matrix
//c. elements of matrix in the form of 2D array
//The Matrix class has methods for each of the following:
//a. get the number of rows
//b. get the number of columns
//c. set the elements of the matrix at given position (i,j)
//d. adding two matrices. If the matrices are not addable, &quot;
//Matrices cannot be added&quot; will be displayed.

package assignment3;

public class Matrix {
		private int rows;
		private int col;
		private int matrix[] [];
		
public Matrix(int rows, int col) {
			super();
			this.rows = rows;
			this.col = col;
			matrix = new int [rows][col];
		}

public int getRows() {
			return rows;
		}

public int getColumns() {
			return col;
		}
		
public void insertElement(int i,int j,int value)
		{
			if(i>=0 &&i<rows && (j>=0 && j<col))
			{
				matrix[i][j]=value;
			}
			else
			{
				System.out.println("invlaid index position");
			}
		}
		
public static  Matrix addMatrices(Matrix matrix1,Matrix matrix2)
		{
			if(matrix1.rows!=matrix2.rows || matrix1.col !=matrix2.col)
					{
						System.out.println("Matrices cannot add");
						return null;
					}
			else
			{
				Matrix result =new Matrix(matrix1.rows,matrix2.col);
				for(int i=0;i<matrix1.rows;i++)
				{
					for(int j=0;j<matrix1.col;j++)
					{
						result.matrix[i][j]=matrix1.matrix[i][j]+matrix2.matrix[i][j];
					}
				}
				return result;
			}
		}

		public void display()
		{
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(matrix[i][j]+" "); 
				}
				System.out.println();
			}
		}

		public static void main(String[] args) {
			Matrix one=new Matrix(2,2);
			Matrix two=new Matrix(2,2);
			one.insertElement(0, 0, 1);
			one.insertElement(0, 1, 1);
			one.insertElement(1, 0, 1);
			one.insertElement(1, 1, 1);
			two.insertElement(0, 0, 2);
			two.insertElement(0, 1, 2);
			two.insertElement(1, 0, 2);
			two.insertElement(1, 1, 2);
			Matrix result=addMatrices(one,two);
			result.display();

		}

	}



