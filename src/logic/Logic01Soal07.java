package logic;

public class Logic01Soal07 extends BasicLogic{
    public Logic01Soal07(int n) {
        super(n);
    }

    public void isiArray(){
        char a = 'A';
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(a);
            a++;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}