package state_pattern_1;

/**
 * 战斗状态
 * 
 * @author JM
 */
public class BattleState extends ISceneState {

	public BattleState(SceneStateController controller) {
		super(controller);
		this.m_StateName = "BattleState";
	}

	public void stateBegin() {
		super.stateBegin();
		initinalGame();
	}

	public void stateEnd() {
		super.stateEnd();
		releaseGame();
	}

	public void stateUpdate() {
		super.stateUpdate();
		while (true) {
			inputProcess();
			updateGame();
			if (gameIsOver()) {
				break;
			}
		}
		m_Controller.setState(new MainMenuState(m_Controller), "MainMenuScene");
	}

	// 输入
	private void inputProcess() {
		// TODO 获取玩家输入并判断
	}

	public void updateGame() {
		// TODO 进行游戏逻辑
	}

	public boolean gameIsOver() {
		// TODO 判断游戏是否结束
		return true;
	}

	public void initinalGame() {
		// TODO 初始化游戏主程序
	}

	public void releaseGame() {
		// TODO 游戏结束时，释放游戏主程序
	}

}
