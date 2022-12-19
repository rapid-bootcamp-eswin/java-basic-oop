package logic;

public class Logic02Soal04 extends BasicLogic{
    public Logic02Soal04(int n) {
        super(n);
    }

    public void isiArray(){
        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                if(j<=1 && i == 0) this.array[i][j]= String.valueOf(1);
                else if(i==0) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[i][j-1]) + Integer.parseInt(this.array[i][j-2]));
                else if (j == 0 || j==n/2 || j==n-1 || i == n/2 || i == n-1) this.array[i][j] =this.array[0][j];
                else this.array[i][j] = ".";
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
