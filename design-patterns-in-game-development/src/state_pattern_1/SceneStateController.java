package state_pattern_1;

public class SceneStateController {
	private ISceneState m_state;
	private boolean m_bRunBegin = false;

	private SceneStateController() {
		super();
	}

	// 对状态拥有者设置状态
	public void setState(ISceneState state, String loadSceneName) {
		m_bRunBegin = false;

		// 载入场景
		loadScene(state.getM_StateName());

		// 通知前一个状态结束
		if (m_state != null) {
			m_state.stateEnd();
		}
		m_state = state;
	}

	public void stateUpdate() {
		if(!isLoadIn()){
			return;
		}
		
		// 通知新的state开始
		if(m_state != null && m_bRunBegin == false){
			m_state.stateBegin();
			m_bRunBegin = true;
		}
		
		if(m_state != null){
			m_state.stateUpdate();
		}
	}
	
	public boolean isLoadIn(){
		// TODO 判断是否加载完成
		return false;
	}

	private void loadScene(String stateName) {
		// TODO 根据下一个状态载入场景
	}

}
