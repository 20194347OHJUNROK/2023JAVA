package InnerInterface;

public class Button {
//	public void touch(Call call)
//	{
//		call.onClick();
//	}
//	
//	public void touch(Message message)
//	{
//		message.onClick();
//	}
	
	OnClickListener listener;
	
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch()
	{
		listener.onClick();
	}
	
	static public interface OnClickListener {
		void onClick();
	}
}
