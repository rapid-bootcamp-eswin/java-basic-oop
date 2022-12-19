package logic;

public class Logic02Soal07 extends BasicLogic{
    public Logic02Soal07(int n) {
        super(n);
    }

    public void isiArray(){
        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                this.array[i][j] = "0";
            }
        }

        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                if(j <= 1 || i <= 1 || i >= n-2 || j >= n-2) this.array[i][j] = String.valueOf(1);
                else if(j >= i && j < n - i) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[i-1][n/2]) + Integer.parseInt(this.array[i-2][n/2]));
                else if(j >= n-i-1  && j <= i) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[n-i-2][n/2]) + Integer.parseInt(this.array[n-i-3][n/2]));
                else if(j <= n/2) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[i][j-1]) + Integer.parseInt(this.array[i][j-2]));
                else if (j >= n/2) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[n/2][n-j-2]) + Integer.parseInt(this.array[n/2][n-j-3]));
                else this.array[i][j] = "0";
            }
        }

        for(int i = 0; i< this.n; i++){
            for(int j = 0; j< this.n; j++){
                if(Integer.parseInt(this.array[i][j]) == 0) this.array[i][j] = String.valueOf(Integer.parseInt(this.array[n/2][n-j-2]) + Integer.parseInt(this.array[n/2][n-j-3]));
                if((j <= i && j <= n/2 && i <= n/2 || j >= i && j >= n/2 && i >= n/2 || j <= i && i >= n/2 && j >= n-i-1 && j <= n/2 || j >= i && i <= n/2 && j <= n-i-1 && j >= n/2) == false)
                    this.array[i][j] = ".";
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}
