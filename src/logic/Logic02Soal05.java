package logic;

public class Logic02Soal05 extends BasicLogic{
    public Logic02Soal05(int n) {
        super(n);
    }

    public void isiArray(){
        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                if(i == n/2 && j <= 2) this.array[i][j] = String.valueOf(1);
                else if(i == n/2) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[i][j-1]) + Integer.parseInt(this.array[i][j-2]) +  Integer.parseInt(this.array[i][j-3]));
                else this.array[i][j] = ".";
            }
        }

        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                if (j <= i && j <= n/2 && i <= n/2|| j >= i && j >= n/2 && i >= n/2 || j <= i && i >= n/2 && j <= n-i-1 || j >= i && i <= n/2 && j >= n-i-1) this.array[i][j] = this.array[n/2][j];
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
