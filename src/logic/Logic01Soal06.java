package logic;

public class Logic01Soal06 extends BasicLogic{
    public Logic01Soal06(int n) {
        super(n);
    }

    public void isiArray(){
        int angka1 = 2;
        int angka2 = 5;
        int angka3 = 7;

//        int[] angka = new int[n];

        for (int i = 0; i < this.n; i++) {

            if(i == 0 || i ==1) {
                this.array[0][i] = String.valueOf(angka1);
                angka1= angka1+1;
            }
            else if(i==2||i==4||i==6||i==8 ){
                    this.array[0][i]= String.valueOf(angka2);
                    angka2 = angka2+6;
                }
            else{
                this.array[0][i]= String.valueOf(angka3);
                angka3 = angka3+6;
            }


        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
