package logic;

public class Logic01Soal05 extends BasicLogic{
    public Logic01Soal05(int n) {
        super(n);
    }

    public void isiArray(){
        int angka1 = 1;
        int angka2 = 3;
        int angka3 = 1;
        int temp1 = 0;
//        int[] angka = new int[n];

        for (int i = 0; i < this.n; i++) {

            if(i == 0 || i == 1 || i == 2){
                this.array[0][i]= String.valueOf(angka1);
//                angka1 = angka1;
            }else{
                this.array[0][i]= String.valueOf(angka2);
                temp1 = angka1+angka3+angka2 ;
                angka1 = angka3;
                angka3 = angka2;
                angka2 = temp1;

            }




        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
