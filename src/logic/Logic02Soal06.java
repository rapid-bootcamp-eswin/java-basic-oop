package logic;

public class Logic02Soal06 extends BasicLogic{
    public Logic02Soal06(int n) {
        super(n);
    }

    public void isiArray(){
        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                if(j == n/2 && i <= 1) this.array[i][j] = String.valueOf(1);
                else if(j == n/2) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[i-1][j]) + Integer.parseInt(this.array[i-2][j]));
                else this.array[i][j] = ".";
            }
        }

        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                if(j <= i && i >= n/2 && j >= n-i-1 || j >= i && i <= n/2 && j <= n-i-1) this.array[i][j] = this.array[i][n/2];
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
