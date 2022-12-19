package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal10Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal10Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int a = 0;
        for (int i = 0; i < this.logic.n; i++) {
            if(i <= 1){
                this.logic.array[0][i]= String.valueOf(i);
            }else {
                a = i * i * i;
                this.logic.array[0][i]= String.valueOf(a);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
