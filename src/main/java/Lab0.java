
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Lab0 {
    public Point myInteger(int num){
        assert (num > 9 || num < -9);
        return new Point(num/10+num%10,num/10*num%10);
    }
    public boolean myBoolean(int a,int b,int c){
        return a<b && b<c;
    }
    public float myIf(float a, float b){
        return Math.max(a, b);
    }
    public float myCase(int type, float mass){
        switch (type){
            case 1:
                return mass;
            case 2:
                return mass/1000000;
            case 3:
                return mass/1000;
            case 4:
                return mass*1000;
            case 5:
                return mass*100;
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
    public long myFor(int a,int b){
        assert (a>b);
        long res = 0;
        for (int i = a; i<=b;i++){
            res+=i;
        }
        return res;
    }
    public int myWhile(int k,int n){
        assert (n>0);
        while (k*k<n){
            k++;
        }
        return k;
    }
    public Point myMinMax(int[] mas){
        IntStream stream = IntStream.range(0,mas.length);
        return new Point(stream.max().getAsInt(),stream.min().getAsInt());
    }
    public int[] myArray(int[] mas){
        int[] res = new int[mas.length];
        for (int i = 0; i<mas.length;i++){
            res[mas.length-i]=mas[i];
        }
        return res;
    }
    public int[] myMatrix(int[][]matrix, int k){
        assert (k>1 && k<matrix.length);
        return matrix[k];
    }

}
