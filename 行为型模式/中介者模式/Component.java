package 行为型模式.中介者模式;

public abstract class Component {
    protected Mediator mediator;

    //转发调用,属于依赖方法
    public void changed() {
        mediator.componentChanged(this);
    }

    //自己的业务方法,属于自身方法
    public abstract void update();
}
