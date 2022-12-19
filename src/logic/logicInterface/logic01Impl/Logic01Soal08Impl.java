package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal08Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal08Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        char a = 'A';
        int b = 2;
        for (int i = 0; i < this.logic.n; i++) {
            if(i % 2 == 0){
                this.logic.array[0][i]= String.valueOf(a);
            }else {
                this.logic.array[0][i]= String.valueOf(b);
                b+=2;
            }
            a++;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
