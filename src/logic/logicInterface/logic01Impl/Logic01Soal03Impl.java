package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal03Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal03Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka1 = 0;
        int angka2 = 2;
//        int[] angka = new int[n];

        for (int i = 0; i < this.logic.n; i++) {
            if(i == 0){
                this.logic.array[0][i]= String.valueOf(angka1);
//                angka1 = angka2+3;
            }else{
                this.logic.array[0][i]= String.valueOf(angka2);
                angka2 = (angka2+2);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
