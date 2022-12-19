package logic;

public class Logic01Soal04 extends BasicLogic{
    public Logic01Soal04(int n) {
        super(n);
    }

    public void isiArray(){
        int angka1 = 1;
        int angka2 = 2;
        int temp1 = 0;
//        int temp2 = 0;
//        int[] angka = new int[n];

        for (int i = 0; i < this.n; i++) {
            if(i == 0 || i == 1){
                this.array[0][i]= String.valueOf(angka1);
//                angka1 = angka1;
            }else{
                this.array[0][i]= String.valueOf(angka2);
                temp1 = angka1+angka2 ;
                angka1 = angka2;
                angka2 = temp1;

            }




        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
