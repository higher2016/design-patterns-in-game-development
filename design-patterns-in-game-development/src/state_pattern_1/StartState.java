package state_pattern_1;

/**
 * 开始状态类，在该类中stateBegin方法会将游戏启动时所需要的资源加载。当加载完毕会调用stateUpdate.
 * 然后游戏马上会将游戏场景状态转换为MainMenuState，从而完成StartState/StartScene初始化游戏的任务.
 * 
 * @author JM
 */
public class StartState extends ISceneState {

	public StartState(SceneStateController controller) {
		super(controller);
		this.m_StateName = "StartState";
	}

	public void stateBegin() {
		super.stateBegin();
		// TODO 加载游戏数据/初始化
	}

	public void stateUpdate() {
		// 资源加载完毕后，改变m_Controller状态
		super.stateUpdate();
		m_Controller.setState(new MainMenuState(m_Controller), "MainMenuScene");
	}

}
