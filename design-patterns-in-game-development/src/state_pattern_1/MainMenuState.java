package state_pattern_1;

/**
 * 主菜单状态
 * @author	 JM
 */
public class MainMenuState extends ISceneState {

	public MainMenuState(SceneStateController controller) {
		super(controller);
		this.m_StateName = "MainMenuState";
	}

	// 进入战斗状态的方法
	public void stateBegin() {
		super.stateBegin();
		// TODO 开始游戏
		System.out.println("start game");
		m_Controller.setState(new BattleState(m_Controller), "BattleScene");
	}

}
