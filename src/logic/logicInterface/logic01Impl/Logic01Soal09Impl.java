package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal09Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal09Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int a = 1;
        int b = 0;
        for (int i = 0; i < this.logic.n; i++) {
            if(i == 0){
                this.logic.array[0][i]= String.valueOf(a);
                a = a * 3;
            }else if (i == 1){
                this.logic.array[0][i]= String.valueOf(a);

            }else {
                b = a * 3;
                this.logic.array[0][i]= String.valueOf(b);
                a = b;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
