package Lab0;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.geom.Point2D;

import static org.testng.Assert.*;

public class Lab0_t {
    @Test(dataProvider = "arrayProvider")
    public void arr_test(int []mas, int A, int B, int[] res){
        assertEquals(new Lab0().myArray(mas,A,B),res);
    }

    @DataProvider
    public Object[][] arrayProvider(){
        return new Object[][] {
                {new int[]{5, 3, 1, 0, 0}, 1, 4,
                        new int[]{5, 5, 4, 14, 43}},
                {new int[]{1, 3, 0, 1, 0}, 0, -55,
                        new int[]{0, -55, -140, -185, -295}},
                {new int[]{1, 2, 5,}, 1, 9, new int[]{1,9,10}},
        };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void bad_arr_test() {
        new Lab0().myArray(new int[]{1}, 3, 2);
    }

    @Test(dataProvider = "booleanProvider")
    public void bool_test(int A, int B, int C, boolean res){
        assertEquals(new Lab0().MyBoolean(A,B,C),res);
    }

    @DataProvider
    public Object[][] booleanProvider(){
        return new Object[][] {
                {1,3,3,false},
                {2,1,3, true},
                {1,1,1,false},
        };
    }

    @Test(dataProvider = "caseProvider")
    public void case_test(int type, float val, float res){
        assertEquals(String.format("%.2f",new Lab0().MyCase(type,val)),String.format("%.2f",res));
    }

    @DataProvider
    public Object[][] caseProvider(){
        return new Object[][] {
                {1,123f,12.3000f},
                {4,123f,123000.0f},
                {2,123f,1.2300f},
        };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void bad_case_test() {
        new Lab0().MyCase(0,123f);
    }
    @Test(expectedExceptions = AssertionError.class)
    public void bad_case_zero() {
        new Lab0().MyCase(1,0f);
    }

    @Test(dataProvider = "forProvider")
    public void for_test(float price, String res){
        assertEquals(new Lab0().MyFor(price),res);
    }

    @DataProvider
    public Object[][] forProvider(){
        return new Object[][] {
                {15.48f,"16.84,14.193031,9.1820078,17.213800,42.608007,"},
                {6,"4.2,6.7000008,2.1000006,8.3,6.8000003,"},

        };
    }

    @Test(dataProvider = "ifProvider")
    public void if_test(int A, int B, int res){
        assertEquals(new Lab0().myIf(A,B),res);
    }

    @DataProvider
    public Object[][] ifProvider(){
        return new Object[][] {
                {1,1,2},
                {1,2,2},

        };
    }

    @Test(dataProvider = "integerProvider")
    public void integerTest(int number, int l, int r){
        Point2D point2D = new Lab0().myInteger(number);
        assertEquals(new int[]{(int) point2D.getX(), (int) point2D.getY()},new int[]{l,r});
    }

    @DataProvider
    public Object[][] integerProvider(){
        return new Object[][] {
                {11,6,3,
                {41,43,13}
        };
    }

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int m, int n, int k , int[]mas, int[][] res){
        assertEquals(new Lab0().myMatrix(m,n,k,mas),res);
    }

    @DataProvider
    public Object[][] matrixProvider(){
        return new Object[][] {
                {4, 1, 5,new int[]{1,2,3,4},
                        new int[][]{
                                {6, 2, 3, 4},
                                {3, 6, 9, 12},
                                {4, 8, 27, 36},
                                {24, 74, 11, 121},
                                {63, 122, 293, 363}
                        }
                }
        };
    }

    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(int[]num, String res){
        assertEquals(new Lab0().myMinMax(num),res);
    }

    @DataProvider
    public Object[][] minMaxProvider(){
        return new Object[][] {
                {new int[]{7,1,3,-1,9},"4,-13"}
        };
    }

    @Test(dataProvider = "whileProvider")
    public void whileTest(int k, float res){
        assertEquals(new Lab0().myWhile(k),res);
    }

    @DataProvider
    public Object[][] whileProvider(){
        return new Object[][] {
                {3,3f},
                {4,65}
        };
    }
}
