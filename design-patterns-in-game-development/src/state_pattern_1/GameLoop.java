package state_pattern_1;

/**
 * 游戏主循环类
 * @author	 JM
 */
public class GameLoop {
	SceneStateController m_sceneStateController = new SceneStateController();
	
	public void awake(){
		// TODO
	}
	
	public void start(){
		m_sceneStateController.setState(new StartState(m_sceneStateController), "start");
	}
	
	public void update(){
		m_sceneStateController.stateUpdate();
	}
}
