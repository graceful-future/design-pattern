package com.gracefulfuture.design.pattern.memento;

/**
* @description      发起人
* @author           chenkun
* @create           2021/5/22 16:06
* @version          1.0
*/
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    /**
    * @description  创建备忘录
    * @author       chenkun
    * @param
    * @date         2021/5/22 16:12
    * @return		com.gracefulfuture.design.pattern.memento.Memento
    */
    public Memento createMemento(){
        return new Memento(state);
    }
    /**
    * @description  恢复备忘录
    * @author       chenkun
    * @param		memento 备忘录
    * @date         2021/5/22 16:12
    * @return		void
    */
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
