package state_pattern_1;

/**
 * 场景类的接口，定义场景转换和执行时需要调用的方法
 * 
 * @author JM
 */
public abstract class ISceneState {
	// 状态名称
	protected String m_StateName = "ISceneState";

	// 控制者
	protected SceneStateController m_Controller = null;

	public String getM_StateName() {
		return m_StateName;
	}

	public void setM_StateName(String m_StateName) {
		this.m_StateName = m_StateName;
	}

	public ISceneState(SceneStateController controller) {
		this.m_Controller = controller;
	}

	// 开始 : 场景转换成功后会利用这个方法通知类对象。
	public void stateBegin() {
	}

	// 结束 : 场景将要被释放时会利用这个方法通知类对象。其中可以释放游戏不再使用的资源，或者重新设置游戏场景状态。
	public void stateEnd() {
	}

	// 更新 : 游戏定时更新时会利用这个方法通知类对象
	public void stateUpdate() {
	}

	public String toString() {
		return "[I_SceneState: StateName = " + m_StateName + "]";
	}
}
