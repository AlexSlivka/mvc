package com.geekbrains.mvc;

public class Presenter {

    private final Model mModel;
    private final MainView mView;

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }
//for git
    public void buttonClick(int id) {
        int newModelValue;
        switch (id) {
            case 1:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                mView.setButtonText(1, newModelValue);
                break;

            case 2:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                mView.setButtonText(2, newModelValue);
                break;

            case 3:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                mView.setButtonText(3, newModelValue);
                break;
        }
    }
}
