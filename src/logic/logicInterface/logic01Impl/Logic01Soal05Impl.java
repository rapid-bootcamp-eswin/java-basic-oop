package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka1 = 1;
        int angka2 = 3;
        int angka3 = 1;
        int temp1 = 0;
//        int[] angka = new int[n];

        for (int i = 0; i < this.logic.n; i++) {

            if(i == 0 || i == 1 || i == 2){
                this.logic.array[0][i]= String.valueOf(angka1);
//                angka1 = angka1;
            }else{
                this.logic.array[0][i]= String.valueOf(angka2);
                temp1 = angka1+angka3+angka2 ;
                angka1 = angka3;
                angka3 = angka2;
                angka2 = temp1;

            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}

