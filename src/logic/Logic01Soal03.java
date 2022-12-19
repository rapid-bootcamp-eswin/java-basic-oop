package logic;

public class Logic01Soal03 extends BasicLogic{
    public Logic01Soal03(int n) {
        super(n);
    }

    public void isiArray(){
        int angka1 = 0;
        int angka2 = 2;
//        int[] angka = new int[n];

        for (int i = 0; i < this.n; i++) {
            if(i == 0){
                this.array[0][i]= String.valueOf(angka1);
//                angka1 = angka2+3;
            }else{
                this.array[0][i]= String.valueOf(angka2);
                angka2 = (angka2+2);
            }




        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
